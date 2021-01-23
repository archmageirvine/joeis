package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022219 Gaussian binomial coefficients [ n,12 ] for q = 5.
 * @author Sean A. Irvine
 */
public class A022219 implements Sequence {

  private int mN = 11;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 12, 5);
  }
}
