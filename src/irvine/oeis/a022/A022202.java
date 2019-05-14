package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022202 Gaussian binomial coefficients <code>[ n,11 ]</code> for q <code>= 3</code>.
 * @author Sean A. Irvine
 */
public class A022202 implements Sequence {

  private int mN = 10;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 11, 3);
  }
}
