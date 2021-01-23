package irvine.math.lattice;

import java.util.Set;

/**
 * For processing a single animal.
 * @author Sean A. Irvine
 */
public interface Keeper {

  /**
   * Decide what to do with an animal.
   * @param animal the animal
   * @param forbidden currently forbidden locations (most users can ignore this)
   */
  void process(final Animal animal, final Set<Long> forbidden);
}
