package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049348 Row sums of triangle A049324.
 * @author Sean A. Irvine
 */
public class A049348 extends A049324 {

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
