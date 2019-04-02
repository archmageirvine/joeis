package irvine.oeis.a036;

import irvine.math.polynomial.CycleIndex;
import irvine.math.group.SymmetricGroup;
import irvine.oeis.a000.A000598;

/**
 * A036718 Number of rooted trees where each node has at most 4 children.
 * @author Sean A. Irvine
 */
public class A036718 extends A000598 {

  private static final CycleIndex CYCLE_INDEX = SymmetricGroup.create(4).cycleIndex();

  @Override
  protected CycleIndex cycleIndex() {
    return CYCLE_INDEX;
  }
}

