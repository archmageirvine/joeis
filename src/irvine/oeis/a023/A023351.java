package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023351 Numbers n such that n remains prime through 5 iterations of function f(x) = 8x + 9.
 * @author Sean A. Irvine
 */
public class A023351 extends A023323 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(32768).add(42129))) {
        return p;
      }
    }
  }
}
