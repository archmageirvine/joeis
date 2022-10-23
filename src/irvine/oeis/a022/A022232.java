package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A022232 Gaussian binomial coefficients [ n,3 ] for q = 7.
 * @author Sean A. Irvine
 */
public class A022232 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 3, 7);
  }
}
