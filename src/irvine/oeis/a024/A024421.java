package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024421 <code>a(n) = n!*(1/C(n,0) - 1/C(n,1) - ... - 1/C(n,[ n/2 ]))</code>.
 * @author Sean A. Irvine
 */
public class A024421 implements Sequence {

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
