package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000213;

/**
 * A046733.
 * @author Sean A. Irvine
 */
public class A046733 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return Z.ONE;
    }
    if (mN % 27 == 0 || mN % 91 == 0) {
      // 3^m, m >= 3 apparently has no solution.

      // For example, n = 91 = 7 * 13.
      // We have 7 occurs at 10 + 16 * s and 13 at 35 + 56 * t.  Hence 7 and 13
      // will never occur together.

      // There could be other situations like this that will occur

      return Z.ONE;
    }
    final MemorySequence a = MemorySequence.cachedSequence(new A000213());
    int first = -1;
    int k = 0;
    while (true) {
      ++k;
      if (a.a(k).mod(mN) == 0) {
        if (first == -1) {
          first = k;
        } else {
          final int p = k - first;
          if (a.a(first + 2 * p).mod(mN) == 0
            && a.a(first + 3 * p).mod(mN) == 0) {
            return Z.valueOf(p);
          }
        }
      }
    }
  }
}

