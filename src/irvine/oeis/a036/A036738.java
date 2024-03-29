package irvine.oeis.a036;

import irvine.math.group.CyclicGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.oeis.a000.A000598;

/**
 * A036738 G.f. satisfies A(x) = 1 + x*cycle_index(G,A(x)) where G = cyclic group of order 43 generated by (1,2,...,43).
 * @author Sean A. Irvine
 */
public class A036738 extends A000598 {

  private static final CycleIndex CYCLE_INDEX = new CyclicGroup(43).cycleIndex();

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}

