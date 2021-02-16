package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023313 Primes that remain prime through 4 iterations of function f(x) = 5x + 2.
 * @author Sean A. Irvine
 */
public class A023313 extends A023283 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(625).add(312))) {
        return p;
      }
    }
  }
}
