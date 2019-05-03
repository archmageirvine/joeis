package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.List;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006744 Number of <code>n-step self-avoiding</code> walks on a Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A006744 implements Sequence {

  // This is not best way known
  // Manhattan lattice, square lattice with alternate rows (and columns)
  // running in opposite directions.

  private int mN = 0;
  private ArrayList<TwoDimensionalWalk> mWalks = new ArrayList<>();

  private int d(final int z) {
    //return (z & 1) == 0 ? 1 : -1;
    return 1 - ((z & 1) << 1);
  }

  private void addIfAllowed(final List<TwoDimensionalWalk> newWalks, final TwoDimensionalWalk w, final int x, final int y) {
    if (w.contains(x, y)) {
      return; // Already have this point
    }
    newWalks.add(new TwoDimensionalWalk(x, y, w));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
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
