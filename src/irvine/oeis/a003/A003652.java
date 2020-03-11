package irvine.oeis.a003;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;

/**
 * A003652.
 * @author Sean A. Irvine
 */
public class A003652 extends A003658 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    final Z n = super.next();
    return Z.valueOf(QuadraticFieldUtils.classNumber(n));
  }
}
