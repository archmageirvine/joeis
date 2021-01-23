package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036599 Number of binary rooted trees with n nodes and height exactly 10.
 * @author Sean A. Irvine
 */
public class A036599 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 1024 ? null : t(10, mN).subtract(t(9, mN));
  }
}
