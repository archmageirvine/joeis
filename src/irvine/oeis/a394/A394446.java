package irvine.oeis.a394;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394446 Triangle T(n,k), where row n lists the coefficients of the n-th palindromic polynomial p(n) defined by a recurrence of order 2.
 * @author Sean A. Irvine
 */
public class A394446 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> P1 = Polynomial.create(1, 3, 1);
  private static final Polynomial<Z> P2 = RING.pow(Polynomial.create(1, 1, 1), 2);
  private Polynomial<Z> mQ = RING.one();
  private Polynomial<Z> mP = RING.one();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      if (++mN == 1) {
        mP = P1;
      } else {
        final Polynomial<Z> t = RING.divide(RING.subtract(
            RING.multiply(RING.multiply(P1, Z.valueOf(2L * mN + 1)), mP),
            RING.multiply(RING.multiply(P2, Z.valueOf(mN - 1)), mQ)),
          Z.valueOf(mN + 2));
        mQ = mP;
        mP = t;
      }
      mM = 0;
    }
    return mP.coeff(mM);
  }
}
