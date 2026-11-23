package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000949 Number of forests with n nodes and height at most 2.
 * @author Sean A. Irvine
 */
public class A000949 extends A000950 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, 2);
  }
}
