package irvine.oeis.a353;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.Point;

/**
 * A353176 Maximum length of a finite snake in the Snake Number Problem with n-periodic instructions in an infinite square grid (see Comments).
 * @author Gregory Morse
 */
public class A353176 extends AbstractSequence {
  // Published orbit counts from A352388 (periods 5 through 18).
  // The bound on individual simulations is increased until all are witnessed.
  private static final int[] FINITE_COUNTS = {
    5, 21, 127, 618, 2934, 13542, 61803, 276650, 1219508, 5309179,
    22868295, 97663066, 414156142, 1746438478
  };
  private static final int[] DX = {0, 1, 0, -1};
  private static final int[] DY = {1, 0, -1, 0};

  private int mN = -1;

  /** Construct the sequence. */
  public A353176() {
    super(5);
  }

  private static int length(final int[] word, final int limit) {
    final Set<Point> seen = new HashSet<>();
    int x = 0;
    int y = 0;
    seen.add(new Point(x, y));
    for (int round = 0; round < limit; ++round) {
      final int before = seen.size();
      for (final int d : word) {
        if (seen.add(new Point(x + DX[d], y + DY[d]))) {
          x += DX[d];
          y += DY[d];
        }
      }
      if (seen.size() == before) {
        return before;
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    if (++mN >= FINITE_COUNTS.length) {
      throw new UnsupportedOperationException("No further published finite-snake counts");
    }
    final int[] word = new int[mN + 5];
    final long bound = 1L << (2 * (word.length - 1));
    for (int limit = 16; ; limit = Math.multiplyExact(limit, 2)) {
      int count = 0;
      int max = 0;
      for (long k = 0; k < bound; ++k) {
        long mask = k;
        int directions = 1;
        boolean representative = true;
        // Rotate the first move up and reflect the first horizontal move right.
        for (int j = 1; j < word.length; ++j) {
          final int d = (int) (mask & 3);
          if (d == 3 && (directions & 2) == 0) {
            representative = false;
            break;
          }
          word[j] = d;
          directions |= 1 << d;
          mask >>>= 2;
        }
        // With a missing direction the path cannot get trapped on the full grid.
        if (representative && directions == 15) {
          final int length = length(word, limit);
          if (length > 0) {
            ++count;
            max = Math.max(max, length);
          }
        }
      }
      if (count == FINITE_COUNTS[mN]) {
        return Z.valueOf(max);
      }
      if (count > FINITE_COUNTS[mN]) {
        throw new IllegalStateException("More finite snakes than the published count");
      }
    }
  }
}
