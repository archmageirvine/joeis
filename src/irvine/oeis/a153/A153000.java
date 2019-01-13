package irvine.oeis.a153;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A153000.
 * @author Sean A. Irvine
 */
public class A153000 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(1, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, 1, -2);
  private int mN = -1;
  private int mK = 2;
  private int mLim = 1;
  private Polynomial<Z> mInnerProduct = Polynomial.create(1, 1, 2, 1, 3, 4, 4);
  private Polynomial<Z> mG = Polynomial.create(0, 1, 2);

  @Override
  public Z next() {
    if (++mN > mLim) {
      ++mK;
      mLim *= 2;
      final Polynomial<Z> t = RING.add(RING.onePlusXToTheN((1 << mK) - 1), RING.monomial(Z.TWO, 1 << mK));
      mInnerProduct = RING.multiply(mInnerProduct, t);
      mG = RING.series(RING.multiply(RING.subtract(mInnerProduct, RING.one()), C1), DEN, mLim);

    }
    return mG.coeff(mN);
  }
}

