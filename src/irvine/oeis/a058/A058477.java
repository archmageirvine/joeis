package irvine.oeis.a058;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000311;

/**
 * A058477 Total number of multiple edges in all essentially series series-parallel networks with n labeled edges, multiple edges allowed.
 * @author Sean A. Irvine
 */
public class A058477 extends A000311 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = Polynomial.create(Q.NEG_ONE, Q.ONE);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private int mN = -1;
  private Z mF = Z.ONE;
  private final Polynomial<Q> mA = RING.empty();

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA.add(new Q(super.next(), mF));
    final Polynomial<Q> t = RING.add(RING.exp(NEG_X, mN), C1);
    return RING.multiply(t, RING.diff(mA), mN).coeff(mN).subtract(t.coeff(mN)).multiply(mF).toZ();
  }
}

