package irvine.oeis.a353;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;
import irvine.util.string.StringUtils;

/**
 * A058010.
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

  private static class Point extends Pair<Q, Q> {
    private Point(final Q x, final Q y) {
      super(x, y);
    }

    private Point canonical() {
      Q x = left().subtract(left().toZ());
      Q y = right().subtract(right().toZ());
      if (y.compareTo(Q.HALF) > 0) {
        y = Q.ONE.subtract(y);
      }
      if (x.compareTo(Q.HALF) > 0) {
        x = Q.ONE.subtract(x);
      }
      return y.compareTo(x) > 0 ? new Point(y, x) : new Point(x, y);
    }
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
        for (long y = -mZ; y <= mZ; ++y) {
          final long x0 = x * x;
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
      final long kk;
      final List<long[]> check;
      if (mNMin > 16) {
        kk = 8;
        check = lattice.stream().filter(p -> !(p[1] < 0 || p[0] < 0 || p[0] + 1 < p[1])).collect(Collectors.toList());
      } else if (mNMin > 8) {
        kk = 4;
        check = lattice.stream().filter(p -> !(p[1] < 0 || p[0] < 0)).collect(Collectors.toList());
      } else if (mNMin > 4) {
        kk = 2;
        check = lattice.stream().filter(p -> p[1] >= 0).collect(Collectors.toList());
      } else {
        kk = 1;
        check = lattice;
      }
      if (mVerbose) {
        StringUtils.message("Checking radius <" + mZ + "] [nmin=" + mNMin + "] [" + check.size() + " points in 1/" + kk + " sector] ...");
      }
      final long[][] chk = check.toArray(new long[0][]);

      // Choose two lattice points
      for (int i = 0; i < chk.length - 2; ++i) {
        final long[] p1 = chk[i];
        final long x1 = p1[0];
        final long y1 = p1[1];
        for (int j = i + 1; j < chk.length - 1; ++j) {
          final long[] p2 = chk[j];
          final long x2 = p2[0];
          final long y2 = p2[1];
          // The parameters for the perpendicular bisector of p1 and p2 (Ax + By = C)
          final long a1 = 2 * (x2 - x1);
          final long b1 = 2 * (y2 - y1);
          final long c1 = x1 * x1 - x2 * x2 + y1 * y1 - y2 * y2;
          // Does it pass through the origin square
          final Q t = Q.HALF.multiply(a1 + b1).add(c1);
          final Q d2 = t.square().divide(a1 * a1 + b1 * b1);
          if (d2.compareTo(Q.HALF) > 0) {
            continue;
          }
          // Choose the remaining lattice point
          for (int k = j + 1; k < check.size(); ++k) {
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
            final long c2 = x1 * x1 - x3 * x3 + y1 * y1 - y3 * y3;
            // Do they intersect the square
            final Q y0 = new Q(a2 * c1 - a1 * c2, d);
            if (y0.signum() < 0 || y0.compareTo(Q.ONE) > 0) {
              continue;
            }
            final Q x0 = new Q(b1 * c2 - b2 * c1, d);
            if (x0.signum() < 0 || x0.compareTo(Q.ONE) > 0) {
              continue;
            }
            // Work out the radius of the circle
            final Q r2 = x0.subtract(x1).square().add(y0.subtract(y1).square());
            if (!(new Q(min2).compareTo(r2) <= 0 && r2.compareTo(new Q(max2)) < 0)) {
              continue;
            }
            // Count lattice points with the same distance
            final long n = lattice.stream().filter(pt -> x0.subtract(pt[0]).square().add(y0.subtract(pt[1]).square()).equals(r2)).count();
            if (!mRecord.containsKey(n) || r2.compareTo(mRecord.get(n)) < 0) {
              // Record (distance squared, canonical centre)
              mRecord.put(n, r2);
            }
          }
        }
      }
    }
    return select(mRecord.get(mN));
  }
}
