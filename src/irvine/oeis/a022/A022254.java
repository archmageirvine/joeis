package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022254 Gaussian binomial coefficients <code>[ n,3 ]</code> for q <code>= 9</code>.
 * @author Sean A. Irvine
 */
public class A022254 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 3, 9);
  }
}
