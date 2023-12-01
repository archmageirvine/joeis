package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A067024 Smallest prime p such that p+2 has exactly n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A067024 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mBest = null;

  private void searchDistinct(final Z prod, final int omega, final long p) {
    if (omega == mN) {
      if ((mBest == null || mBest.compareTo(prod) > 0) && prod.subtract(2).isProbablePrime()) {
        mBest = prod;
      }
      return;
    }
    final int remaining = mN - omega;
    long q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      if (mBest != null && prod.multiply(Z.valueOf(q).pow(remaining)).compareTo(mBest) >= 0) {
        return;
      }
      searchDistinct(prod.multiply(q), omega + 1, q);
    }
  }

  private void searchAllowRepeats(final Z prod, final int omega, final long p) {
    if (omega == mN) {
      if (mBest.compareTo(prod) > 0 && prod.subtract(2).isProbablePrime()) {
        StringUtils.message("searchAllowRepeats found a better solution, please report this!");
        mBest = prod;
      }
      return;
    }
    final int remaining = mN - omega;
    if (prod.multiply(Z.valueOf(p).pow(remaining)).compareTo(mBest) >= 0) {
      return;
    }
    searchDistinct(prod.multiply(p), omega, p);
    long q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      if (prod.multiply(Z.valueOf(q).pow(remaining)).compareTo(mBest) >= 0) {
        return;
      }
      searchDistinct(prod.multiply(q), omega + 1, q);
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.TWO;
    }
    mBest = null;
    // First find a solution where the primes occur exactly once
    searchDistinct(Z.ONE, 0, 2);
    // Check that there is no better solution with a prime repeated (probably unnecessary)
    searchAllowRepeats(Z.ONE, 0, 2);
    return mBest.subtract(2);
  }
}
