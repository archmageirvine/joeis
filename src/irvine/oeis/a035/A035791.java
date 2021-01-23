package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035791 Start of a string of exactly 3 consecutive (but disjoint) pairs of twin primes.
 * @author Sean A. Irvine
 */
public class A035791 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 3;

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
            if (!mPrime.isPrime(p6 + 2)) {
              return Z.valueOf(mP);
            }
          }
        }
      }
    }
  }
}

