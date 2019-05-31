package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023297 Numbers n such that n remains prime through 3 iterations of function <code>f(x) = 9x + 4</code>.
 * @author Sean A. Irvine
 */
public class A023297 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(9).add(4)) && mFast.isPrime(p.multiply(81).add(40)) && mFast.isPrime(p.multiply(729).add(364))) {
        return p;
      }
    }
  }
}
