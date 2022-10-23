package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005218 Number of unlabeled reduced unit interval graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A005218 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Q FOUR = Q.FOUR;
  private static final Polynomial<Q> S = RING.subtract(RING.multiply(RING.onePlusXToTheN(2), RING.oneMinusXToTheN(Q.THREE, 2)), RING.one());
  private static final Polynomial<Q> N1 = RING.oneMinusXToTheN(Q.THREE, 1);
  private static final Polynomial<Q> D1 = RING.onePlusXToTheN(1);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ONE, Q.TWO, Q.NEG_ONE));

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> e = RING.sqrt(RING.series(N1, D1, mN), mN);
    final Polynomial<Q> d = RING.sqrt1p(S, mN);
    final Polynomial<Q> f = RING.series(C, d, mN);
    final Polynomial<Q> g = RING.subtract(RING.divide(RING.subtract(f, e), FOUR), RING.x());
    return g.coeff(mN).toZ();
  }
}

