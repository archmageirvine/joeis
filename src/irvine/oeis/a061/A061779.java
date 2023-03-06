package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061779 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (mPrime.nextPrime(p).subtract(p).longValueExact() == 22) {
        return p;
      }
    }
  }
}
