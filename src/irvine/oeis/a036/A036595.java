package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036595 Number of binary rooted trees with n nodes and height exactly 6.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A036595 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 64 ? null : t(6, mN).subtract(t(5, mN));
  }
}
