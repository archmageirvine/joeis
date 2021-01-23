package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036427 Number of ternary rooted trees with n nodes and height exactly 12.
 * @author Sean A. Irvine
 */
public class A036427 extends A036370 {

  private final int mLimit = max(12);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(12, mN).subtract(get(11, mN));
  }
}
