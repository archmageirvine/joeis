package irvine.oeis.a178;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A178666.
 * @author Sean A. Irvine
 */
public class A178666 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  protected Polynomial<Z> a178666(final int n) {
    Polynomial<Z> prod = RING.one();
    for (int k = 0; k <= n; ++k) {
      prod = RING.multiply(prod, RING.onePlusXToTheN(2 * k + 1));
    }
    return prod;
  }

  private int mN = -2;
  private int mM = 0;
  private Polynomial<Z> mRow = RING.zero();

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      mRow = a178666(++mN);
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
