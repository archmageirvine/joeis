package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023219 Primes p such that 5p+6 is a prime.
 * @author Sean A. Irvine
 */
public class A023219 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(5).add(6))) {
        return p;
      }
    }
  }
}
