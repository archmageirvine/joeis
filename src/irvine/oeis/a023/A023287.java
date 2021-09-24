package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023287 Primes that remain prime through 3 iterations of function f(x) = 6x + 1.
 * @author Sean A. Irvine
 */
public class A023287 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(6).add(1)) && mPrime.isPrime(p.multiply(36).add(7)) && mPrime.isPrime(p.multiply(216).add(43))) {
        return p;
      }
    }
  }
}
