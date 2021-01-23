package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023242 Numbers n such that n remains prime through 2 iterations of function f(x) = 2x + 3.
 * @author Sean A. Irvine
 */
public class A023242 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply2().add(3)) && mFast.isPrime(p.multiply(4).add(9))) {
        return p;
      }
    }
  }
}
