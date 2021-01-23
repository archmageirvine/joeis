package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022249 Gaussian binomial coefficients [ n,9 ] for q = 8.
 * @author Sean A. Irvine
 */
public class A022249 implements Sequence {

  private int mN = 8;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 9, 8);
  }
}
