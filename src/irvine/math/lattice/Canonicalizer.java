package irvine.math.lattice;

/**
 * For canonicalization.
 * @author Sean A. Irvine
 */
public interface Canonicalizer {

  /**
   * Produce the canonical form of an animal
   * @param animal the animal
   */
  Animal canon(final Animal animal);
}
