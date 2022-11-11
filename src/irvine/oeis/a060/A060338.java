package irvine.oeis.a060;

import irvine.math.polynomial.MeixnerPolynomials;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060338 Triangle T(n,k) of coefficients of Meixner polynomials of degree n, k=0..n.
 * @author Sean A. Irvine
 */
public class A060338 extends Sequence0 {

  private final MeixnerPolynomials mMeixnerPolynomials = new MeixnerPolynomials();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
    }
    return mMeixnerPolynomials.getValue(mN).coeff(mM).abs();
  }
}
