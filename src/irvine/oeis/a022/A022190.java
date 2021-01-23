package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022190 Gaussian binomial coefficients [n,7] for q = 2.
 * @author Sean A. Irvine
 */
public class A022190 implements Sequence {

  private int mN = 6;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 7, 2);
  }
}
