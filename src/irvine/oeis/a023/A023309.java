package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023309 Primes that remain prime through 4 iterations of function f(x) = 3x + 8.
 * @author Sean A. Irvine
 */
public class A023309 extends A023279 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(81).add(320))) {
        return p;
      }
    }
  }
}
