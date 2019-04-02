package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014000 First coordinate of fundamental unit of real quadratic field with discriminant A003658(n), n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A014000 extends A014046 {

  @Override
  protected Z select(final Z[] res) {
    return res[0];
  }
}
