package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A060068 Divide n! by largest power of n which will leave the result an integer.
 * @author Sean A. Irvine
 */
public class A060068 extends A000142 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z t = super.next();
    if (mN > 1) {
      while (t.mod(mN) == 0) {
        t = t.divide(mN);
      }
    }
    return t;
  }
}
