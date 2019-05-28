package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023285 Numbers n such that n remains prime through 3 iterations of function <code>f(x) = 5x + 6</code>.
 * @author Sean A. Irvine
 */
public class A023285 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(5).add(6)) && mFast.isPrime(p.multiply(25).add(36)) && mFast.isPrime(p.multiply(125).add(186))) {
        return p;
      }
    }
  }
}
