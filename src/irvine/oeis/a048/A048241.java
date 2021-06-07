package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048241 Number of colors that can be mixed with n &gt;= 0 units of yellow, blue, red.
 * @author Sean A. Irvine
 */
public class A048241 extends A048134 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
