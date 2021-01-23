package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036597 Number of binary rooted trees with n nodes and height exactly 8.
 * @author Sean A. Irvine
 */
public class A036597 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 256 ? null : t(8, mN).subtract(t(7, mN));
  }
}
