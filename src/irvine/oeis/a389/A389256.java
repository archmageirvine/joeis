package irvine.oeis.a389;

import irvine.oeis.a388.A388139;
import irvine.util.Permutation;

/**
 * A386382.
 * @author Sean A. Irvine
 */
public class A389256 extends A388139 {

  /** Construct the sequence. */
  public A389256() {
    super(1);
  }

  @Override
  protected long contribution(final int[] p) {
    return Permutation.countIncreasingRuns(p);
  }
}
