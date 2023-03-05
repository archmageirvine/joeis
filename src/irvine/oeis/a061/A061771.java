package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061771 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      final long d = q.subtract(p).longValueExact();
      if ((d & (d - 1)) == 0) {
        return p;
      }
    }
  }
}
