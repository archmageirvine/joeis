package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036375 Number of ternary rooted trees with n nodes and height at most 7.
 * @author Sean A. Irvine
 */
public class A036375 extends A036370 {

  private final int mLimit = max(7);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(7, mN);
  }
}
