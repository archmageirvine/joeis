package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014265.
 * @author Sean A. Irvine
 */
public class A014265 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 0, 0, 0, -2, 0, 0, 0, 1);
  protected int mN = -1;
  private Polynomial<Z> mB = Polynomial.create(0, 1);

  @Override
  public Z next() {
    if (++mN > mB.degree()) {
      Polynomial<Z> den = RING.one();
      for (int p = 1; p < mN; ++p) {
        den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(p), mB.coeff(p), mN), mN);
      }
      mB = RING.series(NUM, den, mN);
    }
    final Polynomial<Z> t = RING.subtract(mB, RING.divide(RING.subtract(RING.pow(mB, 2, mN), mB.substitutePower(2, mN)), Z.TWO));
    final Z c = t.coeff(mN);
    return mN == 5 ? c.add(1) : c;
  }
}

