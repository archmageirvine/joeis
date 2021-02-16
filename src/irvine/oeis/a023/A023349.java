package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023349 Primes that remain prime through 5 iterations of function f(x) = 8x + 5.
 * @author Sean A. Irvine
 */
public class A023349 extends A023321 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(32768).add(23405))) {
        return p;
      }
    }
  }
}
