package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000889.
 * @author Sean A. Irvine
 */
public class A000889 extends A000721 {

  private static final CycleIndex ZAG2 = AffineGroupCycleIndex.cycleIndex(2);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZAG2);
  }
}
