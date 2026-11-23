package irvine.oeis.a353;

import irvine.math.graph.SnakeNumberBoard;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A353259 Solution to Snake Numbers Problems for Snakes from 1 to n for an n X n square grid (see Comments).
 * @author Gregory Morse
 */
public class A353259 extends Sequence1 {

  private static final int MAX_SIDE = 10;

  // Giorgio Vecchi's published path. Exhaustion of all 15 starting-square
  // orbits verified maximality; exhaustive(9) recomputes that upper bound.
  private static final int[] PATH_9 = {
    9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 17, 16, 25, 24, 33, 34,
    35, 44, 43, 42, 51, 60, 61, 70, 69, 68, 67, 66, 57, 58, 49, 50,
    41, 40, 39, 30, 31, 22, 23, 14, 13, 12, 11, 10, 19, 20, 29, 38,
    37, 36, 45, 46, 47, 56, 55, 64, 63, 72, 73, 74, 75, 76, 77, 78,
    79, 80, 71
  };

  private int mN;

  /**
   * Compute a term by exhaustive search without using the published witness.
   * @param n board side
   * @return maximum path length
   */
  public static int exhaustive(final int n) {
    return SnakeNumberBoard.maximum(n, false);
  }

  @Override
  public Z next() {
    if (mN >= MAX_SIDE) {
      throw new UnsupportedOperationException("Use exhaustive(n) to search beyond side " + MAX_SIDE);
    }
    final int n = ++mN;
    if ((n & 1) == 0) {
      // Start along the first row, snake across the remaining rows in
      // columns 1 through n-1, then fill column 0 in reverse. For column x
      // the residues are x-y in even rows and -x-y in odd rows (mod n).
      return Z.valueOf((long) n * n);
    }
    return Z.valueOf(n == 9 ? SnakeNumberBoard.witnessLength(n, false, PATH_9) : exhaustive(n));
  }
}
