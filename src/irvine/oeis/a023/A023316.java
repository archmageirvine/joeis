package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023316 Primes that remain prime through 4 iterations of function f(x) = 5x + 8.
 * @author Sean A. Irvine
 */
public class A023316 extends A023286 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(625).add(1248))) {
        return p;
      }
    }
  }
}
