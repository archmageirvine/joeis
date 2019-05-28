package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023243 Numbers n such that n remains prime through 2 iterations of the function <code>f(x) = 2x + 5</code>.
 * @author Sean A. Irvine
 */
public class A023243 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply2().add(5)) && mFast.isPrime(p.multiply(4).add(15))) {
        return p;
      }
    }
  }
}
