package irvine.oeis.a060;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Point;

/**
 * A060897 Number of walks of length n on square lattice, starting at origin, staying in first and third quadrants.
 * @author Sean A. Irvine
 */
public class A060897 extends Sequence0 {

  // There is probably a formula for this ...

  private static final int[] DELTA_X = {1, -1, 0, 0};
  private static final int[] DELTA_Y = {0, 0, 1, -1};
  private HashMap<Point, Z> mCounts = new HashMap<>();

  @Override
  public Z next() {
    if (mCounts.isEmpty()) {
      mCounts.put(new Point(0, 0), Z.ONE);
      return Z.ONE;
    } else {
      Z sum = Z.ZERO;
      final HashMap<Point, Z> newCounts = new HashMap<>();
      for (final Map.Entry<Point, Z> e : mCounts.entrySet()) {
        final Z c = e.getValue();
        final int x = e.getKey().left();
        final int y = e.getKey().right();
        for (int k = 0; k < DELTA_X.length; ++k) {
          final int nx = x + DELTA_X[k];
          final int ny = y + DELTA_Y[k];
          if (nx * ny >= 0) {
            // 1st or 3rd quadrant
            newCounts.merge(new Point(nx, ny), c, Z::add);
            sum = sum.add(c);
          }
        }
        mCounts = newCounts;
      }
      return sum;
    }
  }
}
