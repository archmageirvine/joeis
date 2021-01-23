package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000862 Number of n-input 2-output switching networks under action of AG(n,2) and complementing group C(2,2) on inputs and outputs.
 * @author Sean A. Irvine
 */
public class A000862 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(2)
      .add(ans.apply(0, 2).multiply(3))
      .add(ans.apply(1, 2).multiply(2))
      .add(ans.apply(0, 0, 0, 2).multiply(2))
      .divide(8).toZ();
  }
}
