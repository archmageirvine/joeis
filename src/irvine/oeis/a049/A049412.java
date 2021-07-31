package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049412 Row sums of triangle A049385.
 * @author Sean A. Irvine
 */
public class A049412 extends A049385 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
