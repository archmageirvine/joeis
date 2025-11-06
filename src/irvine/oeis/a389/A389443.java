package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389443 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A389443 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long y = 2; 2 * y < mN - 2; ++y) {
      for (long z = y + 1; y + z < mN; ++z) {
        final long b = y + z;
        if (mN % b == 0) {
          final long m = mN / b;
          for (long w = 1; w < y && 2 * w < m; ++w) {
            final long c = m - w;
            if (c != y && c != z) {
              ++cnt;
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
