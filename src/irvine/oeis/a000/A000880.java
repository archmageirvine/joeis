package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000880.
 * @author Sean A. Irvine
 */
public class A000880 implements Sequence {

  private static final CycleIndex ZGL2 = GeneralLinearCycleIndex.cycleIndex(2);

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).deBruijn(ZGL2);
  }
}
