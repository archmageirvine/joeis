package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000835 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000835 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(2).add(ans.apply(1, 2)).divide(2).toZ();
  }
}
