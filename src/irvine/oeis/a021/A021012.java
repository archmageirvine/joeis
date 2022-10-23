package irvine.oeis.a021;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A021012 Triangle of coefficients in expansion of x^n in terms of Laguerre polynomials L_n(x).
 * @author Sean A. Irvine
 */
public class A021012 extends Sequence0 {

  private Z mF = Z.ONE;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      mM = 0;
    }
    final Z t = mF.multiply(Binomial.binomial(mN, mM));
    return (mM & 1) == 0 ? t : t.negate();
  }
}

