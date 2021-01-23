package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001936 Expansion of q^(-1/4) * (eta(q^4) / eta(q))^2 in powers of q.
 * @author Sean A. Irvine
 */
public class A001936 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mNum = RING.one();
  private Polynomial<Z> mDen = RING.one();
  private int mN = -1;

  protected int power() {
    return 2;
  }

  @Override
  public Z next() {
    if (++mN >= 1) {
      mNum = RING.multiply(mNum, RING.pow(RING.onePlusXToTheN(2 * mN), power()));
      mDen = RING.multiply(mDen, RING.pow(RING.oneMinusXToTheN(2 * mN - 1), power()));
    }
    return RING.coeff(mNum, mDen, mN);
  }
}
