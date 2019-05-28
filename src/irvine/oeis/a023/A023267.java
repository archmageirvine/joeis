package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023267 Numbers n such that n remains prime through 2 iterations of function <code>f(x) = 9x + 8</code>.
 * @author Sean A. Irvine
 */
public class A023267 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(9).add(8)) && mFast.isPrime(p.multiply(81).add(80))) {
        return p;
      }
    }
  }
}
