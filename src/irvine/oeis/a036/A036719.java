package irvine.oeis.a036;

import irvine.math.group.CyclicGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.oeis.a000.A000598;

/**
 * A036719 G.f. satisfies A(x) = 1 + x*cycle_index(Cyclic(4), A(x)).
 * @author Sean A. Irvine
 */
public class A036719 extends A000598 {

  private static final CycleIndex CYCLE_INDEX = new CyclicGroup(4).cycleIndex();

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}
