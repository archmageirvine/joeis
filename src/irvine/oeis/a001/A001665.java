package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001665 Number of self-avoiding n-step walks on Kagome lattice.
 * @author Sean A. Irvine
 */
public class A001665 implements Sequence {

  private int mN = -1;
  private ArrayList<TwoDimensionalWalk> mWalks = new ArrayList<>();

  protected boolean check(final TwoDimensionalWalk walk, final int x, final int y) {
    return !walk.contains(x, y);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      mWalks.add(new TwoDimensionalWalk(1, 1, new TwoDimensionalWalk(0, 0, null)));
    } else {
      // Factor 2.7 below help prevent excessive resizing
      final ArrayList<TwoDimensionalWalk> newTwoDimensionalWalks = new ArrayList<>((int) (2.7 * mWalks.size()));
      for (final TwoDimensionalWalk w : mWalks) {
        final int x = w.x();
        final int y = w.y();
        if ((x & 1) == 0) {
          assert (y & 1) == 0;
          if (check(w, x + 1, y + 1)) {
            newTwoDimensionalWalks.add(new TwoDimensionalWalk(x + 1, y + 1, w));
          }
          if (check(w, x + 1, y - 1)) {
            newTwoDimensionalWalks.add(new TwoDimensionalWalk(x + 1, y - 1, w));
          }
          if (check(w, x - 1, y + 1)) {
            newTwoDimensionalWalks.add(new TwoDimensionalWalk(x - 1, y + 1, w));
          }
          if (check(w, x - 1, y - 1)) {
            newTwoDimensionalWalks.add(new TwoDimensionalWalk(x - 1, y - 1, w));
          }
        } else {
          if (check(w, x + 2, y)) {
            newTwoDimensionalWalks.add(new TwoDimensionalWalk(x + 2, y, w));
          }
          if (check(w, x - 2, y)) {
            newTwoDimensionalWalks.add(new TwoDimensionalWalk(x - 2, y, w));
          }
          if ((x & 2) == (y & 2)) {
            if (check(w, x + 1, y + 1)) {
              newTwoDimensionalWalks.add(new TwoDimensionalWalk(x + 1, y + 1, w));
            }
            if (check(w, x - 1, y - 1)) {
              newTwoDimensionalWalks.add(new TwoDimensionalWalk(x - 1, y - 1, w));
            }
          } else {
            if (check(w, x - 1, y + 1)) {
              newTwoDimensionalWalks.add(new TwoDimensionalWalk(x - 1, y + 1, w));
            }
            if (check(w, x + 1, y - 1)) {
              newTwoDimensionalWalks.add(new TwoDimensionalWalk(x + 1, y - 1, w));
            }
          }
        }
      }
      mWalks = newTwoDimensionalWalks;
    }
    return Z.valueOf(mWalks.size()).shiftLeft(2);
  }
}
