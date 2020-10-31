package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036424 Number of ternary rooted trees with n nodes and height exactly 9.
 * @author Sean A. Irvine
 */
public class A036424 extends A036370 {

  private final int mLimit = max(9);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(9, mN).subtract(get(8, mN));
  }
}
