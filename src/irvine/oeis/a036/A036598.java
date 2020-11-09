package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036598 Number of binary rooted trees with n nodes and height exactly 9.
 * @author Sean A. Irvine
 */
public class A036598 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 512 ? null : t(9, mN).subtract(t(8, mN));
  }
}
