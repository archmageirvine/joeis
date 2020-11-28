package irvine.oeis.a036;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A036783 G.f. satisfies A(x) = 1 + x*cycle_index(G,A(x)) where G = tetragonal pyramid group of order 4 with cycle index (A1^5+2*A1*A4+A1*A2^2)/4.
 * @author Sean A. Irvine
 */
public class A036783 extends A000598 {

  private static final CycleIndex CYCLE_INDEX;

  static {
    final MultivariateMonomial m0 = MultivariateMonomial.create(1, Z.ONE, Q.HALF);
    m0.add(4, Z.ONE);
    final MultivariateMonomial m1 = MultivariateMonomial.create(1, Z.ONE, Q.ONE_QUARTER);
    m1.add(2, Z.TWO);
    CYCLE_INDEX = new CycleIndex("G", MultivariateMonomial.create(1, Z.FIVE, Q.ONE_QUARTER), m0, m1);
  }

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}
