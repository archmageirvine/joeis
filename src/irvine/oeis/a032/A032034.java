package irvine.oeis.a032;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032034 Shifts left under "AIJ" (ordered, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032034 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.EULERIAN2.z(mN, k).shiftLeft(k + 1));
    }
    return sum;
  }
}
