package irvine.oeis.a051;

import irvine.oeis.a000.A000170;

/**
 * A051223 Number of ways of placing n nonattacking superqueens on an n X n board.
 * @author Sean A. Irvine
 */
public class A051223 extends A000170 {

  // Not really competitive ...

  private static final int[] DELTA_X = {-2, -2, -1, -1, 1, 1, 2, 2};
  private static final int[] DELTA_Y = {1, -1, 2, -2, 2, -2, 1, -1};
  {
    next(); // skip 0
  }

  static boolean isKnightConsistent(final int[] q, final int n) {
    for (int k = 0; k < n; ++k) {
      final int col = q[n];
      for (int d = 0; d < DELTA_X.length; ++d) {
        final int x = col + DELTA_X[d];
        final int y = n + DELTA_Y[d];
        if (x >= 0 && x < q.length && y >= 0 && y < n && q[y] == x) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  protected boolean isConsistent(final int[] q, final int n) {
    // Check queen-style moves
    if (!super.isConsistent(q, n)) {
      return false;
    }
    // Check knight-style moves
    return isKnightConsistent(q, n);
  }
}
