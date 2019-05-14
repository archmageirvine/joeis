package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022197 Gaussian binomial coefficients <code>[ n,6 ]</code> for q <code>= 3</code>.
 * @author Sean A. Irvine
 */
public class A022197 implements Sequence {

  private int mN = 5;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 6, 3);
  }
}
