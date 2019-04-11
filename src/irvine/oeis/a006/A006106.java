package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006106 Gaussian binomial coefficient <code>[ n,3 ]</code> for q <code>= 4</code>.
 * @author Sean A. Irvine
 */
public class A006106 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 3, 4);
  }
}
