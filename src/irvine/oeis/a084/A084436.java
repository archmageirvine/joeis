package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084436 Smallest prime which is one more than the square of a squarefree number with n prime divisors.
 * @author Sean A. Irvine
 */
public class A084436 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;
  private Z mBest = null;

  private void search(final Z prod, final int remaining, final long p) {
    if (remaining == 0) {
      if ((mBest == null || prod.compareTo(mBest) < 0) && prod.square().add(1).isProbablePrime()) {
        mBest = prod;
      }
      return;
    }
    long q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      final Z lower = prod.multiply(Z.valueOf(q).pow(remaining));
      if (mBest != null && lower.compareTo(mBest) > 0) {
        break;
      }
      search(prod.multiply(q), remaining - 1, q);
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBest = null;
    search(Z.ONE, mN, 1);
    return mBest.square().add(1);
  }
}
