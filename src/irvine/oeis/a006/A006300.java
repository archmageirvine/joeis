package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A006300 Number of rooted maps with n edges on torus.
 * @author Sean A. Irvine
 */
public class A006300 extends A269920 {

  /** Construct the sequence. */
  public A006300() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, 1, k));
    }
    return sum;
  }
}
