package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072950 Number of permutations p of (1,2,3,...,n) such that at least one value of abs(k-p(k)) is prime.
 * @author Sean A. Irvine
 */
public class A073344 extends Sequence1 {

  private int mN = 0;
  private Z mCount = Z.ZERO;

  private void search(final int remaining, final long used, final long sum) {
    if (remaining == 0) {
      if (sum == mN) {
        mCount = mCount.add(1);
      }
      return;
    }
    // Consider possible elements for position mN - remaining
    final int pos = mN - remaining;
    for (int k = 0; k < mN; ++k) {
      if ((used & (1L << k)) == 0) {
        // We have not yet used element k
        final long g = sum + (k + 1) % (pos + 1);
        if (g <= mN) {
          search(remaining - 1, used | (1L << k), g);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    mCount = Z.ZERO;
    search(mN, 0L, 0L);
    return mCount;
  }
}

