package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023924 Theta series of <code>A*_12</code> lattice.
 * @author Sean A. Irvine
 */
public class A023924 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z13 = Z.valueOf(13);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> eta13 = RING.eta(RING.monomial(Z.ONE, 13), mN);
    final Polynomial<Z> b = RING.series(RING.pow(eta13, 2, mN).shift(1), RING.pow(RING.eta(RING.x(), mN), 2, mN), mN);
    Polynomial<Z> c = RING.add(RING.one(), RING.multiply(b, Z.SIX));
    Polynomial<Z> bb = RING.pow(b, 2, mN);
    c = RING.add(c, RING.multiply(bb, Z.valueOf(20)));
    bb = RING.multiply(bb, b, mN);
    c = RING.add(c, RING.multiply(bb, Z.valueOf(38)));
    bb = RING.multiply(bb, b, mN);
    c = RING.add(c, RING.multiply(bb, Z.valueOf(36)));
    bb = RING.multiply(bb, b, mN);
    c = RING.add(c, RING.multiply(bb, Z.valueOf(13)));
    bb = RING.multiply(bb, b, mN);
    c = RING.add(c, bb);
    final Polynomial<Z> a = RING.add(RING.one(), RING.multiply(RING.multiply(b, Z13), c, mN));
    return RING.multiply(RING.series(RING.pow(RING.eta(RING.x(), mN), 13, mN), eta13, mN), a, mN).coeff(mN);
  }
}
