package irvine.oeis.a003;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;

/**
 * A003653 Discriminants of quadratic fields whose fundamental unit has norm -1.
 * @author Sean A. Irvine
 */
public class A003653 extends A003658 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (Z.NEG_ONE.equals(QuadraticFieldUtils.fundamentalUnitNorm(n))) {
        return n;
      }
    }
  }
}
