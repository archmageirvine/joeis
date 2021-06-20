package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019311 Number of words of length n (n &gt;= 1) over a two-letter alphabet having a minimal period of size n-2.
 * @author Sean A. Irvine
 */
public class A019311 implements Sequence {

  private long[] mCounts = new long[0];
  private long mMask = 0;

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

  private void computeNextRow() {
    mCounts = new long[mCounts.length + 1];
    mMask = (1L << mCounts.length) - 1;
    for (long t = 0; t <= mMask; ++t) {
      ++mCounts[slide(t)];
    }
  }

  @Override
  public Z next() {
    computeNextRow();
    return mCounts.length <= 2 ? Z.ZERO : Z.valueOf(mCounts[2]);
  }
}
