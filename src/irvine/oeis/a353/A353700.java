package irvine.oeis.a353;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A353700 allocated for Sofia Lacerda.
 * @author Sean A. Irvine
 */
public class A353700 implements Sequence {

  // After Sofia Lacerda
  // https://gist.github.com/SofiaSL/eca994e57e519ec16228fa754dd84fd1

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 1;
  private long mZ = 0;
  private long mNMin = 3;
  private final HashMap<Long, Q> mRecord = new HashMap<>(); // record smallest circle
  {
    mRecord.put(2L, Q.ONE_QUARTER);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  private boolean inside(final long x, final long min2, final long max2) {
    return min2 <= x && x < max2;
  }

  @Override
  public Z next() {
    ++mN;
    while (!mRecord.containsKey(mN)) {
      ++mZ;
      final long min2 = (mZ - 1) * (mZ - 1);
      final long max2 = mZ * mZ;

      // Collect lattice points
      final ArrayList<long[]> lattice = new ArrayList<>();
      for (long x = -mZ; x <= mZ; ++x) {
        final long x0 = x * x;
        for (long y = -mZ; y <= mZ; ++y) {
          final long y0 = y * y;
          final long x1 = (x - 1) * (x - 1);
          final long y1 = (y - 1) * (y - 1);
          if (inside(x0 + y0, min2, max2) || inside(x0 + y1, min2, max2) || inside(x1 + y0, min2, max2) || inside(x1 + y1, min2, max2)) {
            lattice.add(new long[] {x, y});
          }
        }
      }
      while (mRecord.containsKey(mNMin)) {
        ++mNMin;
      }
      // We only need to check points in one sector of the circle
      final long sector;
      final List<long[]> check;
      if (mNMin > 16) {
        sector = 8;
        check = lattice.stream().filter(p -> !(p[1] < 0 || p[0] < 0 || p[0] + 1 < p[1])).collect(Collectors.toList());
      } else if (mNMin > 8) {
        sector = 4;
        check = lattice.stream().filter(p -> !(p[1] < 0 || p[0] < 0)).collect(Collectors.toList());
      } else if (mNMin > 4) {
        sector = 2;
        check = lattice.stream().filter(p -> p[1] >= 0).collect(Collectors.toList());
      } else {
        sector = 1;
        check = lattice;
      }
      if (mVerbose) {
        StringUtils.message("Checking radius <" + mZ + "] [nmin=" + mNMin + "] [" + check.size() + " points in 1/" + sector + " sector] ...");
      }
      final long[][] chk = check.toArray(new long[0][]);
      // Choose two lattice points
      for (int i = 0; i < chk.length - 2; ++i) {
        final long[] p1 = chk[i];
        final long x1 = p1[0];
        final long y1 = p1[1];
        final long x12 = x1 * x1;
        final long y12 = y1 * y1;
        for (int j = i + 1; j < chk.length - 1; ++j) {
          final long[] p2 = chk[j];
          final long x2 = p2[0];
          final long y2 = p2[1];
          // The parameters for the perpendicular bisector of p1 and p2 (Ax + By = C)
          final long a1 = 2 * (x2 - x1);
          final long b1 = 2 * (y2 - y1);
          final long c1 = x12 - x2 * x2 + y12 - y2 * y2;
          // Does it pass through the origin square
          final long t = a1 + b1 + 2 * c1;
          if (t * t > 2 * (a1 * a1 + b1 * b1)) {
            continue;
          }
          // Choose the remaining lattice point
          for (int k = j + 1; k < chk.length; ++k) {
            final long[] p3 = chk[k];
            final long x3 = p3[0];
            final long y3 = p3[1];
            // The parameters for the perpendicular bisector of p1 and p3 (Ax + By = C)
            final long a2 = 2 * (x3 - x1);
            final long b2 = 2 * (y3 - y1);
            // Check they are not parallel
            final long d = a1 * b2 - a2 * b1;
            if (d == 0) {
              continue;
            }
            final long da = Math.abs(d);
            final long c2 = x12 - x3 * x3 + y12 - y3 * y3;
            // Do they intersect the square
            final long u0 = a2 * c1 - a1 * c2;
            if (u0 * d < 0 || Math.abs(u0) > da) {
              continue; // y0 < 0 or y0 > 1
            }
            final long v0 = b1 * c2 - b2 * c1;
            if (v0 * d < 0 || Math.abs(v0) > da) {
              continue; // x0 < 0 or x0 > 1
            }
            // Work out the radius of the circle
            final long wx0 = v0 - d * x1;
            final long wy0 = u0 - d * y1;
            final long s2 = wx0 * wx0 + wy0 * wy0;
            final long d2 = d * d;
            if (s2 < d2 * min2 || s2 >= d2 * max2) {
              continue;
            }
            // Count lattice points with the same distance
            final long n = lattice.stream().filter(pt -> {
              final long q0 = u0 - d * pt[0];
              final long q1 = v0 - d * pt[1];
              return q0 * q0 + q1 * q1 == s2;
            }).count();
            final Q r2 = new Q(s2, d2);
            if (!mRecord.containsKey(n) || r2.compareTo(mRecord.get(n)) < 0) {
              // Record (distance squared, canonical centre)
              if (mVerbose) {
                StringUtils.message(n + " -> " + r2);
              }
              mRecord.put(n, r2);
            }
          }
        }
      }
    }
    return select(mRecord.get(mN));
  }
}
