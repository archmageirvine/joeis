package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005768 Number of convex polygons of length 2n on square lattice whose leftmost bottom vertex is strictly to the left of the rightmost top vertex.
 * @author Sean A. Irvine
 */
public class A005768 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.create(Arrays.asList(Q.ONE, new Q(-8), new Q(21), new Q(-19), Q.FOUR));
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.ONE, new Q(-10), new Q(32), new Q(-32)));
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, new Q(-12), new Q(48), new Q(-64)));
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z a = RING.coeff(NUM, DEN, mN).toZ();
    final Z c = RING.series(RING.one(), RING.sqrt1p(C, mN), mN).shift(2).coeff(mN).multiply(2).toZ();
    return a.subtract(c);
  }
}
