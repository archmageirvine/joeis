package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023308 Primes that remain prime through 4 iterations of the function f(x) = 3x + 4.
 * @author Sean A. Irvine
 */
public class A023308 extends A023278 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(81).add(160))) {
        return p;
      }
    }
  }
}
