package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007510 Single (or isolated or non-twin) primes: Primes p such that neither p-2 nor p+2 is prime.
 * @author Sean A. Irvine
 */
public class A007510 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (!mPrime.isPrime(mP - 2) && !mPrime.isPrime(mP + 2)) {
        return Z.valueOf(mP);
      }
    }
  }
}
