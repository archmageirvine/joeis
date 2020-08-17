package irvine.math.lattice;

/**
 * For processing a single animal.
 * @author Sean A. Irvine
 */
public interface Keeper {

  /**
   * Decide what to do with an animal.
   * @param animal the animal
   */
  void process(final Animal animal);
}
