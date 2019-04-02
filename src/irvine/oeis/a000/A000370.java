package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000370 Number of NPN-equivalence classes of Boolean functions of n or fewer variables.
 * @author Sean A. Irvine
 */
public class A000370 extends A000610 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex ans = f(mN);
    return ans.apply(1).add(ans.apply(0, 1)).toZ().divide(2);
  }
}
