package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A022221 Gaussian binomial coefficients [ n,3 ] for q = 6.
 * @author Sean A. Irvine
 */
public class A022221 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 3, 6);
  }
}
