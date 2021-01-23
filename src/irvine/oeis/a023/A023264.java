package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023264 Numbers n such that n remains prime through 2 iterations of function f(x) = 8x + 9.
 * @author Sean A. Irvine
 */
public class A023264 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(8).add(9)) && mFast.isPrime(p.multiply(64).add(81))) {
        return p;
      }
    }
  }
}
