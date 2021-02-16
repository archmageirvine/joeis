package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023314 Primes that remain prime through 4 iterations of function f(x) = 5x + 4.
 * @author Sean A. Irvine
 */
public class A023314 extends A023284 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(625).add(624))) {
        return p;
      }
    }
  }
}
