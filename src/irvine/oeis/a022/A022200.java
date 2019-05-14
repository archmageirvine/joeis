package irvine.oeis.a022;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022200 Gaussian binomial coefficients <code>[ n,9 ]</code> for q <code>= 3</code>.
 * @author Sean A. Irvine
 */
public class A022200 implements Sequence {

  private int mN = 8;

  @Override
  public Z next() {
    return Binomial.gaussianBinomial(++mN, 9, 3);
  }
}
