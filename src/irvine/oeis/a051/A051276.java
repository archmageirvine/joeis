package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a210.A210850;

/**
 * A051276 Nonzero coefficients in one of the 5-adic expansions of sqrt(-1).
 * @author Sean A. Irvine
 */
public class A051276 extends A210850 {

  @Override
  public Z next() {
    while (true) {
      final Z d = super.next();
      if (!d.isZero()) {
        return d;
      }
    }
  }
}
