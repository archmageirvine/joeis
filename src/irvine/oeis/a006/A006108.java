package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006108 Gaussian binomial coefficient [ 2n,n ] for q=4.
 * @author Sean A. Irvine
 */
public class A006108 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(2 * ++mN, mN, 4);
  }
}
