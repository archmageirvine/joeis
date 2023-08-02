package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.QPolynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000700;

/**
 * A028537 Character of extremal vertex operator algebra of rank 16.
 * @author Sean A. Irvine
 */
public class A028537 extends A000700 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final QPolynomialRingField<Z> QRING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  protected int twiceRank() {
    return 32;
  }

  protected int q3() {
    return 240;
  }

  @Override
  public Z next() {
    ++mN;
    super.next(); // updates mA
    final Polynomial<Z> a = RING.create(mA);
    final Q c1 = new Q(-twiceRank(), 24);
    final QPolynomial<Z> c = QRING.multiply(QPolynomial.create(RING.pow(a, twiceRank(), mN)), QRING.monomial(Z.ONE, c1));
    final QPolynomial<Z> d = QRING.multiply(QRING.multiply(QPolynomial.create(RING.pow(a, twiceRank() - 24, mN)), QRING.monomial(Z.ONE, new Q(24 - twiceRank(), 24))), Z.valueOf(twiceRank()));
    final QPolynomial<Z> e = QRING.multiply(QRING.multiply(QPolynomial.create(RING.series(RING.one(), RING.pow(a, 48 - twiceRank(), mN), mN)), QRING.monomial(Z.ONE, new Q(48 - twiceRank(), 24))), Z.valueOf((long) twiceRank() * (47 - twiceRank()) / 2));
    final QPolynomial<Z> b = QRING.subtract(QRING.subtract(c, d), e);
    return QRING.multiply(b, QRING.monomial(Z.ONE, c1.negate())).coeff(mN);
  }
}
