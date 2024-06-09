package irvine.oeis.a001;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001152 Number of n-input 3-output switching networks with GL(n,2) acting on the input and S(3) and C(2,3) acting on the output.
 * @author Sean A. Irvine
 */
public class A001152 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = new GeneralLinearGroup<>(++mN, new GaloisField(2)).cycleIndex();
    return ans.apply(3)
      .add(ans.apply(0, 3).multiply(13))
      .add(ans.apply(1, 1, 3).multiply(8))
      .add(ans.apply(2, 3).multiply(6))
      .add(ans.apply(0, 0, 0, 3).multiply(12))
      .add(ans.apply(0, 1, 0, 1, 0, 3).multiply(8))
      .divide(48).toZ();
  }
}
