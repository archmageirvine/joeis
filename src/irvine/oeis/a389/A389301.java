package irvine.oeis.a389;

import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A389301 Total number of consecutive pairs across all heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A389301 extends A336282 {

  /** Construct the sequence. */
  public A389301() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return Permutation.countPairs(p);
  }
}
