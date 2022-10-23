package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006794 Primorial -1 primes: primes p such that -1 + product of primes up to p is prime.
 * @author Sean A. Irvine
 */
public class A006794 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mPrimorial = Z.ONE;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mPrimorial = mPrimorial.multiply(mP);
      if (mPrimorial.subtract(1).isProbablePrime()) {
        return Z.valueOf(mP);
      }
    }
  }
}

