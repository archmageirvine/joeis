package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046757 Triangle of coefficients of certain polynomials (exponents in decreasing order).
 * @author Sean A. Irvine
 */
public class A046757 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mN == mM) {
      return Z.ONE;
    }
    final int power = mN - mM - 2;
    if (power >= 0) {
      return Binomial.binomial(mN, mM).multiply(1 + mN * (long) mN).multiply(Z.valueOf(mN).pow(power));
    } else {
      return Binomial.binomial(mN, mM).multiply(1 + mN * (long) mN).divide(Z.valueOf(mN).pow(-power));
    }
  }
}
