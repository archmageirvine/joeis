package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036596 Number of binary rooted trees with n nodes and height exactly 7.
 * @author Sean A. Irvine
 */
public class A036596 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 128 ? null : t(7, mN).subtract(t(6, mN));
  }
}
