package irvine.oeis.a038;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038038.
 * @author Sean A. Irvine
 */
public class A038038 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.monomial(Q.TWO, 1);
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.TWO, Q.ONE, Q.HALF));
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return RING.serlaplace(RING.reversion(RING.series(NUM, RING.subtract(DEN, RING.log1p(NEG_X, mN)), mN), mN)).coeff(mN).toZ();
  }
}
