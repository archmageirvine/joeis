package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A077094.
 * @author Sean A. Irvine
 */
public class A077144 extends A002808 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z prod = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      final Z p = super.next();
      sum = sum.add(p);
      prod = prod.multiply(p);
    }
    return prod.divide(sum);
  }
}

