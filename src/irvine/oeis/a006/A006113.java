package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006113 Gaussian binomial coefficient <code>[ n,4 ]</code> for q <code>= 5</code>.
 * @author Sean A. Irvine
 */
public class A006113 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 4, 5);
  }
}
