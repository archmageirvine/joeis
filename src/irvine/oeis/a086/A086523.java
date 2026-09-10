package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086523 Beginning with 5, distinct odd primes such that the arithmetic mean of every pair of successive terms is prime.
 * @author Sean A. Irvine
 */
public class A086523 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mLeastUnused = 7;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FIVE;
      return Z.FIVE;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mPrime.nextPrime(mLeastUnused);
    }
    long k = mLeastUnused;
    while (mUsed.contains(k) || !mA.add(k).divide2().isProbablePrime()) {
      k = mPrime.nextPrime(k);
    }
    mUsed.add(k);
    mA = Z.valueOf(k);
    return mA;
  }
}

