package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036594 Number of binary rooted trees with n nodes and height exactly 5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A036594 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 32 ? null : t(5, mN).subtract(t(4, mN));
  }
}
