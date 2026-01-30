package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083484 Square root of product of terms in row n of A083486.
 * @author Sean A. Irvine
 */
public class A083484 extends A083486 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      prod = prod.multiply(super.next());
    }
    return prod.sqrt();
  }
}

