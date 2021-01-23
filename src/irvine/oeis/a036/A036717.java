package irvine.oeis.a036;

import irvine.math.group.AlternatingGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.oeis.a000.A000598;

/**
 * A036717 G.f. satisfies A(x) = 1 + x*cycle_index(Alt(4), A(x)).
 * @author Sean A. Irvine
 */
public class A036717 extends A000598 {

  private static final CycleIndex CYCLE_INDEX = AlternatingGroup.create(4).cycleIndex();

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}
