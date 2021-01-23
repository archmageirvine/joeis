package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036421 Number of ternary rooted trees with n nodes and height exactly 6.
 * @author Sean A. Irvine
 */
public class A036421 extends A036370 {

  private final int mLimit = max(6);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(6, mN).subtract(get(5, mN));
  }
}
