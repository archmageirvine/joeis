package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036425 Number of ternary rooted trees with n nodes and height exactly 10.
 * @author Sean A. Irvine
 */
public class A036425 extends A036370 {

  private final int mLimit = max(10);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(10, mN).subtract(get(9, mN));
  }
}
