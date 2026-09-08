package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086498 Rearrangement of primes such that every (2n)-th partial sum is a prime. Every (2n+1)-st term is the smallest prime which has not been included earlier.
 * @author Sean A. Irvine
 */
public class A086498 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mLeastUnused = 2;
  protected Z mSum = Z.ZERO;
  private boolean mOdd = false;

  @Override
  public Z next() {
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mPrime.nextPrime(mLeastUnused);
    }
    mOdd = !mOdd;
    if (mOdd) {
      mSum = mSum.add(mLeastUnused);
      mUsed.add(mLeastUnused);
      return Z.valueOf(mLeastUnused);
    } else {
      long k = mLeastUnused;
      while (mUsed.contains(k) || !mSum.add(k).isProbablePrime()) {
        k = mPrime.nextPrime(k);
      }
      mUsed.add(k);
      mSum = mSum.add(k);
      return Z.valueOf(k);
    }
  }
}

