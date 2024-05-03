package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069488 Primes &gt; 100 in which every substring of length 2 is also prime.
 * @author Sean A. Irvine
 */
public class A069488 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 100;

  private boolean is(final long p) {
    long q = p;
    while (q >= 10) {
      if (!mPrime.isPrime(q % 100)) {
        return false;
      }
      q /= 10;
    }
    return true;
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

