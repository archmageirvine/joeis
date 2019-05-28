package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023272 Numbers n such that n remains prime through 3 iterations of function <code>f(x) = 2x + 1</code>.
 * @author Sean A. Irvine
 */
public class A023272 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply2().add(1)) && mFast.isPrime(p.multiply(4).add(3)) && mFast.isPrime(p.multiply(8).add(7))) {
        return p;
      }
    }
  }
}
