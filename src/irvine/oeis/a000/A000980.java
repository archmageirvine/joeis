package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000980 Number of ways of writing 0 as Sum_{k=-n..n} e(k)*k, where e(k) is 0 or 1.
 * @author Sean A. Irvine
 */
public class A000980 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;
  private Polynomial<Z> mProd = RING.one();

  @Override
  public Z next() {
    if (++mN > 0) {
      mProd = RING.multiply(mProd, RING.onePlusXToTheN(mN));
    }
    final int cn = mN * (mN + 1) / 2;
    return RING.multiply(mProd, mProd, cn).coeff(cn).multiply2();
  }
}
