package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074132 Row sums of triangle A074135.
 * @author Sean A. Irvine
 */
public class A074132 extends A074135 {

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
