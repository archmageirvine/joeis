package irvine.oeis.a333;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A333006 Number of rooted <code>level-2</code> phylogenetic networks with n labeled leaves, when multiple <code>(i.e.</code>, parallel) edges are not allowed.
 * @author Sean A. Irvine
 */
public class A333006 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.create(Arrays.asList(Q.ZERO, new Q(36), new Q(-102), new Q(159), new Q(-148), new Q(81), new Q(-24), Q.THREE));
  private static final Polynomial<Q> DEN = RING.multiply(RING.pow(RING.oneMinusXToTheN(1), 6), new Q(4));

  private int mN = 0;
  private Z mF = Z.ONE;
  private Polynomial<Q> mU = RING.zero();

  private Polynomial<Q> phi(final Polynomial<Q> u, final int maxDegree) {
    return RING.substitute(RING.series(RING.one(), RING.subtract(RING.one(), RING.series(NUM, DEN, maxDegree)), maxDegree), u, maxDegree);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mU = phi(mU, mN).shift(1);
    return mU.coeff(mN).multiply(mF).toZ();
  }
}
