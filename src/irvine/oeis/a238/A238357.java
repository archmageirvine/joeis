package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A238357 Number of genus-7 rooted maps with n edges.
 * @author Sean A. Irvine
 */
public class A238357 extends A269920 {

  private int mN = 13;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, 7, k));
    }
    return sum;
  }
}
