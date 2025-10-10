package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387380 a(n) = number of strict quartets (n,u,v,w) of type 4; see Comments.
 * @author Sean A. Irvine
 */
public class A387380 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long u = 1; u < mN; ++u) {
      final long t = mN * (mN - u);
      for (long v = 2; v < mN; ++v) {
        if (u != v && t % v == 0) {
          final long w = t / v - v;
          if (w > 0 && w != u && w != v && w != mN) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

