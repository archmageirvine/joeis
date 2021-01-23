package irvine.math.lattice;

/**
 * Defines a way to create independent (thread safe) instances of a hunter.
 * @author Sean A. Irvine
 */
public interface HunterCreator {

  /**
   * Return a new instance of a hunter.
   * @return walker
   */
  Hunter create();
}
