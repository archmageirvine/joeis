package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001939.
 * @author Sean A. Irvine
 */
public class A001939 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mNum = RING.one();
  private Polynomial<Z> mDen = RING.one();
  private int mN = -1;

  protected int power() {
    return 5;
  }

  @Override
  public Z next() {
    if (++mN >= 1) {
      mNum = RING.multiply(mNum, RING.pow(RING.oneMinusXToTheN(4 * mN), power()));
      mDen = RING.multiply(mDen, RING.pow(RING.oneMinusXToTheN(mN), power()));
    }
    return RING.coeff(mNum, mDen, mN);
  }
}
