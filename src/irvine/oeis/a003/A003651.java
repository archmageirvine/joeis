package irvine.oeis.a003;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;

/**
 * A003651 Class number of real quadratic field with discriminant 4n, n == 2,3 ( mod 4).
 * @author Sean A. Irvine
 */
public class A003651 extends A003658 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(4) == 0) {
        return Z.valueOf(QuadraticFieldUtils.classNumber(n));
      }
    }
  }
}
