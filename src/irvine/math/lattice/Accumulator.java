package irvine.math.lattice;

/**
 * Defines a single method for processing a walk.
 * @author Sean A. Irvine
 */
public interface Accumulator {

  /**
   * Accumulate a walk.
   * @param walk the points of the walk
   * @param weight weight associated with the walk
   * @param axesMask axes information (be careful using this, it is not always meaningful)
   */
  void accumulate(final long[] walk, final int weight, final int axesMask);
}
