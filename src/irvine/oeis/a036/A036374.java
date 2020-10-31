package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036374 Number of ternary rooted trees with n nodes and height at most 6.
 * @author Sean A. Irvine
 */
public class A036374 extends A036370 {

  private final int mLimit = max(6);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(6, mN);
  }
}
