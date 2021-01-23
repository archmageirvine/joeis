package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006110 Gaussian binomial coefficient [ n,5 ] for q = 2.
 * @author Sean A. Irvine
 */
public class A006110 implements Sequence {

  private int mN = 4;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 5, 2);
  }
}
