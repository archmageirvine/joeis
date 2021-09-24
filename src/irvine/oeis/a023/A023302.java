package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023302 Primes that remain prime through 4 iterations of function f(x) = 2x + 1.
 * @author Sean A. Irvine
 */
public class A023302 extends A023272 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(16).add(15))) {
        return p;
      }
    }
  }
}
