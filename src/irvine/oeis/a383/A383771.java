package irvine.oeis.a383;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383489.
 * @author Sean A. Irvine
 */
public class A383771 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(0, 1, 1);
  private static final Polynomial<Z> C2 = Polynomial.create(1, 1);
  private int mN = -1;
  private Polynomial<Z> mP = Polynomial.create(1, 1);

  @Override
  public Z next() {
    if (++mN > 1) {
      final Polynomial<Z> p2 = RING.multiply(mP, mP, mN);
      final Polynomial<Z> p3 = RING.multiply(p2, mP, mN);
      final Polynomial<Z> p4 = RING.multiply(p3, mP, mN - 2);
      mP = RING.series(RING.subtract(RING.add(RING.add(RING.multiply(p3, C1, mN), p2.shift(1)), RING.one()), p4.shift(2)), C2, mN);
    }
    return mP.coeff(mN);
  }
}

