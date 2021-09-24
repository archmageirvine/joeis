package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023336 Primes that remain prime through 5 iterations of function f(x) = 3x + 4.
 * @author Sean A. Irvine
 */
public class A023336 extends A023308 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(243).add(484))) {
        return p;
      }
    }
  }
}
