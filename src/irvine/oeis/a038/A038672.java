package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A038672 Primes p such that the p-th Fibonacci number is composite.
 * @author Sean A. Irvine
 */
public class A038672 extends A000045 {

  private final Fast mPrime = new Fast();
  private long mN = 2;
  {
    setOffset(1);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (mPrime.isPrime(++mN) && !f.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
