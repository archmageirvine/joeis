package irvine.oeis.a003;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;

/**
 * A003652 Class number of real quadratic field with discriminant <code>A003658(n), n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A003652 extends A003658 {

  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    return Z.valueOf(QuadraticFieldUtils.classNumber(super.next()));
  }
}
