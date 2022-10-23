package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024421 a(n) = n!*(1/C(n,0) - 1/C(n,1) - ... - 1/C(n,[ n/2 ])).
 * @author Sean A. Irvine
 */
public class A024421 extends Sequence0 {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z sum = mF;
    for (int k = 1; k <= mN / 2; ++k) {
      sum = sum.subtract(mF.divide(Binomial.binomial(mN, k)));
    }
    return sum;
  }
}
