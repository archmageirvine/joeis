package irvine.oeis.a001;

import irvine.math.polynomial.CycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001150.
 * @author Sean A. Irvine
 */
public class A001150 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = GeneralLinearCycleIndex.cycleIndex(++mN);
    return ans.apply(2)
      .add(ans.apply(0, 2).multiply(3))
      .add(ans.apply(1, 2).multiply(2))
      .add(ans.apply(0, 0, 0, 2).multiply(2))
      .divide(8).toZ();
  }
}
