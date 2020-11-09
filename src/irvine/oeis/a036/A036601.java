package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036601 Number of binary rooted trees with n nodes and height exactly 12.
 * @author Sean A. Irvine
 */
public class A036601 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 4096 ? null : t(12, mN).subtract(t(11, mN));
  }
}
