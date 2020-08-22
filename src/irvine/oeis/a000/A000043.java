package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000043 Mersenne exponents: primes p such that 2^p - 1 is prime. Then 2^p - 1 is called a Mersenne prime.
 * @author Sean A. Irvine
 */
public class A000043 implements Sequence {

  private final Fast mPrime = new Fast(); // this knows about Mersenne primes
  private long mN = 1;
  private Z mZ = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mZ = mZ.multiply2().add(1); // mZ = 11111... in binary
      if (mPrime.isPrime(++mN) && mPrime.isPrime(mZ)) {
        return Z.valueOf(mN);
      }
    }
  }

}

