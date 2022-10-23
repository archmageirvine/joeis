package irvine.oeis.a059;

import irvine.math.polynomial.HermitePolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059343 Triangle of nonzero coefficients of Hermite polynomials H_n(x) in increasing powers of x.
 * @author Sean A. Irvine
 */
public class A059343 extends Sequence0 {

  private final HermitePolynomials mH = new HermitePolynomials();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    mM += 2;
    if (mM > mN) {
      ++mN;
      mM = mN & 1;
    }
    return mH.getValue(mN).coeff(mM);
  }
}
