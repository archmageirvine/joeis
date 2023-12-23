package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067598.
 * @author Sean A. Irvine
 */
public class A067601 extends Sequence1 {

  private int mN = 0;
  private long mMask;
  private long mCount;

  private void search(final int prev, final long used, final long deltas) {
    if (used == mMask) {
      ++mCount;
      return;
    }
    long j = 2;
    for (int k = 1; k < mN; ++k, j <<= 1) {
      if ((used & j) == 0) {
        final long d = 1L << (prev < k ? k - prev : mN + k - prev); // i.e. (mod 2n)
        if ((deltas & d) == 0) {
          search(k, used | j, deltas | d);
        }
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    mMask = (1L << mN) - 1;
    mCount = 0;
    for (int second = 1; second <= mN / 2; ++second) {
      // We also bit 0 of the deltas so that later we will never permit a==b (mod 2n)
      search(second, 1L + (1L << second), 1L + 1L << (second - 1));
    }
    return Z.valueOf(mCount);
  }
}

