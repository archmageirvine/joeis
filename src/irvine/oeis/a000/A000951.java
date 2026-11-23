package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000951 Number of forests with n nodes and height at most 4.
 * @author Sean A. Irvine
 */
public class A000951 extends A000950 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, 4);
  }
}
