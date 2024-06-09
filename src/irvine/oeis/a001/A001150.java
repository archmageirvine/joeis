package irvine.oeis.a001;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001150 Number of n-input 2-output switching networks with GL(n,2) acting on the input and S(2) and C(2,2) acting on the output.
 * @author Sean A. Irvine
 */
public class A001150 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = new GeneralLinearGroup<>(++mN, new GaloisField(2)).cycleIndex();
    return ans.apply(2)
      .add(ans.apply(0, 2).multiply(3))
      .add(ans.apply(1, 2).multiply(2))
      .add(ans.apply(0, 0, 0, 2).multiply(2))
      .divide(8).toZ();
  }
}
