package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023342 Numbers n such that n remains prime through 5 iterations of function <code>f(x) = 5x + 4</code>.
 * @author Sean A. Irvine
 */
public class A023342 extends A023314 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(3125).add(3124))) {
        return p;
      }
    }
  }
}
