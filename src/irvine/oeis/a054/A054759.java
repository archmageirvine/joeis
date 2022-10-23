package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054759 Number of Eulerian orientations of the n X n square lattice (with wrap-around), i.e., number of arrow configurations on n X n grid that satisfy the square ice rule.
 * @author Sean A. Irvine
 */
public class A054759 extends Sequence1 {

  // Too slow to be useful ...

  // Ice states:
  //
  //    ^        v        ^        v        v        ^
  //    |        |        |        |        |        |
  // >--+--<  <--+-->  >--+-->  <--+--<  >--+-->  <--+--<
  //    |        |        |        |        |        |
  //    v        ^        ^        v        v        ^
  //
  //    0        1        2        3        4        5

  private static final int[] ALLOWED_ABOVE = {
    0b100110,
    0b011001,
    0b100110,
    0b011001,
    0b011001,
    0b100110,
  };

  private static final int[] ALLOWED_RIGHT = {
    0b101010,
    0b010101,
    0b010101,
    0b101010,
    0b010101,
    0b101010,
  };

  private static final int[] ALLOWED_BELOW = {
    0b011010,
    0b100101,
    0b100101,
    0b011010,
    0b011010,
    0b100101,
  };

  private static final int[] ALLOWED_LEFT = {
    0b010110,
    0b101001,
    0b010110,
    0b101001,
    0b010110,
    0b101001,
  };

  private int mN = 0;

  private long mCount = 0;

  void search(final int[][] state, final int x, final int y) {
    if (y >= mN) {
      ++mCount;
      return;
    }
    final int a = x == 0 ? 63 : ALLOWED_LEFT[state[x - 1][y]];
    final int b = y == 0 ? 63 : ALLOWED_BELOW[state[x][y - 1]];
    final int c = x == mN - 1 ? ALLOWED_RIGHT[state[0][y]] : 63;
    final int d = y == mN - 1 ? ALLOWED_ABOVE[state[x][0]] : 63;
    final int e = a & b & c & d;
    for (int k = 0; k < 6; ++k) {
      if ((e & (1 << k)) != 0) {
        state[x][y] = k;
        if (x + 1 >= mN) {
          search(state, 0, y + 1);
        } else {
          search(state, x + 1, y);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.FOUR; // Special case, types 0, 1 not possible for a single point
    }
    mCount = 0;
    final int[][] state = new int[mN][mN];
    state[0][0] = 2;
    search(state, 1, 0);
    mCount *= 2L; // Symmetry on types 2, 3, 4, 5 (up vs down)
    state[0][0] = 1;
    search(state, 1, 0);
    mCount *= 2L; // Symmetry on direction around cycle (left vs right)
    return Z.valueOf(mCount);
  }
}
