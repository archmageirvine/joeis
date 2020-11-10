package irvine.oeis.a036;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.oeis.a000.A000598;

/**
 * A036721 G.f. satisfies A(x) = 1 + x*cycle_index(Sym(5), A(x)).
 * @author Sean A. Irvine
 */
public class A036721 extends A000598 {

  private static final CycleIndex CYCLE_INDEX = SymmetricGroup.create(5).cycleIndex();

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}

