package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000890 Number of switching networks with S(n) and C(2,2) acting on the domain and AG(2,3) acting on the range.
 * @author Sean A. Irvine
 */
public class A000890 extends A000721 {

  private static final CycleIndex ZAG3 = AffineGroupCycleIndex.cycleIndex(3);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZAG3);
  }
}
