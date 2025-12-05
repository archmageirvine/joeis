package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390935 a(n) is the first prime that is (product minus sum) of a sequence of 2*n consecutive primes.
 * @author Sean A. Irvine
 */
public class A390935 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Z prod = Z.ONE;
    Z sum = Z.ZERO;
    long p = 1;
    for (long k = 0; k < mN; ++k) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p);
      sum = sum.add(p);
    }
    long q = 1;
    while (true) {
      final Z t = prod.subtract(sum);
      if (t.isProbablePrime()) {
        return t;
      }
      q = mPrime.nextPrime(q);
      p = mPrime.nextPrime(p);
      prod = prod.divide(q).multiply(p);
      sum = sum.subtract(q).add(p);
    }
  }
}

