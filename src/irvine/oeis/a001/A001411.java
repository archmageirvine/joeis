package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001411 Number of n-step self-avoiding walks on square lattice.
 * @author Sean A. Irvine
 */
public class A001411 implements Sequence {

  // This is not best way known
  // In fact, this is a crappy way, since it keeps them in memory

  private int mN = -1;
  protected ArrayList<TwoDimensionalWalk> mWalks = new ArrayList<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      mWalks.add(new TwoDimensionalWalk(1, 0, new TwoDimensionalWalk(0, 0, null)));
    } else {
      final ArrayList<TwoDimensionalWalk> newWalks = new ArrayList<>((int) (2.7 * mWalks.size()));
      for (final TwoDimensionalWalk w : mWalks) {
        final int x = w.x();
        final int y = w.y();
        if (!w.contains(x + 1, y)) {
          newWalks.add(new TwoDimensionalWalk(x + 1, y, w));
        }
        if (!w.contains(x - 1, y)) {
          newWalks.add(new TwoDimensionalWalk(x - 1, y, w));
        }
        if (!w.contains(x, y + 1)) {
          newWalks.add(new TwoDimensionalWalk(x, y + 1, w));
        }
        if (!w.contains(x, y - 1)) {
          newWalks.add(new TwoDimensionalWalk(x, y - 1, w));
        }
      }
      mWalks = newWalks;
      /*
      for (final TwoDimensionalWalk w : mWalks) {
        System.out.println(w);
      }
      */
    }
    return Z.valueOf(mWalks.size()).multiply(4);
  }
}
