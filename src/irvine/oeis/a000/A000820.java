package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000820 Number of switching networks under action of AG_n(Z_2) acting on 2 variables.
 * @author Sean A. Irvine
 */
public class A000820 extends Sequence1 {

  int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(2).toZ();
  }
}
