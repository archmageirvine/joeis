package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000820 Number of switching networks under action of <code>AG_n(Z_2)</code>.
 * @author Sean A. Irvine
 */
public class A000820 implements Sequence {

  int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(2).toZ();
  }
}
