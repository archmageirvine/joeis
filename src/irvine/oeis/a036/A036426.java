package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036426 Number of ternary rooted trees with n nodes and height exactly 11.
 * @author Sean A. Irvine
 */
public class A036426 extends A036370 {

  private final int mLimit = max(11);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(11, mN).subtract(get(10, mN));
  }
}
