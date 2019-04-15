package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000847 Number of n-input 2-output switching networks under action of GL(n,2) on the inputs and complementing group <code>C(2,2)</code> on the outputs.
 * @author Sean A. Irvine
 */
public class A000847 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = GeneralLinearCycleIndex.cycleIndex(++mN);
    return ans.apply(2).add(ans.apply(0, 2).multiply(3)).divide(4).toZ();
  }
}
