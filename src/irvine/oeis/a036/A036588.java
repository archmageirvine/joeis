package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036588 Number of binary rooted trees with n nodes and height at most 5.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A036588 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 32 ? null : t(5, mN);
  }
}
