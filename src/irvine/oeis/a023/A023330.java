package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023330 Primes that remain prime through 5 iterations of function f(x) = 2x + 1.
 * @author Sean A. Irvine
 */
public class A023330 extends A023302 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(32).add(31))) {
        return p;
      }
    }
  }
}
