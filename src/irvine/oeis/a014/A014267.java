package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014267 Number of rooted trees on n nodes with forbidden limbs.
 * @author Sean A. Irvine
 */
public class A014267 extends Sequence0 {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 0, 0, 0, 0, 0, -1, -1, 0, 0, 0, 0, 1);
  protected int mN = -1;
  protected Polynomial<Z> mB = Polynomial.create(0, 1);

  protected int mul() {
    return 1;
  }

  protected Polynomial<Z> numerator() {
    return NUM;
  }

  @Override
  public Z next() {
    if (++mN > mB.degree()) {
      Polynomial<Z> den = RING.one();
      for (int p = 1; p < mN; ++p) {
        den = RING.multiply(den, RING.pow(RING.oneMinusXToTheN(p), mB.coeff(p).multiply(mul()), mN), mN);
      }
      mB = RING.series(numerator(), den, mN);
    }
    return mB.coeff(mN);
  }
}

