package irvine.oeis.a035;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a003.A003658;

/**
 * A035120 Discriminants of real quadratic number fields with class number &gt;= 2.
 * @author Sean A. Irvine
 */
public class A035120 extends A003658 {

  // WARNING: Do not use this to extend the sequence, the underlying implementation
  // contains heuristics.

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Z d = super.next();
      if (QuadraticFieldUtils.classNumber(d) >= 2) {
        return d;
      }
    }
  }
}
