package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007544 Frequency of n-th largest distance in N times N times N grid, N &gt; n.
 * @author Sean A. Irvine
 */
public class A007544 implements Sequence {

  // There is probably a formula for this.

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long[] count = new long[3 * mN * mN + 1];
    for (int x0 = 0; x0 <= mN; ++x0) {
      for (int y0 = 0; y0 <= mN; ++y0) {
        for (int z0 = 0; z0 <= mN; ++z0) {
          for (int x1 = 0; x1 <= mN; ++x1) {
            for (int y1 = 0; y1 <= mN; ++y1) {
              for (int z1 = 0; z1 <= mN; ++z1) {
                final int dx = x0 - x1;
                final int dy = y0 - y1;
                final int dz = z0 - z1;
                ++count[dx * dx + dy * dy + dz * dz];
              }
            }
          }
        }
      }
    }
    int k = count.length;
    int j = 0;
    while (true) {
      if (count[--k] != 0) {
        ++j;
      }
      if (j == mN) {
        return Z.valueOf(count[k] / 2);
      }
    }
  }
}
