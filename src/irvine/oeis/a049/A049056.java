package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049056 Number of minimal ordered covers of a labeled n-set.
 * @author Sean A. Irvine
 */
public class A049056 extends A049055 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
