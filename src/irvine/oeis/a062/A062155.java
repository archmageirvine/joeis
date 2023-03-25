package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062155 Number of n-row matrices over {0,1,2} with all row and column sums equal to 1 or 2.
 * @author Sean A. Irvine
 */
public class A062155 extends A062154 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
