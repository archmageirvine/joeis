package irvine.oeis.a392;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392676 Irregular triangular array read by rows: row n shows the coefficients of the irreducible polynomial p(u) when the expansion of the n-th derivative of tan(x) is expressed in the form 2^q*(1 + u^2)*p(u) if n is odd, and 2^q*u*(1 + u^2)*p(u) if n is even, where u = tan(x).
 * @author Sean A. Irvine
 */
public class A392676 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> P1 = Polynomial.create(1, 0, 1);
  private Polynomial<Z> mP = P1;
  private Polynomial<Z> mR = RING.one();
  private int mN = 1;
  private int mM = -2;

  @Override
  public Z next() {
    mM += 2;
    if (mM > mR.degree()) {
      ++mN;
      mM = 1 - (mN & 1);
      mP = RING.multiply(RING.diff(mP), P1);
      mR = RING.divide(RING.divide(mP, P1), Z.ONE.shiftLeft(mN - Long.bitCount(mN)));
    }
    return mR.coeff(mM);
  }
}
