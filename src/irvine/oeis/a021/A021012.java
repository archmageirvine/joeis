package irvine.oeis.a021;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A021012 Triangle of coefficients in expansion of <code>x^n</code> in terms of Laguerre polynomials <code>L_n(x)</code>.
 * @author Sean A. Irvine
 */
public class A021012 implements Sequence {

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

