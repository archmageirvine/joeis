package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000847.
 * @author Sean A. Irvine
 */
public class A000847 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = GeneralLinearCycleIndex.cycleIndex(++mN);
    return ans.apply(2).add(ans.apply(0, 2).multiply(3)).divide(4).toZ();
  }
}
