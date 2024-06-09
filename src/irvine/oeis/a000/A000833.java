package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000833 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000833 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = new GeneralLinearGroup<>(++mN, new GaloisField(2)).cycleIndex();
    return ans.apply(3)
      .add(ans.apply(2, 3).multiply(3))
      .add(ans.apply(1, 1, 3).multiply(2))
      .divide(6)
      .toZ();
  }
}
