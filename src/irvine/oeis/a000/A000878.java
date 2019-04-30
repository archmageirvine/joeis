package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000878 Number of switching networks with <code>GL(n,2)</code> acting on the domain and <code>GL(2,2)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000878 implements Sequence {

  private static final CycleIndex ZGL3 = GeneralLinearCycleIndex.cycleIndex(3);

  private int mN = 0;

  @Override
  public Z next() {
    return GeneralLinearCycleIndex.cycleIndex(++mN).deBruijn(ZGL3);
  }
}
