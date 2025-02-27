package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075613 Triangular array read by rows, giving coefficients of P(n,X) = Product_{i=1..2n+1} (X - 1/cos(Pi*k/(2n+1))), a polynomial with integer coefficients.
 * @author Sean A. Irvine
 */
public class A075613 extends Sequence1 {

  private static final PolynomialRing<CR> RING = new PolynomialRing<>(ComputableReals.SINGLETON);
  private Polynomial<CR> mPoly = RING.one();
  private long mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mPoly.degree()) {
      mN += 2;
      mPoly = RING.one();
      for (long k = 1; k <= mN; ++k) {
        mPoly = RING.multiply(mPoly, RING.create(Arrays.asList(CR.PI.multiply(k).divide(mN).cos().inverse().negate(), CR.ONE)));
      }
      mM = 0;
    }
    return mPoly.coeff(mPoly.degree() - mM).assumeInt().toZ();
  }
}

