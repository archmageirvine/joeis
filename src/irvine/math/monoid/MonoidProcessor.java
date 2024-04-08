package irvine.math.monoid;

/**
 * Defines a method for processing monoids.
 * @author Sean A. Irvine
 */
public interface MonoidProcessor {

  /**
   * Method that is passed each monoid as it is generated.
   * Implementations should not modify the internals of the monoid.
   * @param monoid a monoid
   */
  void process(final int[][] monoid);
}
