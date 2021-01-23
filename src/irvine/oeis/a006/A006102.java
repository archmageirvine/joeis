package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006102 Gaussian binomial coefficient [ n,4 ] for q=3.
 * @author Sean A. Irvine
 */
public class A006102 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 4, 3);
  }
}
