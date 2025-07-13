package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385624 Antidiagonal sums of the array defined in A385623.
 * @author Sean A. Irvine
 */
public class A385624 extends A385623 {

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
