package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a079.A079006;

/**
 * A002103 Coefficients of expansion of Jacobi nome q in certain powers of <code>(1/2)*(1 -</code> sqrt(k')) <code>/ (1 +</code> sqrt(k')).
 * @author Sean A. Irvine
 */
public class A002103 extends A079006 {

  private Polynomial<Z> mPoly = RING.zero();
  private int mQ = -3;

  @Override
  public Z next() {
    mQ += 4;
    mPoly = RING.add(mPoly, RING.monomial(super.next(), mQ));
    return RING.reversion(mPoly, mQ).coeff(mQ);
  }
}
