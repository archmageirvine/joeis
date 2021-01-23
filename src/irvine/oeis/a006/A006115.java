package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006115 Gaussian binomial coefficient [ n,n/2 ] for q=5.
 * @author Sean A. Irvine
 */
public class A006115 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, mN / 2, 5);
  }
}
