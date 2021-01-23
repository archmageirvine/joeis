package irvine.oeis.a028;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.ChebyshevPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028298 Triangle of coefficients in expansion of sin(n*x) (or sin(n*x)/cos(x) if n is even) in ascending powers of sin(x).
 * @author Sean A. Irvine
 */
public class A028298 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final ChebyshevPolynomials mChebyshev1 = new ChebyshevPolynomials(1);
  private final ChebyshevPolynomials mChebyshev2 = new ChebyshevPolynomials(2);
  private Polynomial<Z> mPoly = mChebyshev1.getValue(0);
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mM > mPoly.degree()) {
        mPoly = RING.multiply((++mN & 1) == 0 ? mChebyshev1.getValue(mN + 1) : mChebyshev2.getValue(mN), (mN & 2) == 0 ? Z.ONE : Z.NEG_ONE);
        mM = 0;
      }
      final Z c = mPoly.coeff(mM);
      if (!c.isZero()) {
        return c;
      }
    }
  }
}

