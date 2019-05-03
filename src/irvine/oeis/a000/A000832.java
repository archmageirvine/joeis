package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000832 Number of switching networks (see Harrison reference for precise <code>definition)</code>.
 * @author Sean A. Irvine
 */
public class A000832 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = GeneralLinearCycleIndex.cycleIndex(++mN);
    return ans.apply(2).add(ans.apply(1, 2)).divide(2).toZ();
  }
}
