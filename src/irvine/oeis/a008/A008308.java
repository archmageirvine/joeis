package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a059.A059419;

/**
 * A008308 Triangle of tangent numbers.
 * @author Sean A. Irvine
 */
public class A008308 extends A059419 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ZERO.equals(t)) {
        return t;
      }
    }
  }
}
