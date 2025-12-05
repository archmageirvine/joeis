package irvine.oeis.a387;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387590 a(n) is the first prime that is (product + sum) of 2*n consecutive primes.
 * @author Sean A. Irvine
 */
public class A387590 extends Sequence1 {

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
      final Z t = prod.add(sum);
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

