package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000890 Number of switching networks with <code>S(n)</code> and <code>C(2,2)</code> acting on the domain and <code>AG(2,3)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000890 extends A000721 {

  private static final CycleIndex ZAG3 = AffineGroupCycleIndex.cycleIndex(3);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZAG3);
  }
}
