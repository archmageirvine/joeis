package irvine.oeis.a389;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389808 a(n) is the number of ordered pairs of integer vectors in Z^3 of norm n that span a rhombus with integer area.
 * @author Sean A. Irvine
 */
public class A389808 extends Sequence0 {

  // After Felix Huber

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int s = mN * mN;

    final ArrayList<int[]> pts = new ArrayList<>();
    for (int x = -mN; x <= mN; ++x) {
      final int xx = x * x;
      for (int y = -mN; y <= mN; ++y) {
        final int t = s - xx - y * y;
        if (t >= 0) {
          final int z = Functions.SQRT.i(t);
          if (z * z == t) {
            pts.add(new int[] {x, y, z});
            if (z != 0) {
              pts.add(new int[] {x, y, -z});
            }
          }
        }
      }
    }

    final boolean[] h = new boolean[s + 1];
    final long r = (long) s * s;
    for (int k = 0; k <= s; ++k) {
      final long u = r - (long) k * k;
      final long v = Functions.SQRT.l(u);
      h[k] = v * v == u;
    }

    long cnt = 0;
    for (final int[] p : pts) {
      for (final int[] q : pts) {
        final int dot = Math.abs(p[0] * q[0] + p[1] * q[1] + p[2] * q[2]);
        if (h[dot]) {
          ++cnt;
        }
      }
    }

    return Z.valueOf(cnt);
  }
}
