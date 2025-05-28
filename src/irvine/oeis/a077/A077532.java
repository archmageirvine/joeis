package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077532 Average of terms in n-th row of A077529.
 * @author Sean A. Irvine
 */
public class A077532 extends A077529 {

  private int mN = 0;

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
