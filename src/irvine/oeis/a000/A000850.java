package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000850 Number of <code>n-input 2-output</code> switching networks under action of <code>AG(n,2)</code> on the inputs and complementing group <code>C(2,2)</code> on the outputs.
 * @author Sean A. Irvine
 */
public class A000850 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(2).add(ans.apply(0, 2).multiply(3)).divide(4).toZ();
  }
}
