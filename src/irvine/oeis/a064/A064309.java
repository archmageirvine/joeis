package irvine.oeis.a064;

import irvine.math.z.Z;

/**
 * A064309 Row sums of triangle A064308.
 * @author Sean A. Irvine
 */
public class A064309 extends A064308 {

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
