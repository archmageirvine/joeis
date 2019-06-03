package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023341 Numbers n such that n remains prime through 5 iterations of function <code>f(x) = 5x + 2</code>.
 * @author Sean A. Irvine
 */
public class A023341 extends A023313 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(3125).add(1562))) {
        return p;
      }
    }
  }
}
