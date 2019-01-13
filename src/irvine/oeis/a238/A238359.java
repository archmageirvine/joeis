package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A238359.
 * @author Sean A. Irvine
 */
public class A238359 extends A269920 {

  private int mN = 17;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, 9, k));
    }
    return sum;
  }
}
