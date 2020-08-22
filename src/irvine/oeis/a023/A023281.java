package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023281 Numbers n such that n remains prime through 3 iterations of function f(x) = 4x + 3.
 * @author Sean A. Irvine
 */
public class A023281 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4).add(3)) && mFast.isPrime(p.multiply(16).add(15)) && mFast.isPrime(p.multiply(64).add(63))) {
        return p;
      }
    }
  }
}
