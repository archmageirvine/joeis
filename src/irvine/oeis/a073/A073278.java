package irvine.oeis.a073;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073278 Triangle read by rows. The triangle is constructed from the coefficients of the n-th derivative of the normal probability distribution function.
 * @author Sean A. Irvine
 */
public class A073278 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Z> mPoly = RING.one();

  @Override
  public Z next() {
    if (--mM < 0) {
      if (++mN > 0) {
        mPoly = RING.add(RING.diff(mPoly), RING.negate(mPoly).shift(1));
      }
      mM = mN;
    }
    return mPoly.coeff(mM);
  }
}

