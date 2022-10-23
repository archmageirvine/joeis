package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054723 Prime exponents of composite Mersenne numbers.
 * @author Sean A. Irvine
 */
public class A054723 extends Sequence1 {

  private final Fast mPrime = new Fast(); // this knows about Mersenne primes
  private long mN = 1;
  private Z mZ = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mZ = mZ.multiply2().add(1); // mZ = 11111... in binary
      if (mPrime.isPrime(++mN) && !mPrime.isPrime(mZ)) {
        return Z.valueOf(mN);
      }
    }
  }
}

