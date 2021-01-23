package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023255 Numbers n such that n remains prime through 2 iterations of the function f(x) = 5x + 8.
 * @author Sean A. Irvine
 */
public class A023255 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(5).add(8)) && mFast.isPrime(p.multiply(25).add(48))) {
        return p;
      }
    }
  }
}
