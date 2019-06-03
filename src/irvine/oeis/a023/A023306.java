package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023306 Numbers n such that n remains prime through 4 iterations of function <code>f(x) = 2x + 9</code>.
 * @author Sean A. Irvine
 */
public class A023306 extends A023276 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(16).add(135))) {
        return p;
      }
    }
  }
}
