package irvine.oeis.a004;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004015 Theta series of face-centered cubic <code>(f.c.c.)</code> lattice.
 * @author Sean A. Irvine
 */
public class A004015 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NEGX = RING.negate(RING.x());

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final Polynomial<Z> phi = A004013.phi(mN);
    final Polynomial<Z> p = RING.pow(phi, 3, mN);
    final Polynomial<Z> q = RING.pow(RING.substitute(phi, NEGX, mN), 3, mN);
    return p.coeff(mN).add(q.coeff(mN)).divide2();
  }
}
