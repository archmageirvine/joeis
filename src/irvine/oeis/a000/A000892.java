package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000892 Number of switching networks with GL(n,2) acting on the domain and AG(2,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000892 extends Sequence1 {

  private static final CycleIndex ZAG2 = AffineGroupCycleIndex.cycleIndex(2);

  private int mN = 0;

  @Override
  public Z next() {
    return new GeneralLinearGroup<>(++mN, new GaloisField(2)).cycleIndex().deBruijn(ZAG2);
  }
}
