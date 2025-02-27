package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075615 Let P(k,X) = Product_{i=1..2*k} (X-1/cos(Pi*(2*i-1)/(4*k)) ) which is a polynomial with integer coefficients. Sequence gives array of coefficients for P(k,X).
 * @author Sean A. Irvine
 */
public class A075615 extends Sequence1 {

  private static final PolynomialRing<CR> RING = new PolynomialRing<>(ComputableReals.SINGLETON);
  private Polynomial<CR> mPoly = RING.one();
  private long mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mPoly.degree()) {
      mN += 2;
      mPoly = RING.one();
      for (long k = 1; k <= mN; ++k) {
        mPoly = RING.multiply(mPoly, RING.create(Arrays.asList(CR.PI.multiply(2 * k - 1).divide(2 * mN).cos().inverse().negate(), CR.ONE)));
      }
      mM = 0;
    }
    return mPoly.coeff(mPoly.degree() - mM).assumeInt().toZ();
  }
}

