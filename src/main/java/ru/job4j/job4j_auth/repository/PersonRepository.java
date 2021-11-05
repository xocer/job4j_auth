package ru.job4j.job4j_auth.repository;

import org.springframework.data.repository.CrudRepository;
import ru.job4j.job4j_auth.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
