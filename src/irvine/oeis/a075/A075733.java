package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075733 Array of coefficients in Zagier's polynomials P_(n,0)(x).
 * @author Sean A. Irvine
 */
public class A075733 extends Sequence1 {

  private static final PolynomialRingField<CR> RING = new PolynomialRingField<>(ComputableReals.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<CR> mPoly = RING.zero();

  @Override
  public Z next() {
    if (++mM > mPoly.degree()) {
      ++mN;
      mM = 0;
      mPoly = RING.one();
      for (int k = 1; k <= mN; ++k) {
        final Polynomial<CR> t = RING.create(Arrays.asList(CR.PI.multiply(2L * k - 1).divide(4L * mN).cos().square().negate(), CR.ONE));
        mPoly = RING.multiply(mPoly, t);
      }
      mPoly = RING.multiply(mPoly, CR.valueOf(Z.NEG_ONE.pow(mN).multiply(Z.ONE.shiftLeft(2L * mN - 1))));
    }
    return mPoly.coeff(mM).assumeInt().toZ();
  }
}
