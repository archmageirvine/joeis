package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000889 Number of switching networks with S(n) and <code>C(2,2)</code> acting on the domain and AG(2,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000889 extends A000721 {

  private static final CycleIndex ZAG2 = AffineGroupCycleIndex.cycleIndex(2);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZAG2);
  }
}
