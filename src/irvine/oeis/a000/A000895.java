package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000895.
 * @author Sean A. Irvine
 */
public class A000895 implements Sequence {

  private static final CycleIndex ZAG2 = AffineGroupCycleIndex.cycleIndex(2);

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).deBruijn(ZAG2);
  }
}
