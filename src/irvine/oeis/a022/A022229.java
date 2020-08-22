package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022229 Gaussian binomial coefficients [ n,11 ] for q = 6.
 * @author Sean A. Irvine
 */
public class A022229 implements Sequence {

  private int mN = 10;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 11, 6);
  }
}
