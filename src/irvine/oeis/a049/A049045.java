package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003422;

/**
 * A049045 Domain of A049044.
 * @author Sean A. Irvine
 */
public class A049045 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A003422());
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (int k = 1; k <= mN; ++k) {
        if (mA.a(k).mod(mN) == 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
