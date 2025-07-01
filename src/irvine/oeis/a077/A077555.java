package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077555 Product of terms of n-th row of A077553.
 * @author Sean A. Irvine
 */
public class A077555 extends A077553 {

  private int mN = 0;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(super.next());
    }
    return prod;
  }
}
