package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A389255 Triangle read by rows: T(n,k) = number of heapable permutations of length n with exactly k decreasing runs.
 * @author Sean A. Irvine
 */
public class A389255 extends A336282 {

  private long[] mRow = new long[0];
  private int mM = 0;

  /** Construct the sequence. */
  public A389255() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    final int contrib = contribution(p);
    if (contrib > 0) {
      synchronized (A389255.this) {
        ++mRow[contrib - 1];
      }
    }
    return 0;
  }

  protected int contribution(final int[] p) {
    return Permutation.countDecreasingRuns(p);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new long[mN + 1];
      super.next(); // trigger the parallel search
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
