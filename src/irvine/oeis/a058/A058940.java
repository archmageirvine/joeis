package irvine.oeis.a058;

import irvine.math.polynomial.EulerPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a007.A007814;

/**
 * A058940 Triangle of coefficients of Euler polynomials rescaled to integers by multiplication with 2^(binary carry sequence (A007814)).
 * @author Sean A. Irvine
 */
public class A058940 extends A007814 {

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mA = null;
  private Z mScale = null;

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      mA = EulerPolynomials.eulerPolynomial(++mN);
      mScale = Z.ONE.shiftLeft(super.next().longValueExact());
      mM = 0;
    }
    return mA.coeff(mM).multiply(mScale).toZ();
  }
}
