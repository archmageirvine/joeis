package irvine.oeis.a014;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a003.A003658;

/**
 * A014077 Norm of fundamental unit of real quadratic field with discriminant A003658(n), n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A014077 extends A003658 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitNorm(super.next());
  }
}
