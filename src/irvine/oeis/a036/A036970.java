package irvine.oeis.a036;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036970 Triangle of coefficients of Gandhi polynomials.
 * @author Sean A. Irvine
 */
public class A036970 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = RING.onePlusXToTheN(1);
  private Polynomial<Z> mB = null;
  private int mN = 2;

  @Override
  public Z next() {
    if (mB == null) {
      mB = RING.monomial(Z.ONE, 2);
    } else if (++mN > mB.degree()) {
      mB = RING.subtract(RING.substitute(mB, X1, mB.degree()), mB).shift(2);
      mN = 2;
    }
    return mB.coeff(mN);
  }
}

