package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023325 Primes that remain prime through 4 iterations of function f(x) = 9x + 4.
 * @author Sean A. Irvine
 */
public class A023325 extends A023297 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(6561).add(3280))) {
        return p;
      }
    }
  }
}
