package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023311 Primes that remain prime through 4 iterations of function f(x) = 4x + 3.
 * @author Sean A. Irvine
 */
public class A023311 extends A023281 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(256).add(255))) {
        return p;
      }
    }
  }
}
