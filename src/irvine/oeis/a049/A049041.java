package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a003.A003422;
import irvine.oeis.memory.MemorySequence;

/**
 * A049041 Least k &gt; 0 such that A049042(n) | A003422(k-1).
 * @author Sean A. Irvine
 */
public class A049041 extends A000040 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A003422());

  @Override
  public Z next() {
    while (true) {
      final int p = super.next().intValueExact();
      for (int k = 2; k <= p; ++k) {
        if (mA.a(k).mod(p) == 0) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
