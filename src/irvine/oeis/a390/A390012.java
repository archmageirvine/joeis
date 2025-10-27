package irvine.oeis.a390;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Point;

/**
 * A390012.
 * @author Sean A. Irvine
 */
public class A390012 extends Sequence1 {

  // SAFETY here is not a heuristic, but search will fail if it is not large enough
  private static final int SAFETY = 50;
  // List of squarefree APs
  private final ArrayList<Point> mAP = new ArrayList<>();
  // Used to incrementally construct squarefree APs
  private int mStart = 2;
  private int mDelta = 2;
  // Tracking variables for the sequence itself
  private int mN = 0;
  private long mBest = 0;

  private boolean isSquarefreeAP(final long start, final long delta) {
    for (long k = 0; k < delta; ++k) {
      if ((k * k) % delta == start) {
        return false;
      }
    }
    return true;
  }

  private Point getAP(final int n) {
    if (n >= mAP.size()) {
      while (true) {
        if (++mStart >= mDelta) {
          ++mDelta;
          mStart = 2;
        }
        if (isSquarefreeAP(mStart, mDelta)) {
          mAP.add(new Point(mStart, mDelta));
          break;
        }
      }
    }
    return mAP.get(n);
  }

  private void search(final int remaining, final boolean[] seen) {
    if (remaining == 0) {
      for (int k = 2; k < seen.length; ++k) {
        if (!seen[k]) { // Squares are already marked as seen
          if (k > mBest) {
            mBest = k;
          }
          return;
        }
      }
      throw new RuntimeException("Increase SAFETY above " + SAFETY);
    }

    int leastUnseen = 2;
    while (seen[leastUnseen]) {
      ++leastUnseen;
    }
    int j = -1;
    while (true) {
      final Point ap = getAP(++j);
      int s = ap.left();
      final int d = ap.right();
      if (s > leastUnseen && d >= leastUnseen) {
        break;
      }
      if (s == leastUnseen % d) {
        final boolean[] copy = Arrays.copyOf(seen, seen.length);
        while (s < copy.length) {
          copy[s] = true;
          s += d;
        }
        search(remaining - 1, copy);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mBest = 0;
    final boolean[] seen = new boolean[mN * SAFETY];
    // Pre-mark all squares as seen
    for (int k = 0; k * k < seen.length; ++k) {
      seen[k * k] = true;
    }
    search(mN, seen);
    return Z.valueOf(mBest);
  }
}

