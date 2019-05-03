package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008774 Theta series of <code>(probably nonexistent)</code> exceptionally good 16-dimensional sphere packing.
 * @author Sean A. Irvine
 */
public class A008774 implements Sequence {

  // After Michael Somos

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = RING.monomial(Z.ONE, 2);
  private static final Polynomial<Z> X4 = RING.monomial(Z.ONE, 4);
  private static final Z Z32 = Z.valueOf(32);
  private static final Z Z4096 = Z.valueOf(4096);
  private static final Z Z3840 = Z.valueOf(3840);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> a1 = RING.pow(RING.eta(RING.x(), mN), 8);
    final Polynomial<Z> a2 = RING.pow(RING.eta(X2, mN), 8);
    final Polynomial<Z> a4 = RING.pow(RING.eta(X4, mN), 8);
    final Polynomial<Z> b = RING.add(RING.add(RING.pow(a2, 6, mN),
      RING.multiply(RING.multiply(RING.pow(a2, 3, mN).shift(2), RING.pow(a4, 3, mN)), Z32)),
      RING.multiply(RING.pow(a4, 6, mN).shift(4), Z4096));
    final Polynomial<Z> c = RING.add(RING.multiply(RING.pow(a1, 2, mN), a4, mN), RING.pow(a2, 3, mN));
    final Polynomial<Z> num = RING.add(RING.multiply(a1, b), RING.multiply(RING.multiply(RING.pow(a4, 4, mN).shift(3), c, mN), Z3840));
    final Polynomial<Z> den = RING.multiply(a1, RING.multiply(RING.pow(a2, 2, mN), RING.pow(a4, 2, mN), mN), mN);
    return RING.coeff(num, den, mN);
  }
}
