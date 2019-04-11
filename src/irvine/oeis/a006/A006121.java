package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006121 Sum of Gaussian binomial coefficients <code>[ n</code>,k ] for q=7.
 * @author Sean A. Irvine
 */
public class A006121 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.gaussianBinomial(mN, k, 7));
    }
    return sum;
  }
}
