package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000877 Number of switching networks with <code>GL(n,2)</code> acting on the domain and <code>GL(2,2)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000877 implements Sequence {

  private static final CycleIndex ZGL2 = GeneralLinearCycleIndex.cycleIndex(2);

  private int mN = 0;

  @Override
  public Z next() {
    return GeneralLinearCycleIndex.cycleIndex(++mN).deBruijn(ZGL2);
  }
}
