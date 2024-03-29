package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023343 Primes that remain prime through 5 iterations of function f(x) = 5x + 6.
 * @author Sean A. Irvine
 */
public class A023343 extends A023315 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(3125).add(4686))) {
        return p;
      }
    }
  }
}
