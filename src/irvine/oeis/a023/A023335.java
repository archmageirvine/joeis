package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023335 Numbers n such that n remains prime through 5 iterations of function f(x) = 3x + 2.
 * @author Sean A. Irvine
 */
public class A023335 extends A023307 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(243).add(242))) {
        return p;
      }
    }
  }
}
