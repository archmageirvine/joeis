package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023333 Primes that remain prime through 5 iterations of function f(x) = 2x + 7.
 * @author Sean A. Irvine
 */
public class A023333 extends A023305 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(32).add(217))) {
        return p;
      }
    }
  }
}
