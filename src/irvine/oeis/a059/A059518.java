package irvine.oeis.a059;

import java.util.HashSet;
import java.util.LinkedList;

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
    } else {
      if (mN == 22) {
        // Hmmm this case shows cannot always get best by greedy algorithm
        System.out.println("Override");
        mUsed.remove(L.toPoint(6, 0));
        mSumX -= 6;
        mUsed.add(L.toPoint(-3, -1));
        mSumX -= 3;
        mSumY -= 1;
      }

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
    final double cx = (0.5 * mSumX) / mN;
    final double cy = (COS30 * mSumY) / mN;
    //System.out.println("n=" + mN + " c=(" + cx + "," + cy + ")");
    double sqSum = 0;
    for (final long pt : mUsed) {
      final long x = L.ordinate(pt, 0);
      final long y = L.ordinate(pt, 1);
      final double dx = cx - 0.5 * x;
      final double dy = cy - COS30 * y;
      sqSum += dx * dx + dy * dy;
    }

    return Z.valueOf(Math.round(sqSum * mN));
  }
}
