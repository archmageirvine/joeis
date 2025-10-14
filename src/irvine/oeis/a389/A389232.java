package irvine.oeis.a389;

import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A389232 Total number of decreasing runs in all heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A389232 extends A336282 {

  /** Construct the sequence. */
  public A389232() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return Permutation.countDecreasingRuns(p);
  }
}
