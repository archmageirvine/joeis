package irvine.oeis.a003;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;

/**
 * A003650 Class number of real quadratic field with discriminant 4n+1.
 * @author Sean A. Irvine
 */
public class A003650 extends A003658 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.mod(4) == 1) {
        return Z.valueOf(QuadraticFieldUtils.classNumber(n));
      }
    }
  }
}
