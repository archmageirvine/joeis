package irvine.oeis.a069;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069729 Number of rooted non-separable bi-Eulerian planar maps with 2n edges. Bi-Eulerian means all its vertices and faces are of even valency.
 * @author Sean A. Irvine
 */
public class A069729 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.NEG_ONE, new Q(-30), new Q(18)));
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.ONE, new Q(-36), new Q(432), new Q(-1728))); // (1-12*x)^3
  private static final Polynomial<Q> C3 = RING.create(Arrays.asList(new Q(48), new Q(216), new Q(324), new Q(162))); // 6 * (3*x+2)^3
  private static final Polynomial<Q> C4 = RING.negate(RING.pow(RING.onePlusXToTheN(1), 4)); // -(1+x)^4
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    return RING.reversion(RING.series(RING.multiply(C4, RING.add(C1, RING.sqrt(C2, mN))), C3, mN), mN).coeff(mN).toZ();
  }
}

