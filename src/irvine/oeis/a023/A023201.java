package irvine.oeis.a023;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023201 Sexy primes: numbers n such that n and <code>n + 6</code> are both prime.
 * @author Sean A. Irvine
 */
public class A023201 implements Sequence {

  private Z mN = Z.TWO;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mPrime.nextPrime(mN);
      if (mPrime.isPrime(mN .add(6))) {
        return mN;
      }
    }
  }
}

