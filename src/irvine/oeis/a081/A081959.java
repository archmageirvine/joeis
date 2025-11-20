package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081959 Row sums of A081957.
 * @author Sean A. Irvine
 */
public class A081959 extends A081957 {

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
