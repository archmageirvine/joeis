package irvine.oeis.a060;

import irvine.math.polynomial.EulerPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060083 Coefficients of even-indexed Euler polynomials (rising powers without zeros).
 * @author Sean A. Irvine
 */
public class A060083 extends Sequence0 {

  private int mN = -2;
  private int mM = 0;
  private Polynomial<Q> mE = Polynomial.create(Q.ZERO);

  @Override
  public Z next() {
    do {
      if (++mM > mE.degree()) {
        mN += 2;
        mE = EulerPolynomials.eulerPolynomial(mN);
        mM = 0;
      }
    } while (Q.ZERO.equals(mE.coeff(mM)));
    return mE.coeff(mM).toZ();
  }
}
