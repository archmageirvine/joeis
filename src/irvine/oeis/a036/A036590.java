package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036590 Number of binary rooted trees with n nodes and height at most 7.
 * @author Sean A. Irvine
 */
public class A036590 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 128 ? null : t(7, mN);
  }
}
