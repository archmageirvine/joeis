package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000821 Number of switching networks under action of AG_n(Z_2).
 * @author Sean A. Irvine
 */
public class A000821 extends Sequence1 {

  int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).apply(3).toZ();
  }
}
