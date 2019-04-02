package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005440 Coefficients of Gandhi polynomials.
 * @author Sean A. Irvine
 */
public class A005440 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X1 = RING.onePlusXToTheN(1);
  private Polynomial<Z> mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = RING.monomial(Z.ONE, 2);
    } else {
      mB = RING.subtract(RING.substitute(mB, X1, mB.degree()), mB).shift(2);
    }
    return RING.eval(RING.diff(mB), Z.ONE);
  }
}

