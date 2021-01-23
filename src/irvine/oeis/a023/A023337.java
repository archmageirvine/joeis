package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023337 Numbers n such that n remains prime through 5 iterations of function f(x) = 3x + 8.
 * @author Sean A. Irvine
 */
public class A023337 extends A023309 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(243).add(968))) {
        return p;
      }
    }
  }
}
