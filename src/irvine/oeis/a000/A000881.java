package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000881 Number of switching networks with AG(n,2) acting on the domain and GL(3,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000881 extends Sequence1 {

  private static final CycleIndex ZGL3 = new GeneralLinearGroup<>(3, new GaloisField(2)).cycleIndex();

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).deBruijn(ZGL3);
  }
}
