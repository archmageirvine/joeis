
package irvine.oeis.a086;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086973 Period of oscillator reached starting with a segment of n consecutive live cells and applying the LongLife 2D rule (see comment).
 * @author Sean A. Irvine
 */
public class A086973 extends Sequence1 {

  // After R&eacute;my Sigrist

  // The eight neighbours in the square lattice.
  private static final int[] DX = {1, 0, -1, 0, 1, -1, -1, 1};
  private static final int[] DY = {0, 1, 0, -1, 1, 1, -1, -1};

  private int mN = 0;

  // Pack two signed 32-bit coordinates into one long.
  private static long point(final int x, final int y) {
    return ((long) x << 32) | (y & 0xffffffffL);
  }

  private static int x(final long p) {
    return (int) (p >> 32);
  }

  private static int y(final long p) {
    return (int) p;
  }

  /**
   * Compute one generation.
   * @param live current live cells
   * @return next generation
   */
  private static Set<Long> iterate(final Set<Long> live) {
    if (live.isEmpty()) {
      return new HashSet<>();
    }

    // Count the live neighbours of every cell adjacent to a live cell.
    final Map<Long, Integer> counts = new HashMap<>();
    for (final long z : live) {
      final int zx = x(z);
      final int zy = y(z);
      for (int j = 0; j < DX.length; ++j) {
        final long neighbour = point(zx + DX[j], zy + DY[j]);
        counts.merge(neighbour, 1, Integer::sum);
      }
    }

    final Set<Long> next = new HashSet<>();
    for (final Map.Entry<Long, Integer> entry : counts.entrySet()) {
      final long z = entry.getKey();
      final int count = entry.getValue();
      if (live.contains(z)) {
        // A live cell survives only with exactly five live neighbours.
        if (count == 5) {
          next.add(z);
        }
      } else if (count >= 3 && count <= 5) {
        // A dead cell is born with three, four, or five live neighbours.
        next.add(z);
      }
    }
    return next;
  }

  @Override
  public Z next() {
    ++mN;
    Set<Long> w = new HashSet<>();
    for (int i = 1; i <= mN; ++i) {
      w.add(point(i, 0));
    }
    Set<Long> ww = iterate(w);
    while (!w.equals(ww)) {
      w = iterate(w);
      ww = iterate(iterate(ww));
    }
    int period = 0;
    do {
      ww = iterate(ww);
      ++period;
    } while (!w.equals(ww));
    return Z.valueOf(period == 1 ? 0 : period);
  }
}
