package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000880 Number of switching networks with AG(n,2) acting on the domain and GL(2,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000880 extends Sequence1 {

  private static final CycleIndex ZGL2 = new GeneralLinearGroup<>(2, new GaloisField(2)).cycleIndex();

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).deBruijn(ZGL2);
  }
}
