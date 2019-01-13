package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006848.
 * @author Sean A. Irvine
 */
public class A006848 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> E_NUM = RING.create(Arrays.asList(Q.ZERO, new Q(-3), Q.NEG_ONE, Q.TWO, Q.ONE));
  private static final Polynomial<Q> E_DEN = RING.create(Arrays.asList(Q.TWO.negate(), Q.ZERO, Q.TWO));
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> exp = RING.exp(RING.series(E_NUM, E_DEN, mN), mN);
    final Polynomial<Q> r = RING.subtract(RING.series(RING.onePlusXToTheN(1), RING.oneMinusXToTheN(1), mN), RING.one());
    final Polynomial<Q> root = RING.sqrt(RING.sqrt1p(r, mN), mN);
    final Polynomial<Q> egf = RING.multiply(root, exp, mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
