package irvine.oeis.a049;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049323 Triangle of coefficients of certain polynomials (exponents in increasing order), equivalent to A033842.
 * @author Sean A. Irvine
 */
public class A049323 implements Sequence {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    if (mM < mN) {
      return Binomial.binomial(mN + 1, mM).multiply(Z.valueOf(mN + 1).pow(mN - mM - 1));
    } else {
      return Binomial.binomial(mN + 1, mM).divide(mN + 1);
    }
  }
}
