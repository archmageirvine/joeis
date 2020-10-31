package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036423 Number of ternary rooted trees with n nodes and height exactly 8.
 * @author Sean A. Irvine
 */
public class A036423 extends A036370 {

  private final int mLimit = max(8);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(8, mN).subtract(get(7, mN));
  }
}
