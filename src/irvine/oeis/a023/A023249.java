package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023249 Numbers n such that n remains prime through 2 iterations of function f(x) = 3x + 10.
 * @author Sean A. Irvine
 */
public class A023249 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(3).add(10)) && mFast.isPrime(p.multiply(9).add(40))) {
        return p;
      }
    }
  }
}
