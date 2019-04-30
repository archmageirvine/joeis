package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000896 Number of switching networks with <code>AG(n,2)</code> acting on the domain and <code>AG(3,2)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000896 implements Sequence {

  private static final CycleIndex ZAG3 = AffineGroupCycleIndex.cycleIndex(3);

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).deBruijn(ZAG3);
  }
}
