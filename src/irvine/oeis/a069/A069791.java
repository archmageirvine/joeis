package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069791 Primes which yield primes each time the process of removing two outermost digits is carried out until finally a two digit prime (possibly with a leading 0) is obtained.
 * @author Sean A. Irvine
 */
public class A069791 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mLim = 10000;
  private long mP = 1000;

  private boolean is(final long p) {
    final String s = String.valueOf(p);
    for (int k = 1; 2 * k < s.length(); ++k) {
      if (!mPrime.isPrime(Long.parseLong(s.substring(k, s.length() - 1)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP >= mLim) {
        mLim *= 10;
        mP = mPrime.nextPrime(mLim);
        mLim *= 10;
      }
      if (is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}

