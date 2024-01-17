package irvine.oeis.a368;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;
import irvine.util.Point;
import irvine.util.array.DynamicLongArray;

/**
 * A368054 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A368054 extends Sequence0 {

  // After John Tyler Rascoe

  private int mN = -1;
  private int mM = 0;
  private DynamicLongArray mCounts = new DynamicLongArray();

  @Override
  public Z next() {
    if (++mM >= mCounts.length()) {
      mM = 0;
      ++mN;
      mCounts = new DynamicLongArray();
      final Permutation perm = new Permutation(2 * mN);
      int[] p;
      while ((p = perm.next()) != null) {
        int cnt = 0;
        for (int j = 0; j < p.length; ++j) {
          if ((p[j] & 1) == ((j + 1) & 1)) {
            ++cnt;
          } else {
            break;
          }
        }
        if (cnt == 2 * mN) {
          final List<Point> bigX = new ArrayList<>();
          int cx = 0;
          // Internal loop for a given partition
          for (int j = 1; j < p.length; ++j) {
            int x = 0;
            int y = 0;
            if (Math.abs(p[j] - p[j - 1]) > 1) {
              x += p[j];
              y += p[j - 1];
              bigX.add(new Point(y, x));
              final int s = Integer.signum(x - y);
              if (s > 0) {
                if (p[0] < x && p[0] > y && (y & 1) != (p[0] & 1)) {
                  ++cx;
                }
              } else if (s < 0) {
                if (p[0] > x && p[0] < y && (y & 1) != (p[0] & 1)) {
                  ++cx;
                }
              }
              final int z = p.length - 1;
              if (s < 0) {
                if (p[z] < y && p[z] > x && (x & 1) != (p[z] & 1)) {
                  ++cx;
                }
              } else if (s > 0) {
                if (p[z] > y && p[z] < x && (x & 1) != (p[z] & 1)) {
                  ++cx;
                }
              }
            }
          }
          // Finds internal crossings
          if (!bigX.isEmpty()) {
            for (final Point x1 : bigX) {
              for (final Point x2 : bigX) {
                final int a = x1.left();
                final int c = x2.left();
                final int e = Math.min(x1.left(), x1.right());
                final int f = Math.max(x1.left(), x1.right());
                final int g = Math.min(x2.left(), x2.right());
                final int h = Math.max(x2.left(), x2.right());
                if ((a & 1) == (c & 1)) {
                  if ((g < e && e < h && h < f) || (g < f && f < h && e < g)) {
                    ++cx;
//                  } else if ((e < g && g < f && h > f) || (e < h && h < f && g < e)) {
//                    ++cx;
                  }
                }
                if (x2 == x1) {
                  break;
                }
              }
            }
          }
          mCounts.increment(cx);
        }
      }
    }
    return Z.valueOf(mCounts.get(mM));
  }
}
