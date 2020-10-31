package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036422 Number of ternary rooted trees with n nodes and height exactly 7.
 * @author Sean A. Irvine
 */
public class A036422 extends A036370 {

  private final int mLimit = max(7);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(7, mN).subtract(get(6, mN));
  }
}
