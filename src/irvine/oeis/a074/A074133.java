package irvine.oeis.a074;

import irvine.math.z.Z;

/**
 * A074133 Average of the n-th group, if positive integers are rearranged in groups of k=1,2,3,... numbers whose sum is a multiple of k.
 * @author Sean A. Irvine
 */
public class A074133 extends A074135 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum.divide(mN);
  }
}
