package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000851 Number of <code>n-input 3-output</code> switching networks under action of <code>AG(n,2)</code> on the inputs and complementing group <code>C(3,2)</code> on the outputs.
 * @author Sean A. Irvine
 */
public class A000851 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(3).add(ans.apply(0, 3).multiply(7)).divide(8).toZ();
  }
}
