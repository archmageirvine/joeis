package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387379 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A387379 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long u = 1; u < mN; ++u) {
      final long t = mN * (mN - u);
      for (long v = 1; v < mN; ++v) {
        if (t % v == 0 && t / v - v > 0) {
          if (mN == 2) {
            System.out.println("(" + mN + "," + u + "," + v + "," + (t / v - v) + ")");
          }
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

