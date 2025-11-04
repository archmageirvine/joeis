package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a336.A336282;
import irvine.util.Permutation;

/**
 * A390146 Triangle read by rows: T(n,k) = number of heapable permutations of length n whose longest decreasing subsequence has length k.
 * @author Sean A. Irvine
 */
public class A390146 extends A336282 {

  private long[] mRow = new long[0];
  private int mM = 0;

  /** Construct the sequence. */
  public A390146() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    synchronized (A390146.this) {
      ++mRow[contribution(p) - 1];
    }
    return 0;
  }

  protected int contribution(final int[] p) {
    return Permutation.longestDecreasingSubsequence(p);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new long[1 + mN / 2];
      super.next(); // trigger the parallel search
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
