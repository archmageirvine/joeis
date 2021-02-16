package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023303 Primes that remain prime through 4 iterations of function f(x) = 2x + 3.
 * @author Sean A. Irvine
 */
public class A023303 extends A023273 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(16).add(45))) {
        return p;
      }
    }
  }
}
