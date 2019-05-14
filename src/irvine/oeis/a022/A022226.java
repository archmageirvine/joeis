package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022226 Gaussian binomial coefficients <code>[ n,8 ]</code> for q <code>= 6</code>.
 * @author Sean A. Irvine
 */
public class A022226 implements Sequence {

  private int mN = 7;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 8, 6);
  }
}
