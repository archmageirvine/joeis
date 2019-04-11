package irvine.oeis.a005;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005769 Number of convex polygons of length <code>2n</code> on square lattice whose leftmost bottom vertex is strictly to the right of the rightmost top vertex.
 * @author Sean A. Irvine
 */
public class A005769 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> NUM = RING.create(Arrays.asList(Q.TWO, new Q(-20), new Q(75), new Q(-127), new Q(95), new Q(-27), new Q(4)));
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.ONE, new Q(-16), new Q(103), new Q(-340), new Q(605), new Q(-554), new Q(224), new Q(-32)));
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, new Q(-12), new Q(48), new Q(-64)));
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z a = RING.coeff(NUM, DEN, mN).toZ();
    final Z c = RING.series(RING.one(), RING.sqrt1p(C, mN), mN).coeff(mN).multiply(2).toZ();
    return a.subtract(c);
  }
}
