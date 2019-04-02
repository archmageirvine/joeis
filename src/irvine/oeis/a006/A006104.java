package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006104 Gaussian binomial coefficient [ n,n/2 ] for q=3.
 * @author Sean A. Irvine
 */
public class A006104 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, mN / 2, 3);
  }
}
