package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069490 Primes &gt; 1000 in which every substring of lengths 2 and 3 are also prime.
 * @author Sean A. Irvine
 */
public class A069490 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1000;

  private boolean is(final long p) {
    long q = p;
    while (q >= 100) {
      if (!mPrime.isPrime(q % 1000) || !mPrime.isPrime(q % 100)) {
        return false;
      }
      q /= 10;
    }
    return mPrime.isPrime(q);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}

