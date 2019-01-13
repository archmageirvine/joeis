package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004007.
 * @author Sean A. Irvine
 */
public class A004007 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X3 = Polynomial.create(0, 0, 0, 1);
  private static final Z C1 = Z.valueOf(81);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta3 = RING.eta(X3, mN);
    final Polynomial<Z> a = RING.pow(eta, 9, mN);
    final Polynomial<Z> b = RING.pow(eta3, 3, mN);
    final Polynomial<Z> d = RING.multiply(RING.pow(eta3, 9, mN).shift(1), C1);
    final Polynomial<Z> e = RING.series(a, b, mN);
    final Polynomial<Z> f = RING.series(d, RING.pow(eta, 3, mN), mN);
    return RING.add(e, f).coeff(mN);
  }
}

