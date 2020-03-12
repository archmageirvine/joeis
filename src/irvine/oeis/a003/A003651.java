package irvine.oeis.a003;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;

/**
 * A003651.
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
