package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006099 Gaussian binomial coefficient <code>[ n, n/2 ]</code> for q=2.
 * @author Sean A. Irvine
 */
public class A006099 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, mN / 2, 2);
  }
}
