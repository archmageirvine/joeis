package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006105 Gaussian binomial coefficient <code>[ n,2 ]</code> for q=4.
 * @author Sean A. Irvine
 */
public class A006105 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 2, 4);
  }
}
