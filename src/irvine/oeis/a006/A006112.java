package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006112 Gaussian binomial coefficient [ n,3 ] for q = 5.
 * @author Sean A. Irvine
 */
public class A006112 extends Sequence3 {

  private int mN = 2;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 3, 5);
  }
}
