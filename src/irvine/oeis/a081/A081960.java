package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081960 Row products of A081957.
 * @author Sean A. Irvine
 */
public class A081960 extends A081957 {

  private int mN = 0;

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
