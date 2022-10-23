package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035792 Start of a string of exactly 4 consecutive (but disjoint) pairs of twin primes.
 * @author Sean A. Irvine
 */
public class A035792 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 9413;

  @Override
  public Z next() {
    while (true) {
      final long p0 = mP;
      mP = mPrime.nextPrime(mP);
      if (!mPrime.isPrime(p0 - 2) && mPrime.isPrime(mP + 2)) {
        final long p2 = mPrime.nextPrime(mP + 2);
        if (mPrime.isPrime(p2 + 2)) {
          final long p4 = mPrime.nextPrime(p2 + 2);
          if (mPrime.isPrime(p4 + 2)) {
            final long p6 = mPrime.nextPrime(p4 + 2);
            if (mPrime.isPrime(p6 + 2)) {
              final long p8 = mPrime.nextPrime(p6 + 2);
              if (!mPrime.isPrime(p8 + 2)) {
                return Z.valueOf(mP);
              }
            }
          }
        }
      }
    }
  }
}

