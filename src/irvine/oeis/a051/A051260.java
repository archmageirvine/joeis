package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051260 Every 25th Fibocyclotomic number divided by 5.
 * @author Sean A. Irvine
 */
public class A051260 extends A051259 {

  @Override
  public Z next() {
    return super.next().divide(5);
  }
}
