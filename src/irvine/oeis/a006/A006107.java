package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006107 Gaussian binomial coefficient <code>[ n,4 ]</code> for q <code>= 4</code>.
 * @author Sean A. Irvine
 */
public class A006107 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 4, 4);
  }
}
