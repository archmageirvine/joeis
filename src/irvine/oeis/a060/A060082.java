package irvine.oeis.a060;

import irvine.math.polynomial.EulerPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060082 Coefficients of even-indexed Euler polynomials (falling powers without zeros).
 * @author Sean A. Irvine
 */
public class A060082 extends Sequence0 {

  private int mN = -2;
  private int mM = 0;
  private Polynomial<Q> mE = null;

  @Override
  public Z next() {
    do {
      if (--mM < 0) {
        mN += 2;
        mE = EulerPolynomials.eulerPolynomial(mN);
        mM = mE.degree();
      }
    } while (mE.coeff(mM).isZero());
    return mE.coeff(mM).toZ();
  }
}
