package irvine.oeis.a002;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;

/**
 * A002052 Prime determinants of forms with class number 2.
 * @author Sean A. Irvine
 */
public class A002052 extends A002145 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z d = p.multiply(4);
      if (QuadraticFieldUtils.classNumber(d) * (QuadraticFieldUtils.fundamentalUnitNorm(d).signum() < 0 ? 1 : 2) == 2) {
        return p;
      }
    }
  }
}
