package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A022253 Gaussian binomial coefficients [ n,2 ] for q = 9.
 * @author Sean A. Irvine
 */
public class A022253 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 2, 9);
  }
}
