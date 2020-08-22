package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023275 Numbers n such that n remains prime through 3 iterations of function f(x) = 2x + 7.
 * @author Sean A. Irvine
 */
public class A023275 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply2().add(7)) && mFast.isPrime(p.multiply(4).add(21)) && mFast.isPrime(p.multiply(8).add(49))) {
        return p;
      }
    }
  }
}
