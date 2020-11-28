package irvine.oeis.a036;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.MultivariateMonomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A036784 G.f. satisfies A(x) = 1 + x*cycle_index(G,A(x)) where G = tetragonal pyramid group of order 8 with cycle index (A1^5+2*A1*A4+3*A1*A2^2+2*A1^3*A2)/8.
 * @author Sean A. Irvine
 */
public class A036784 extends A000598 {

  private static final CycleIndex CYCLE_INDEX;
  private static final Q ONE_EIGHTH = new Q(1, 8);
  private static final Q THREE_EIGHTHS = new Q(3, 8);

  static {
    final MultivariateMonomial m0 = MultivariateMonomial.create(1, Z.ONE, Q.ONE_QUARTER);
    m0.add(4, Z.ONE);
    final MultivariateMonomial m1 = MultivariateMonomial.create(1, Z.ONE, THREE_EIGHTHS);
    m1.add(2, Z.TWO);
    final MultivariateMonomial m2 = MultivariateMonomial.create(1, Z.THREE, Q.ONE_QUARTER);
    m2.add(2, Z.ONE);
    CYCLE_INDEX = new CycleIndex("G", MultivariateMonomial.create(1, Z.FIVE, ONE_EIGHTH), m0, m1, m2);
  }

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}

