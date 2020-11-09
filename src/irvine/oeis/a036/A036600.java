package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036600 Number of binary rooted trees with n nodes and height exactly 11.
 * @author Sean A. Irvine
 */
public class A036600 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 2048 ? null : t(11, mN).subtract(t(10, mN));
  }
}
