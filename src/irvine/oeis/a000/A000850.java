package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000850 Number of n-input 2-output switching networks under action of AG(n,2) on the inputs and complementing group C(2,2) on the outputs.
 * @author Sean A. Irvine
 */
public class A000850 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(2).add(ans.apply(0, 2).multiply(3)).divide(4).toZ();
  }
}
