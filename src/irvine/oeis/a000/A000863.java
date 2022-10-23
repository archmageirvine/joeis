package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000863 Number of n-input 3-output switching networks under action of AG(n,2) and complementing group C(2,3) on inputs and outputs.
 * @author Sean A. Irvine
 */
public class A000863 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(3)
      .add(ans.apply(0, 3).multiply(13))
      .add(ans.apply(1, 1, 3).multiply(8))
      .add(ans.apply(2, 3).multiply(6))
      .add(ans.apply(0, 0, 0, 3).multiply(12))
      .add(ans.apply(0, 1, 0, 1, 0, 3).multiply(8))
      .divide(48).toZ();
  }
}
