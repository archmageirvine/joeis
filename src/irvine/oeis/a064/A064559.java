package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;

/**
 * A064559 Number of iterations in A064553 to reach a fixed point.
 * @author Sean A. Irvine
 */
public class A064559 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A064553());
  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    int m = ++mN;
    while (true) {
      final int t = mA.a(m - 1).intValueExact();
      if (t == m) {
        return Z.valueOf(cnt);
      }
      m = t;
      ++cnt;
    }
  }
}

