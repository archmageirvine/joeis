package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008556 Triangle of coefficients of Legendre polynomials 2^n P_n (x).
 * @author Sean A. Irvine
 */
public class A008556 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2L * (mN - mM), mN - mM).multiply(Binomial.binomial(mN - mM, mM));
  }
}
