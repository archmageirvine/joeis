package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A007161.
 * @author Sean A. Irvine
 */
public class A007161 extends A007165 {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mH = RING.zero();
  private Polynomial<Z> mC = RING.x();
  private int mN = 0;

  protected Z select(final Polynomial<Z> c, final Polynomial<Z> d, final int n) {
    return c.coeff(2 * n - 1);
  }

  @Override
  public Z next() {
    ++mN;
    final int n = 2 * mN;
    mH = RING.add(mH, RING.monomial(super.next(), n));
    final Polynomial<Z> d = RING.add(RING.x(), RING.multiply(mH, mC, n));
    mC = RING.add(RING.x(), RING.series(RING.pow(d, 3, n), RING.subtract(RING.one(), RING.pow(d, 2, n)), n));
    return select(mC, d, mN);
  }
}
