package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036420 Number of ternary rooted trees with n nodes and height exactly 5.
 * @author Sean A. Irvine
 */
public class A036420 extends A036370 {

  private final int mLimit = max(5);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(5, mN).subtract(get(4, mN));
  }
}
