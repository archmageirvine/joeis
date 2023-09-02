package irvine.oeis.a065;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000521;

/**
 * A065427 q-expansion of a differential resolvent.
 * @author Sean A. Irvine
 */
public class A065427 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Z Z1728 = Z.valueOf(1728);
  private static final Polynomial<Q> THREE = RING.monomial(Q.THREE, 0);
  private static final Polynomial<Q> EIGHT = RING.monomial(Q.EIGHT, 0);
  private static final Polynomial<Q> C1 = RING.monomial(Q.ONE.subtract(Q.ONE_QUARTER).subtract(new Q(1, 9)), 0);
  private final Sequence mJ = new A000521();
  private final Polynomial<Q> mJJ = RING.empty();
  private int mN = -3;

  @Override
  public Z next() {
    if (++mN < 0) {
      return Z.ZERO;
    }
    mJJ.add(new Q(mJ.next(), Z1728));
    final Polynomial<Q> jj1 = RING.subtract(mJJ, RING.x()); // we are shifted by 1
    final Polynomial<Q> c = RING.series(THREE, RING.multiply(RING.pow(jj1, 2, mN), Q.FOUR), mN);
    final Polynomial<Q> d = RING.series(EIGHT, RING.multiply(RING.pow(mJJ, 2, mN), Q.NINE), mN);
    final Polynomial<Q> e = RING.series(C1, RING.multiply(mJJ, jj1, mN), mN);
    return c.coeff(mN).add(d.coeff(mN)).subtract(e.coeff(mN)).toZ();
  }
}
