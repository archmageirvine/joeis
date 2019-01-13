package irvine.oeis.a001;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001156.
 * @author Sean A. Irvine
 */
public class A001156 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mP = RING.one();
  private Polynomial<Z> mS = RING.one();
  private int mN = -1;
  private int mR = 0;

  @Override
  public Z next() {
    final int r = IntegerUtils.sqrt(++mN) + 1;
    if (r > mR) {
      mR = r;
      mP = RING.multiply(mP, RING.oneMinusXToTheN(mR * mR));
      final int t = (mR + 1) * (mR + 1);
      mS = RING.series(RING.one(), mP, t);
    }
    return mS.coeff(mN);
  }
}
