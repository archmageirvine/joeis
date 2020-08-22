package irvine.oeis.a032;

import irvine.math.z.Eulerian2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032034 Shifts left under "AIJ" (ordered, indistinct, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032034 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Eulerian2.SINGLETON.get(mN, (long) k).shiftLeft(k + 1));
    }
    return sum;
  }
}
