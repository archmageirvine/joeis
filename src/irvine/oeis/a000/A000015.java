package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A000015 Smallest prime power &gt;= n.
 * @author Sean A. Irvine
 */
public class A000015 implements Sequence {

  private int mN = 0;
  private final DynamicLongArray mPrimePowers = new DynamicLongArray();
  private final DynamicLongArray mPrimes = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private int mLastPrimeIndex = 0;

  protected int lastPrimeIndex() {
    return mLastPrimeIndex;
  }

  protected long nextLong() {
    if (++mN <= 1) {
      return 1;
    }
    // Update for new primes
    while (mP < mN) {
      mP = mPrime.nextPrime(mP);
      mPrimePowers.set(mPrimePowers.length(), mP);
      mPrimes.set(mPrimes.length(), mP);
    }
    // Update existing primes and find best
    long minDelta = Long.MAX_VALUE;
    long bestPP = 0;
    for (int k = 0; k < mPrimePowers.length(); ++k) {
      long pp = mPrimePowers.get(k);
      if (pp < mN) {
        pp *= mPrimes.get(k);
        mPrimePowers.set(k, pp);
      }
      if (pp - mN < minDelta) {
        minDelta = pp - mN;
        bestPP = pp;
        mLastPrimeIndex = k;
      }
    }
    return bestPP;
  }

  @Override
  public Z next() {
    return Z.valueOf(nextLong());
  }
}

