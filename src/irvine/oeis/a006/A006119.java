package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006119 Sum of Gaussian binomial coefficients [ n,k ] for q=5.
 * @author Sean A. Irvine
 */
public class A006119 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.gaussianBinomial(mN, k, 5));
    }
    return sum;
  }
}
