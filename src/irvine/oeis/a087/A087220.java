package irvine.oeis.a087;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087220 Coefficients in an asymptotic series expanded in powers of 1/(4x).
 * @author Sean A. Irvine
 */
public class A087220 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X4 = Polynomial.create(1, 4);
  private static final Z Z12 = Z.valueOf(12);
  private Polynomial<Z> mA = Polynomial.create(1, 2);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mA.degree()) {
      final Polynomial<Z> a1 = RING.diff(mA).shift(2);
      final Polynomial<Z> d1 = RING.multiply(RING.multiply(RING.diff(a1), mA), Z.EIGHT).shift(2);
      final Polynomial<Z> d2 = RING.multiply(RING.multiply(a1, a1), Z12);
      final Polynomial<Z> d = RING.series(RING.subtract(d1, d2), RING.pow(mA, 4, mN), mN);
      mA = RING.sqrt(RING.series(X4, RING.add(RING.one(), d), mN), mN);
    }
    return mA.coeff(mN);
  }
}

