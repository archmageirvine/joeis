package irvine.oeis.a014;

import irvine.math.group.QuadraticFieldUtils;
import irvine.math.z.Z;
import irvine.oeis.a003.A003658;

/**
 * A014046 Second coordinate of fundamental unit of real quadratic field with discriminant A003658(n), n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A014046 extends A003658 {

  /** Construct the sequence. */
  public A014046() {
    super(2);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return QuadraticFieldUtils.fundamentalUnitPair(super.next())[1];
  }
}
