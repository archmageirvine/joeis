package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072031 Row sums of A072030.
 * @author Sean A. Irvine
 */
public class A072031 extends A072030 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
