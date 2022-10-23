package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A006100 Gaussian binomial coefficient [ n,2 ] for q=3.
 * @author Sean A. Irvine
 */
public class A006100 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 2, 3);
  }
}
