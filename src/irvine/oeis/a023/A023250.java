package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023250 Numbers n such that n remains prime through 2 iterations of function <code>f(x) = 4x + 3</code>.
 * @author Sean A. Irvine
 */
public class A023250 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(4).add(3)) && mFast.isPrime(p.multiply(16).add(15))) {
        return p;
      }
    }
  }
}
