package irvine.oeis.a353;

import irvine.math.graph.SnakeNumberBoard;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A353060 Solution to Snake Numbers Problems from 1 to n for an n X n square grid with chess knight moves (see Comments).
 * @author Gregory Morse
 */
public class A353060 extends Sequence1 {

  private static final int MAX_SIDE = 8;

  // Giorgio Vecchi's witnesses. Exhaustive search verifies maximality at
  // side 7; the side-8 path visits every cell, so no upper search is needed.
  private static final int[] PATH_7 = {
    0, 9, 24, 15, 2, 7, 16, 11, 6, 19, 34, 47, 32, 27, 40, 31,
    46, 37, 28, 43, 38, 29, 14, 1, 10, 25, 20, 33, 48, 39, 30, 21,
    36, 23, 8, 17, 26, 13, 4
  };
  private static final int[] PATH_8 = {
    0, 10, 4, 14, 31, 37, 47, 62, 52, 46, 63, 53, 43, 58, 48, 42,
    59, 49, 32, 26, 36, 30, 20, 5, 15, 21, 27, 33, 16, 1, 11, 17,
    34, 24, 18, 3, 9, 19, 2, 8, 25, 35, 41, 56, 50, 40, 57, 51,
    45, 60, 54, 44, 61, 55, 38, 28, 22, 7, 13, 23, 6, 12, 29, 39
  };

  private int mN;

  /**
   * Compute a term by exhaustive search without using the published witnesses.
   * @param n board side
   * @return maximum path length
   */
  public static int exhaustive(final int n) {
    return SnakeNumberBoard.maximum(n, true);
  }

  @Override
  public Z next() {
    if (mN >= MAX_SIDE) {
      throw new UnsupportedOperationException("Use exhaustive(n) to search beyond side " + MAX_SIDE);
    }
    final int n = ++mN;
    if (n == 7 || n == 8) {
      return Z.valueOf(SnakeNumberBoard.witnessLength(n, true, n == 7 ? PATH_7 : PATH_8));
    }
    return Z.valueOf(exhaustive(n));
  }
}
