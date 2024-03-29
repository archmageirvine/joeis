package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023334 Primes that remain prime through 5 iterations of function f(x) = 2x + 9.
 * @author Sean A. Irvine
 */
public class A023334 extends A023306 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(32).add(279))) {
        return p;
      }
    }
  }
}
