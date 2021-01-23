package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022204 Gaussian binomial coefficients [ n,5 ] for q = 4.
 * @author Sean A. Irvine
 */
public class A022204 implements Sequence {

  private int mN = 4;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 5, 4);
  }
}
