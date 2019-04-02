package irvine.oeis.a005;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A005223 Number of Dyck paths of knight moves.
 * @author Sean A. Irvine
 */
public class A005223 extends A005222 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> g = RING.subtract(RING.one(), RING.series(RING.one(), a(), mN));
    return g.coeff(mN).toZ();
  }
}
