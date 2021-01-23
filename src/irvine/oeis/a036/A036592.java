package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036592 Number of binary rooted trees with n nodes and height at most 9.
 * @author Sean A. Irvine
 */
public class A036592 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 512 ? null : t(9, mN);
  }
}
