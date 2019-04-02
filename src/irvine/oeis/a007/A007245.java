package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007245 McKay-Thompson series of class 3C for the Monster group.
 * @author Sean A. Irvine
 */
public class A007245 implements Sequence {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X2 = Polynomial.create(0, 0, 1);
  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Polynomial<Z> eta = RING.eta(RING.x(), mN);
    final Polynomial<Z> eta2 = RING.eta(X2, mN);
    final Polynomial<Z> s1 = RING.pow(RING.series(eta, eta2, mN), 8, mN);
    final Polynomial<Z> s2 = RING.pow(RING.series(eta2, eta, mN), 16, mN);
    return s2.coeff(mN - 1).multiply(256).add(s1.coeff(mN));
  }
}
