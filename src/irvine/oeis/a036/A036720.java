package irvine.oeis.a036;

import irvine.math.group.KleinGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.oeis.a000.A000598;

/**
 * A036720 G.f. satisfies A(x) = 1 + x*cycle_index(Klein_4_group, A(x)).
 * @author Sean A. Irvine
 */
public class A036720 extends A000598 {

  private static final CycleIndex CYCLE_INDEX = new KleinGroup().cycleIndex();

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}
