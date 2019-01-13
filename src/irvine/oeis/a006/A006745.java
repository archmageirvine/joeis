package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.List;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006745.
 * @author Sean A. Irvine
 */
public class A006745 implements Sequence {

  // Needs to avoid paths that lead to traps

  private int mN = 0;
  private ArrayList<TwoDimensionalWalk> mWalks = new ArrayList<>();

  private int d(final int z) {
    return (z & 1) == 0 ? 1 : -1;
  }

  // Recursively search outwards until we prove able to get outside the current path
  // bound box, which is proof we could get to infinity
  private boolean checkAllowed(final int[] bounds, final TwoDimensionalWalk w, final int x, final int y) {
    if (w.contains(x, y)) {
      return false;
    }
    if (x < bounds[0] || x > bounds[1] || y < bounds[2] || y > bounds[3]) {
      return true; // We are passed current edge
    }
    final TwoDimensionalWalk v = new TwoDimensionalWalk(x, y, w); // So we don't recheck this point
    return checkAllowed(bounds, v, x + d(y), y) || checkAllowed(bounds, v, x, y + d(x));
  }

  private void addIfAllowed(final List<TwoDimensionalWalk> newWalks, final TwoDimensionalWalk w, final int x, final int y) {
    final int[] bounds = w.bounds();
    if (checkAllowed(bounds, w, x, y)) {
      newWalks.add(new TwoDimensionalWalk(x, y, w));
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      mWalks.add(new TwoDimensionalWalk(1, 0, new TwoDimensionalWalk(0, 0, null)));
    } else {
      final ArrayList<TwoDimensionalWalk> newWalks = new ArrayList<>((int) (1.8 * mWalks.size()));
      for (final TwoDimensionalWalk w : mWalks) {
        final int x = w.x();
        final int y = w.y();
        addIfAllowed(newWalks, w, x + d(y), y);
        addIfAllowed(newWalks, w, x, y + d(x));
      }
      mWalks = newWalks;
    }
    return Z.valueOf(mWalks.size());
  }

}
