package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A345530 Triangle T(n,k) read by rows of the number of n-bit words with maximum overlap k.
 * @author Sean A. Irvine
 */
public class A345530 extends Sequence1 {

  protected long[] mCounts = new long[0];
  private long mMask = 0;
  private int mM = 0;

  private int slide(final long t) {
    int n = mCounts.length;
    long m = mMask;
    long u = t;
    while (true) {
      m >>>= 1;
      u >>>= 1;
      --n;
      if (((t ^ u) & m) == 0) {
        return n;
      }
    }
  }

  protected void computeNextRow() {
    mCounts = new long[mCounts.length + 1];
    mMask = (1L << mCounts.length) - 1;
    for (long t = 0; t <= mMask / 2; ++t) {
      ++mCounts[slide(t)];
    }
  }

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      computeNextRow();
      mM = 0;
    }
    return Z.valueOf(2L * mCounts[mM]);
  }
}
