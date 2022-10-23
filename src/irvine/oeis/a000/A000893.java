package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000893 Number of switching networks with GL(n,2) acting on the domain and AG(3,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000893 extends Sequence1 {

  private static final CycleIndex ZAG3 = AffineGroupCycleIndex.cycleIndex(3);

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    return new GeneralLinearGroup<>(n, new GaloisField(2)).cycleIndex().deBruijn(ZAG3);
  }
}
