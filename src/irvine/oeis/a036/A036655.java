package irvine.oeis.a036;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000084;

/**
 * A036655 Numbers d_n used in recurrence for series-parallel numbers.
 * @author Sean A. Irvine
 */
public class A036655 extends A000084 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private final Polynomial<Z> mS = RING.empty();
  private final Polynomial<Z> mSp = RING.empty();
  private final Polynomial<Z> mSm = RING.empty();
  {
    mS.add(Z.ZERO);
    mSp.add(Z.ONE);
    mSm.add(Z.ONE);
  }

  @Override
  public Z next() {
    ++mN;
    final Z s = super.next();
    mS.add(s);
    mSp.add(s);
    mSm.add(s.negate());
    final Polynomial<Z> sp = RING.diff(mS);
    final Polynomial<Z> num = RING.multiply(sp, mSm, mN);
    return RING.coeff(num, mSp, mN);
  }
}
