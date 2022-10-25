package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A027415 Number of rooted unlabeled trees on n nodes having a primary branch.
 * @author Sean A. Irvine
 */
public class A027415 extends A000081 {

  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.add(a(mN - k).multiply(a(k)));
    }
    return sum;
  }
}
