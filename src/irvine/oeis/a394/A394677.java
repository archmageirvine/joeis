package irvine.oeis.a394;

import irvine.math.z.Z;

/**
 * A394677 Row sums of A394670.
 * @author Sean A. Irvine
 */
public class A394677 extends A394670 {

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
