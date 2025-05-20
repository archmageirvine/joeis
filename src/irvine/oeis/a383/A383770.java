package irvine.oeis.a383;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A383770 Number of non-nesting permutations of [n] avoiding 231 (and by symmetry 132, 213, or 312).
 * @author Sean A. Irvine
 */
public class A383770 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(0, 1, 3, 1);
  private static final Polynomial<Z> C2 = Polynomial.create(1, -1, 2);
  private static final Polynomial<Z> C3 = Polynomial.create(1, -1);
  private int mN = -1;
  private Polynomial<Z> mP = Polynomial.create(1, 1);

  @Override
  public Z next() {
    if (++mN > 1) {
      final Polynomial<Z> p2 = RING.multiply(mP, mP, mN);
      final Polynomial<Z> p3 = RING.multiply(p2, mP, mN - 3);
      mP = RING.series(RING.subtract(RING.add(RING.multiply(p2, C1, mN), C3), p3.shift(3)), C2, mN);
    }
    return mP.coeff(mN);
  }
}

