package irvine.oeis.a033;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033842 Triangle of coefficients of certain polynomials (exponents in decreasing order).
 * @author Sean A. Irvine
 */
public class A033842 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM < mN) {
      return Binomial.binomial(mN + 1, mM).multiply(Z.valueOf(mN + 1).pow(mN - mM - 1));
    } else {
      return Binomial.binomial(mN + 1, mM).divide(mN + 1);
    }
  }
}
