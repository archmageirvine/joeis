package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023208.
 * @author Sean A. Irvine
 */
public class A023208 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mFast.isPrime(p.multiply(3).add(2))) {
        return p;
      }
    }
  }
}
