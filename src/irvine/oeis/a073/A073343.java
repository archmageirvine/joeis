package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073343 Number of permutations p of (1,2,3,...,n) such that Sum_{k=1..n} gcd(k,p(k)) = sigma(n).
 * @author Sean A. Irvine
 */
public class A073343 extends Sequence1 {

  private int mN = 0;
  private Z mCount = Z.ZERO;
  private long mSigma = 0;

  private void search(final int remaining, final long used, final long sum) {
    if (remaining == 0) {
      if (sum == mSigma) {
        mCount = mCount.add(1);
      }
      return;
    }
    // Consider possible elements for position mN - remaining
    final int pos = mN - remaining;
    for (int k = 0; k < mN; ++k) {
      if ((used & (1L << k)) == 0) {
        // We have not yet used element k
        final long g = sum + Functions.GCD.l(pos + 1, k + 1);
        if (g + remaining - 1 <= mSigma) {
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
    mSigma = Functions.SIGMA.l(mN);
    mCount = Z.ZERO;
    search(mN, 0L, 0L);
    return mCount;
  }
}

