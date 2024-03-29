package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023339 Primes that remain prime through 5 iterations of function f(x) = 4x + 3.
 * @author Sean A. Irvine
 */
public class A023339 extends A023311 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(1024).add(1023))) {
        return p;
      }
    }
  }
}
