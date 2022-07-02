package irvine.math.lattice;

/**
 * For canonicalization.
 * @author Sean A. Irvine
 */
public interface CanonChecker {

  /**
   * Test if the given animal is canonical.
   * @param animal the animal
   * @return true iff the animal is canonical
   */
  boolean isFreeCanonical(final Animal animal);
}
