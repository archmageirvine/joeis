package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a079.A079006;

/**
 * A002103.
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
