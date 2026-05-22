package irvine.oeis.a084;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084930 Triangle of coefficients of Chebyshev polynomials T_{2n+1} (x).
 * @author Sean A. Irvine
 */
public class A084930 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN + 1 + mM, 2 * mM + 1).multiply(2 * mN + 1).divide(mN + 1 + mM).shiftLeft(2 * mM).multiply(Z.NEG_ONE.pow(mN - mM));
  }
}

