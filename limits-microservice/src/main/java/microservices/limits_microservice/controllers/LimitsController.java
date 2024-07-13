package microservices.limits_microservice.controllers;

import microservices.limits_microservice.beans.Limits;
import microservices.limits_microservice.configuration.Configurations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/limits")
public class LimitsController {
    @Autowired
    private Configurations configurations;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
           return new Limits(configurations.getMinimum(),configurations.getMaximum());
    }
}
