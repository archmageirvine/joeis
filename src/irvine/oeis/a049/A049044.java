package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003422;

/**
 * A049044 Least k &gt; 0 such that A049045(n) | A003422(k-1).
 * @author Sean A. Irvine
 */
public class A049044 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A003422());
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (int k = 1; k <= mN; ++k) {
        if (mA.a(k).mod(mN) == 0) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
