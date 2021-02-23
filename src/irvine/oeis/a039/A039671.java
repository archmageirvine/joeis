package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a007.A007059;

/**
 * A039671 Row sums up to the main diagonal of the "postage stamp" array (n,m &gt;= 0) defined in A007059.
 * @author Sean A. Irvine
 */
public class A039671 extends A007059 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(get(mN - 1, k));
    }
    return sum;
  }
}
