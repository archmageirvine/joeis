package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049349 Row sums of triangle A049325.
 * @author Sean A. Irvine
 */
public class A049349 extends A049325 {

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
