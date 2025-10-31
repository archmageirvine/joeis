package irvine.oeis.a389;

import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A389792 Total number of ascents in all heapable permutations of length n.
 * @author Sean A. Irvine
 */
public class A389792 extends A336282 {

  /** Construct the sequence. */
  public A389792() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return Permutation.countAscents(p);
  }
}
