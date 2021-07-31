package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049402 Row sums of triangle A049374.
 * @author Sean A. Irvine
 */
public class A049402 extends A049374 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
