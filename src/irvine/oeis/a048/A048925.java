package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a003.A003657;

/**
 * A048925 Discriminants of imaginary quadratic fields with class number 24 (negated).
 * @author Sean A. Irvine
 */
public class A048925 extends A003657 {

  @Override
  public Z next() {
    while (true) {
      final Z d = super.next();
      if (LongUtils.classNumber(-d.longValueExact()) == 24) {
        return d;
      }
    }
  }
}

