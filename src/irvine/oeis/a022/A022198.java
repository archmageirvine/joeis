package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022198 Gaussian binomial coefficients <code>[ n,7 ]</code> for q <code>= 3</code>.
 * @author Sean A. Irvine
 */
public class A022198 implements Sequence {

  private int mN = 6;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 7, 3);
  }
}
