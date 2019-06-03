package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023309 Numbers n such that n remains prime through 4 iterations of function <code>f(x) = 3x + 8</code>.
 * @author Sean A. Irvine
 */
public class A023309 extends A023279 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(81).add(320))) {
        return p;
      }
    }
  }
}
