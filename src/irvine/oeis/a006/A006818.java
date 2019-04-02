package irvine.oeis.a006;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A006818 Trails of length n on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A006818 implements Sequence {

  private int mN = -1;
  private LongDynamicArray<TwoDimensionalWalk> mTrails = new LongDynamicArray<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      mTrails.set(0, new TwoDimensionalWalk(1, 1, new TwoDimensionalWalk(0, 0, null)));
    } else {
      final LongDynamicArray<TwoDimensionalWalk> newTrails = new LongDynamicArray<>();
      for (long k = 0; k < mTrails.length(); ++k) {
        final TwoDimensionalWalk trail = mTrails.get(k);
        final int x = trail.x();
        final int y = trail.y();
        A006817.addIfAbsent(newTrails, trail, x, y, x + 2, y);
        A006817.addIfAbsent(newTrails, trail, x, y, x - 2, y);
        A006817.addIfAbsent(newTrails, trail, x, y, x + 1, y + 1);
        A006817.addIfAbsent(newTrails, trail, x, y, x + 1, y - 1);
        A006817.addIfAbsent(newTrails, trail, x, y, x - 1, y + 1);
        A006817.addIfAbsent(newTrails, trail, x, y, x - 1, y - 1);
      }
      mTrails = newTrails;
    }
    return Z.valueOf(mTrails.length()).multiply(6);
  }
}
