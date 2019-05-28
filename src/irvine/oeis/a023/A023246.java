package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023246 Numbers n such that n remains prime through 2 iterations of function <code>f(x) = 3x + 2</code>.
 * @author Sean A. Irvine
 */
public class A023246 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(3).add(2)) && mFast.isPrime(p.multiply(9).add(8))) {
        return p;
      }
    }
  }
}
