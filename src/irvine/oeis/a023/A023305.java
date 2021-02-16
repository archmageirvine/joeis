package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023305 Primes that remain prime through 4 iterations of function f(x) = 2x + 7.
 * @author Sean A. Irvine
 */
public class A023305 extends A023275 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(16).add(105))) {
        return p;
      }
    }
  }
}
