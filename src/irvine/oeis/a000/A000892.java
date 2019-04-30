package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000892 Number of switching networks with <code>GL(n,2)</code> acting on the domain and <code>AG(2,2)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000892 implements Sequence {

  private static final CycleIndex ZAG2 = AffineGroupCycleIndex.cycleIndex(2);

  private int mN = 0;

  @Override
  public Z next() {
    return GeneralLinearCycleIndex.cycleIndex(++mN).deBruijn(ZAG2);
  }
}
