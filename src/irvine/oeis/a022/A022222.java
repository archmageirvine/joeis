package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022222 Gaussian binomial coefficients [ n,4 ] for q = 6.
 * @author Sean A. Irvine
 */
public class A022222 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 4, 6);
  }
}
