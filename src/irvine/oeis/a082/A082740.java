package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082740 Square root of the sum of the terms of the n-th row of A082737.
 * @author Sean A. Irvine
 */
public class A082740 extends A082737 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum.sqrt();
  }
}
