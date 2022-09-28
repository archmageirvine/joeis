package irvine.oeis.a059;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059518 a(n)/n^2 is the minimal average squared Euclidean distance of n points to their center of gravity among all configurations of n points on the hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A059518 implements Sequence {

  // todo this is wrong -- bad coordinate system

  private static final int[] CLOCKWISE = {0, 2, 4, 1, 5, 3};
  private static final Lattice L = Lattices.HEXAGONAL;
  private static final double COS30 = Math.cos(Math.PI / 6);
  private long mN = 0;
  private long mSumX = 0;
  private long mSumY = 0;
  private final HashSet<Long> mUsed = new HashSet<>();
  private final LinkedList<Long> mPts = new LinkedList<>();

  private double sqDistSum(final double cx, final double cy) {
    double sqSum = 0;
    for (final long pt : mUsed) {
      final long x = L.ordinate(pt, 0);
      final long y = L.ordinate(pt, 1);
      final double dx = cx - 0.5 * x;
      final double dy = cy - COS30 * y;
      sqSum += dx * dx + dy * dy;
    }
    return sqSum;
  }

  private long[] neighbours(final Set<Long> set) {
    final HashSet<Long> t = new HashSet<>();
    for (final long pt : set) {
      for (final long q : L.neighbours(pt)) {
        if (!set.contains(q)) {
          t.add(q);
        }
      }
    }
    final long[] res = new long[t.size()];
    int k = 0;
    for (final long p : t) {
      res[k++] = p;
    }
    return res;
  }

  private double sqDistance(final Set<Long> pts) {
    long sumX = 0;
    long sumY = 0;
    for (final long pt : pts) {
      sumX += L.ordinate(pt, 0);
      sumY += L.ordinate(pt, 1);
    }
    final double cx = 0.5 * sumX / pts.size();
    final double cy = COS30 * sumY / pts.size();
    double sqd = 0;
    for (final long pt : pts) {
      final double rx = cx - 0.5 * L.ordinate(pt, 0);
      final double ry = cy - COS30 * L.ordinate(pt, 1);
      sqd += rx * rx + ry * ry;
    }
    return sqd;
  }

  private void step() {
    // Takes existing solution for n - 1, and throws away one point, then
    // tries adding two points in all possible ways to get best answer for n
    // (At the moment this works up to n=31)
    double bestSqDistance = Double.POSITIVE_INFINITY;
    long bestA = 0;
    long bestB = 0;
    long bestR = 0;
    for (final long pt : mUsed) {
      final HashSet<Long> base = new HashSet<>(mUsed);
      base.remove(pt); // drop one existing point
      final long[] neighbours = neighbours(base);
      // Choose 2 distinct points from neighbours to add
      for (final long a : neighbours) {
        base.add(a);
        for (final long b : neighbours) {
          if (a == b) {
            break;
          }
          base.add(b);
          final double sqDistance = sqDistance(base);
          if (sqDistance < bestSqDistance) {
            bestSqDistance = sqDistance;
            bestR = pt;
            bestA = a;
            bestB = b;
          }
          base.remove(b);
        }
        base.remove(a);
      }
    }
    mUsed.remove(bestR);
    mUsed.add(bestA);
    mUsed.add(bestB);
  }

  private void step2() {
    // Takes existing solution for n - 1, and throws away one point, then
    // tries adding two points in all possible ways to get best answer for n
    // (At the moment this works up to n=31)
    double bestSqDistance = Double.POSITIVE_INFINITY;
    long bestA = 0;
    long bestB = 0;
    long bestC = 0;
    long bestR1 = 0;
    long bestR2 = 0;
    for (final long pt1 : mUsed) {
      for (final long pt2 : mUsed) {
        if (pt1 == pt2) {
          break;
        }
        final HashSet<Long> base = new HashSet<>(mUsed);
        base.remove(pt1); // drop one existing point
        base.remove(pt2); // drop other existing point
        final long[] neighbours = neighbours(base);
        // Choose 3 distinct points from neighbours to add
        for (final long a : neighbours) {
          base.add(a);
          for (final long b : neighbours) {
            if (a == b) {
              break;
            }
            base.add(b);
            for (final long c : neighbours) {
              if (c == b) {
                break;
              }
              base.add(c);
              final double sqDistance = sqDistance(base);
              if (sqDistance < bestSqDistance) {
                bestSqDistance = sqDistance;
                bestR1 = pt1;
                bestR2 = pt2;
                bestA = a;
                bestB = b;
                bestC = c;
              }
              base.remove(c);
            }
            base.remove(b);
          }
          base.remove(a);
        }
      }
    }
    mUsed.remove(bestR1);
    mUsed.remove(bestR2);
    mUsed.add(bestA);
    mUsed.add(bestB);
    mUsed.add(bestC);
  }

  // Compute what the square distance sum would be if this point were added to the set
  private double sqDistance(final long pt) {
    final long x = L.ordinate(pt, 0);
    final long y = L.ordinate(pt, 1);
    final double cx = 0.5 * (mSumX + x) / mN;
    final double cy = COS30 * (mSumY + y) / mN;
    final double rx = cx - 0.5 * x;
    final double ry = cy - COS30 * y;
    return sqDistSum(cx, cy) + rx * rx + ry * ry;
  }


  @Override
  public Z next() {
    if (++mN == 1) {
      mUsed.add(L.origin());
      mPts.add(L.origin());
      return Z.ZERO;
    } else if (mN > 3) {
      step(); // step2() does not help getting n==31
      return Z.valueOf(Math.round(sqDistance(mUsed) * mN));
    } else {
      // Find closest unused point
      double bestSqDistance = Double.POSITIVE_INFINITY;
      long bestPt = 0;
      for (final long pt : mUsed) {
        for (final long q : L.neighbours(pt)) {
          if (!mUsed.contains(q)) {
            final double sqDistance = sqDistance(q);
            if (sqDistance < bestSqDistance) {
              bestSqDistance = sqDistance;
              bestPt = q;
            }
          }
        }
      }
      mUsed.add(bestPt);
      final long x = L.ordinate(bestPt, 0);
      final long y = L.ordinate(bestPt, 1);
      System.out.println("Using (" + x + "," + y + ")");
      mSumX += x;
      mSumY += y;
      return Z.valueOf(Math.round(bestSqDistance * mN));
    }
  }
}
