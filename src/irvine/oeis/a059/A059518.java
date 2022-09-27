package irvine.oeis.a059;

import java.util.HashSet;
import java.util.LinkedList;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059518 a(n)/n^2 is the minimal average squared Euclidean distance of n points to their center of gravity among all configurations of n points on the hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A059518 implements Sequence {

  // todo this is wrong -- bad coordinate system

  private static final Lattice L = Lattices.HEXAGONAL;
  private long mN = 0;
  private Z mSumX = Z.ZERO;
  private Z mSumY = Z.ZERO;
  private final HashSet<Long> mUsed = new HashSet<>();
  private final LinkedList<Long> mPts = new LinkedList<>();

  @Override
  public Z next() {
    if (++mN == 1) {
      mUsed.add(L.origin());
      mPts.add(L.origin());
    } else {
      // BFS of hexagonal lattice
      while (true) {
        final long pt = mPts.pollFirst();
        for (final long q : L.neighbours(pt)) {
          if (!mUsed.contains(q)) {
            mPts.add(q);
          }
        }
        if (mUsed.add(pt)) {
          System.out.println("Using (" + L.ordinate(pt, 0) + "," + L.ordinate(pt, 1) + ") " + L.distanceBound(pt));
          mSumX = mSumX.add(L.ordinate(pt, 0));
          mSumY = mSumY.add(L.ordinate(pt, 1));
          break;
        }
      }
    }
    final Z n = Z.valueOf(mN);
    final Q cx = new Q(mSumX, n);
    final Q cy = new Q(mSumY, n);
    System.out.println("n=" + n + " c=(" + cx + "," + cy + ")");
    Q sqSum = Q.ZERO;
    for (final long pt : mUsed) {
      // todo yikes these not cartesian?
      final long x = L.ordinate(pt, 0);
      final long y = L.ordinate(pt, 1);
      final Q dx = cx.subtract(x);
      final Q dy = cy.subtract(y);
      sqSum = sqSum.add(dx.square().add(dy.square()));
    }

    return sqSum.multiply(mN).multiply(mN).toZ();
  }
}
