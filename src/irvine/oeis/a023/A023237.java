package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023237 Primes p such that 10*p + 1 is also prime.
 * @author Sean A. Irvine
 */
public class A023237 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(10).add(1))) {
        return p;
      }
    }
  }
}
