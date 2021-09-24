package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023348 Primes that remain prime through 5 iterations of function f(x) = 8x + 3.
 * @author Sean A. Irvine
 */
public class A023348 extends A023320 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(32768).add(14043))) {
        return p;
      }
    }
  }
}
