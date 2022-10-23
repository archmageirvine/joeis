package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000895 Number of switching networks with AG(n,2) acting on the domain and AG(2,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000895 extends Sequence1 {

  private static final CycleIndex ZAG2 = AffineGroupCycleIndex.cycleIndex(2);

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).deBruijn(ZAG2);
  }
}
