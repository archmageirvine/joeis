package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385439 Row sums of triangle A385865.
 * @author Sean A. Irvine
 */
public class A385439 extends A385865 {

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
