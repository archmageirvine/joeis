package irvine.math.graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Compute the burning number of a graph.
 * @author Sean A. Irvine
 */
public final class BurningNumber {

  // Based on Python in A395528

  private BurningNumber() { }

  private static final class State {
    private final long mUncovered;
    private final int mRadiiMask;

    private State(final long uncovered, final int radiiMask) {
      mUncovered = uncovered;
      mRadiiMask = radiiMask;
    }

    @Override
    public int hashCode() {
      return (int) (mUncovered ^ (mUncovered >>> 32)) * 31 + mRadiiMask;
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj) {
        return true;
      }
      if (!(obj instanceof State)) {
        return false;
      }
      final State s = (State) obj;
      return mUncovered == s.mUncovered && mRadiiMask == s.mRadiiMask;
    }
  }

  private static boolean cover(final long uncovered, final int radiiMask, final long[][] balls, final Map<State, Boolean> memo) {
    if (uncovered == 0) {
      return true;
    }
    if (radiiMask == 0) {
      return false;
    }
    final State state = new State(uncovered, radiiMask);
    final Boolean old = memo.get(state);
    if (old != null) {
      return old;
    }

    // choose first uncovered vertex
    final int u = Long.numberOfTrailingZeros(uncovered);

    // try largest remaining radius first
    for (int r = 31 - Integer.numberOfLeadingZeros(radiiMask); r >= 0; --r) {
      if ((radiiMask & (1 << r)) == 0) {
        continue;
      }

      final int rest = radiiMask & ~(1 << r);
      for (int c = 0; c < balls[r].length; ++c) {
        if (((balls[r][c] >>> u) & 1L) != 0) {
          final long next = uncovered & ~balls[r][c];
          if (cover(next, rest, balls, memo)) {
            memo.put(state, Boolean.TRUE);
            return true;
          }
        }
      }
    }

    memo.put(state, Boolean.FALSE);
    return false;
  }

  static int burningNumber(final Graph g) {
    final int n = g.order();
    if (n <= 1) {
      return n;
    }
    if (n > 63) {
      throw new UnsupportedOperationException();
    }
    final int[][] dist = new int[n][];
    for (int v = 0; v < n; ++v) {
      dist[v] = g.distanceVector(v);
    }
    // balls[r][v] = bit mask of vertices within distance <= r from v
    final long[][] balls = new long[n][n];
    for (int r = 0; r < n; ++r) {
      for (int v = 0; v < n; ++v) {
        long mask = 0;
        for (int u = 0; u < n; ++u) {
          if (dist[v][u] <= r) {
            mask |= 1L << u;
          }
        }
        balls[r][v] = mask;
      }
    }

    final long full = (1L << n) - 1;
    for (int k = 1; k <= n; ++k) {
      final Map<State, Boolean> memo = new HashMap<>();
      final int radiiMask = (1 << k) - 1;   // bits 0...(k-1)
      if (cover(full, radiiMask, balls, memo)) {
        return k;
      }
    }
    return n;
  }

}
