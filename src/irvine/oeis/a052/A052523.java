package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052523 Number of unlabeled mobiles with cycles of length at least 3.
 * @author Sean A. Irvine
 */
public class A052523 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Polynomial<Q> mS = RING.x();

  @Override
  public Z next() {
    if (++mN > 2) {
      Polynomial<Q> b = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        final Polynomial<Q> log = RING.log(RING.series(RING.one(), RING.subtract(RING.one(), mS.substitutePower(k, mN)), mN), mN);
        b = RING.add(b, RING.multiply(log, new Q(LongUtils.phi(k), k)));
      }
      final Polynomial<Q> s2 = RING.divide(RING.add(mS.substitutePower(2, mN), RING.pow(mS, 2, mN)), Q.TWO);
      b = RING.subtract(RING.subtract(b, mS), s2);
      mS = RING.add(b, RING.x());
    }
    return mS.coeff(mN).toZ();
  }
}

