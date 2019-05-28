package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023245 Numbers n such that n remains prime through 2 iterations of the function <code>f(x) = 2x + 9</code>.
 * @author Sean A. Irvine
 */
public class A023245 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply2().add(9)) && mFast.isPrime(p.multiply(4).add(27))) {
        return p;
      }
    }
  }
}
