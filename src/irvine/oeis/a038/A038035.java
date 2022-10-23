package irvine.oeis.a038;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038035 Number of labeled dyslexic planted planar trees with n+1 nodes.
 * @author Sean A. Irvine
 */
public class A038035 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.create(Arrays.asList(Q.ZERO, Q.TWO, Q.TWO.negate()));
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.TWO, Q.ZERO, Q.NEG_ONE));

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return RING.serlaplace(RING.reversion(RING.series(NUM, DEN, mN), mN)).coeff(mN).toZ();
  }
}
