package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064095 Row sums of triangle A064094.
 * @author Sean A. Irvine
 */
public class A064095 extends A064094 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
