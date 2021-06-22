package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A345530 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A345530 implements Sequence {

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
