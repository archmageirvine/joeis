package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023265 Numbers n such that n remains prime through 2 iterations of function <code>f(x) = 9x + 2</code>.
 * @author Sean A. Irvine
 */
public class A023265 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(9).add(2)) && mFast.isPrime(p.multiply(81).add(20))) {
        return p;
      }
    }
  }
}
