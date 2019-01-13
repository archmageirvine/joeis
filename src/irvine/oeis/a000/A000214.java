package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000214.
 * @author Sean A. Irvine
 */
public class A000214 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).apply(1).toZ();
  }
}
