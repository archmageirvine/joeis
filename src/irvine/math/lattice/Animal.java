package irvine.math.lattice;

import java.util.HashSet;

/**
 * An animal or polyomino.
 * @author Sean A. Irvine
 */
public class Animal extends HashSet<Long> {

  public Animal() {

  }

  public Animal(final Animal animal, final long q) {
    addAll(animal);
    add(q);
  }
}
