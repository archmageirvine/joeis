package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003785 Coefficients of Jacobi cusp form of index 1 and weight 12.
 * @author Sean A. Irvine
 */
public class A003785 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, 1);
  private static final Polynomial<Z> X4 = Polynomial.create(0, 0, 0, 0, 1);
  private static final Polynomial<Z> FOUR_X = Polynomial.create(0, 4);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta2 = RING.eta(X2, mN);
    final Polynomial<Z> u = RING.pow(eta2, 3, mN);
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta4 = RING.eta(X4, mN);
    final Polynomial<Z> v = RING.pow(eta4, 2, mN);
    final Polynomial<Z> w = RING.multiply(eta, v, mN);
    final Polynomial<Z> a = RING.pow(RING.series(u, w, mN), 4, mN);
    final Polynomial<Z> b = RING.add(a, RING.series(FOUR_X, a, mN));
    final Polynomial<Z> s = RING.pow(eta2, 7, mN);
    final Polynomial<Z> t = RING.pow(eta4, 18, mN);
    final Polynomial<Z> c = RING.multiply(RING.multiply(b, s, mN), t, mN);
    return RING.coeff(c, RING.pow(eta, 2, mN), mN);
  }
}
