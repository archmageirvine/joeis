package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A035283 Expansion of zeta function of ring H(Q(sqrt(2)).
 * @author Sean A. Irvine
 */
public class A035283 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new PrependSequence(new A035185(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z sum = Z.ZERO;
      for (int k = 1; k <= mN; ++k) {
        final int t = mN / k;
        if (t * k == mN) {
          sum = sum.add(mA.a(t).multiply(mA.a(k).multiply(k)));
        }
      }
      if (!sum.isZero()) {
        return sum;
      }
    }
  }
}
