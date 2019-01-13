package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a173.A173018;

/**
 * A000800.
 * @author Sean A. Irvine
 */
public class A000800 extends A173018 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN - k, k));
    }
    return sum;
  }
}

