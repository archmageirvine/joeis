package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036587 Number of binary rooted trees with n nodes and height at most 4.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A036587 extends A036602 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN >= 16 ? null : t(4, mN);
  }
}
