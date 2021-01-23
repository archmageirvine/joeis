package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036419 Number of ternary rooted trees with n nodes and height exactly 4.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A036419 extends A036370 {

  private final int mLimit = max(4);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      return null;
    }
    return get(4, mN).subtract(get(3, mN));
  }
}
