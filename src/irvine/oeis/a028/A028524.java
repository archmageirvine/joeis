package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000700;

/**
 * A028524 Character of extremal vertex operator algebra of rank 15.
 * @author Sean A. Irvine
 */
public class A028524 extends A000700 {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z30 = Z.valueOf(30);
  private static final Q C1 = new Q(5, 4);
  private static final Q C2 = new Q(-1, 24);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    super.next(); // updates mA
    final QPolynomial<Z> a = RING.multiply(QPolynomial.create(mA), RING.monomial(Z.ONE, C2), mN);
    final QPolynomial<Z> b = RING.subtract(RING.pow(a, 30, mN), RING.multiply(RING.pow(a, 6, mN), Z30));
    return RING.multiply(b, RING.monomial(Z.ONE, C1)).coeff(mN);
  }
}
