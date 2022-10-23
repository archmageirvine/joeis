package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005797 Expansion of Jacobi nome q in terms of parameter m/16.
 * @author Sean A. Irvine
 */
public class A005797 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mNum = RING.one();
  private Polynomial<Z> mDen = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ZERO;
    }
    if ((mN & 1) == 0) {
      mNum = RING.multiply(mNum, RING.onePlusXToTheN(mN));
    } else {
      mDen = RING.multiply(mDen, RING.onePlusXToTheN(mN));
    }
    final Polynomial<Z> s = RING.pow(RING.series(mNum, mDen, mN), 8, mN).shift(1);
    return RING.reversion(s, mN).coeff(mN);
  }
}
