package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023332 Numbers n such that n remains prime through 5 iterations of function <code>f(x) = 2x + 5</code>.
 * @author Sean A. Irvine
 */
public class A023332 extends A023304 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(32).add(155))) {
        return p;
      }
    }
  }
}
