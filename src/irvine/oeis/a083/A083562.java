package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083562 Beginning of first chain of n consecutive primes whose product + 2 is prime.
 * @author Sean A. Irvine
 */
public class A083562 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    long q = 1;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      q = mPrime.nextPrime(q);
      prod = prod.multiply(q);
    }
    while (!prod.add(2).isProbablePrime()) {
      q = mPrime.nextPrime(q);
      prod = prod.divide(p).multiply(q);
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}
