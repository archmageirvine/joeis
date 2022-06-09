package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000614 Complemented types of Boolean functions of n variables under action of AG(n,2).
 * @author Sean A. Irvine
 */
public class A000614 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ans = AffineGroupCycleIndex.cycleIndex(++mN);
    return ans.apply(1).add(ans.apply(0, 1)).toZ().divide2();
  }
}
