package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A050937 Nonprime Fibonacci numbers with a prime index.
 * @author Sean A. Irvine
 */
public class A050937 extends A000045 {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  {
    setOffset(1);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z f = super.next();
      if (mPrime.isPrime(++mN) && !f.isProbablePrime()) {
        return f;
      }
    }
  }
}
