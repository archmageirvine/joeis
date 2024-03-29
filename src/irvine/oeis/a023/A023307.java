package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023307 Primes that remain prime through 4 iterations of function f(x) = 3x + 2.
 * @author Sean A. Irvine
 */
public class A023307 extends A023277 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.isPrime(p.multiply(81).add(80))) {
        return p;
      }
    }
  }
}
