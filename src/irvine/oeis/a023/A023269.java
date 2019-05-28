package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023269 Numbers n such that n remains prime through 2 iterations of function <code>f(x) = 10x + 3</code>.
 * @author Sean A. Irvine
 */
public class A023269 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(10).add(3)) && mFast.isPrime(p.multiply(100).add(33))) {
        return p;
      }
    }
  }
}
