package irvine.math.lattice;

/**
 * Defines a way to create independent (thread safe) instances of a walker.
 * @author Sean A. Irvine
 */
public interface WalkerCreator {

  /**
   * Return a new instance of a walker.
   * @return walker
   */
  Walker create();
}
