package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023323 Primes that remain prime through 4 iterations of function f(x) = 8x + 9.
 * @author Sean A. Irvine
 */
public class A023323 extends A023295 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4096).add(5265))) {
        return p;
      }
    }
  }
}
