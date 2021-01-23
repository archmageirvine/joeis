package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023283 Numbers n such that n remains prime through 3 iterations of function f(x) = 5x + 2.
 * @author Sean A. Irvine
 */
public class A023283 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(5).add(2)) && mFast.isPrime(p.multiply(25).add(12)) && mFast.isPrime(p.multiply(125).add(62))) {
        return p;
      }
    }
  }
}
