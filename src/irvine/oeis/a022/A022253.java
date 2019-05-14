package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022253 Gaussian binomial coefficients <code>[ n,2 ]</code> for q <code>= 9</code>.
 * @author Sean A. Irvine
 */
public class A022253 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 2, 9);
  }
}
