package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023350 Numbers n such that n remains prime through 5 iterations of function f(x) = 8x + 7.
 * @author Sean A. Irvine
 */
public class A023350 extends A023322 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(32768).add(32767))) {
        return p;
      }
    }
  }
}
