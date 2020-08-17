package irvine.math.lattice;

import java.util.HashSet;

/**
 * An animal or polyomino.
 * @author Sean A. Irvine
 */
public class Animal extends HashSet<Long> {

  /** Construct an empty animal. */
  public Animal() {
  }

  /**
   * Construct a new animal from an existing animal with one extra point.
   * @param animal existing animals
   * @param q extra point
   */
  public Animal(final Animal animal, final long q) {
    addAll(animal);
    add(q);
  }
}
