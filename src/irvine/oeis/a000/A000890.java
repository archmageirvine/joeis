package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000890.
 * @author Sean A. Irvine
 */
public class A000890 extends A000721 {

  private static final CycleIndex ZAG3 = AffineGroupCycleIndex.cycleIndex(3);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZAG3);
  }
}
