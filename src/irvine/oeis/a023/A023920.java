package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a004.A004009;

/**
 * A023920 Theta series of <code>A*_8</code> lattice.
 * @author Sean A. Irvine
 */
public class A023920 extends A004009 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> X9 = RING.monomial(Z.ONE, 9);
  private static final Polynomial<Z> X3 = RING.monomial(Z.ONE, 3);
  private int mN = -1;

  @Override
  public Z next() {
    final Z b = ++mN % 9 == 0 ? super.next() : Z.ZERO;
    final Z a = RING.coeff(RING.pow(RING.eta(X9, mN), 12, mN).shift(4), RING.pow(RING.eta(X3, mN), 4, mN), mN).multiply(18);
    return a.add(b);
  }
}
