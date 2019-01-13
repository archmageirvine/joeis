package irvine.oeis.a006;

import irvine.math.TwoDimensionalWalk;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A006817.
 * @author Sean A. Irvine
 */
public class A006817 implements Sequence {

  private int mN = -1;
  private LongDynamicArray<TwoDimensionalWalk> mTrails = new LongDynamicArray<>();

  static void addIfAbsent(final LongDynamicArray<TwoDimensionalWalk> newTrails, final TwoDimensionalWalk trail, final int ox, final int oy, final int x, final int y) {
    if (!trail.contains(ox, oy, x, y)) {
      newTrails.set(newTrails.length(), new TwoDimensionalWalk(x, y, trail));
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      mTrails.set(0, new TwoDimensionalWalk(1, 0, new TwoDimensionalWalk(0, 0, null)));
    } else {
      final LongDynamicArray<TwoDimensionalWalk> newTrails = new LongDynamicArray<>();
      for (long k = 0; k < mTrails.length(); ++k) {
        final TwoDimensionalWalk trail = mTrails.get(k);
        final int x = trail.x();
        final int y = trail.y();
        addIfAbsent(newTrails, trail, x, y, x + 1, y);
        addIfAbsent(newTrails, trail, x, y, x - 1, y);
        addIfAbsent(newTrails, trail, x, y, x, y + 1);
        addIfAbsent(newTrails, trail, x, y, x, y - 1);
      }
      mTrails = newTrails;
    }
    return Z.valueOf(mTrails.length()).multiply(4);
  }
}
