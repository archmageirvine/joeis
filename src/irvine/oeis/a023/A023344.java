package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023344 Primes that remain prime through 5 iterations of function f(x) = 5x + 8.
 * @author Sean A. Irvine
 */
public class A023344 extends A023316 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(3125).add(6248))) {
        return p;
      }
    }
  }
}
