package irvine.oeis.a036;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.oeis.a000.A000598;

/**
 * A036722 G.f. satisfies A(x) = 1 + x*cycle_index(Sym(6), A(x)).
 * @author Sean A. Irvine
 */
public class A036722 extends A000598 {

  private static final CycleIndex CYCLE_INDEX = SymmetricGroup.create(6).cycleIndex();

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}

