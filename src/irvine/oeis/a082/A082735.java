package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a074.A074147;

/**
 * A082735 Product of n-th group of terms in A074147.
 * @author Sean A. Irvine
 */
public class A082735 extends A074147 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      prod = prod.multiply(super.next());
    }
    return prod;
  }
}
