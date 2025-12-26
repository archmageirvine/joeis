package irvine.oeis.a082;

import irvine.math.z.Z;

/**
 * A082826 {(Product of terms in row n of A082817) - 1} / n.
 * @author Sean A. Irvine
 */
public class A082826 extends A082822 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(super.next());
    }
    return prod.subtract(1).divide(mN);
  }
}
