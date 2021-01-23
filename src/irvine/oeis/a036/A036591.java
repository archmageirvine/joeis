package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036591 Number of binary rooted trees with n nodes and height at most 8.
 * @author Sean A. Irvine
 */
public class A036591 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 256 ? null : t(8, mN);
  }
}
