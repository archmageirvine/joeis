package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023315 Numbers n such that n remains prime through 4 iterations of function <code>f(x) = 5x + 6</code>.
 * @author Sean A. Irvine
 */
public class A023315 extends A023285 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(625).add(936))) {
        return p;
      }
    }
  }
}
