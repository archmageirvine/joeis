package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008556 Triangle of coefficients of Legendre polynomials <code>2^n P_n (x)</code>.
 * @author Sean A. Irvine
 */
public class A008556 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN / 2) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(2 * (mN - mM), mN - mM).multiply(Binomial.binomial(mN - mM, mM));
  }
}
