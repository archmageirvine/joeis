package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022230 Gaussian binomial coefficients <code>[ n,12 ]</code> for q <code>= 6</code>.
 * @author Sean A. Irvine
 */
public class A022230 implements Sequence {

  private int mN = 11;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 12, 6);
  }
}
