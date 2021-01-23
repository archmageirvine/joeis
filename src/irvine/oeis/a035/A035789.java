package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035789 Start of a string of exactly 1 consecutive (but disjoint) pair of twin primes.
 * @author Sean A. Irvine
 */
public class A035789 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 23;

  @Override
  public Z next() {
    while (true) {
      final long p = mP;
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mP + 2)
        && !mPrime.isPrime(mP + 4)
        && !mPrime.isPrime(mP - 2)
        && !mPrime.isPrime(p - 2)
        && !mPrime.isPrime(mPrime.nextPrime(mP + 2) + 2)) {
        return Z.valueOf(mP);
      }
    }
  }
}

