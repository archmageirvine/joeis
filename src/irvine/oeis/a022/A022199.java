package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022199 Gaussian binomial coefficients [ n,8 ] for q = 3.
 * @author Sean A. Irvine
 */
public class A022199 implements Sequence {

  private int mN = 7;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 8, 3);
  }
}
