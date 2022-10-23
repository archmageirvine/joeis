package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000848 Number of n-input 3-output switching networks under action of GL(n,2) on the inputs and complementing group C(3,2) on the outputs.
 * @author Sean A. Irvine
 */
public class A000848 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    final CycleIndex ans = new GeneralLinearGroup<>(n, new GaloisField(2)).cycleIndex();
    return ans.apply(3).add(ans.apply(0, 3).multiply(7)).divide(8).toZ();
  }
}
