package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000847 Number of n-input 2-output switching networks under action of GL(n,2) on the inputs and complementing group C(2,2) on the outputs.
 * @author Sean A. Irvine
 */
public class A000847 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = new GeneralLinearGroup<>(++mN, new GaloisField(2)).cycleIndex();
    return ans.apply(2).add(ans.apply(0, 2).multiply(3)).divide(4).toZ();
  }
}
