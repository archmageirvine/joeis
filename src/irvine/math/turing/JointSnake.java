package irvine.math.turing;

import java.util.HashSet;
import java.util.Set;

/**
 * Replay synchronous square-grid snakes with a common instruction word.
 * @author Gregory Morse
 */
public final class JointSnake {

  private static final int[] DX = {0, 1, 0, -1};
  private static final int[] DY = {1, 0, -1, 0};

  private JointSnake() {
  }

  /**
   * Replay a trapping witness. The limit is a guard, not a halting test.
   * @param snakes number of snakes
   * @param word shared instructions using URDL
   * @return number of distinct cells visited before all snakes are trapped
   */
  public static int witnessLength(final int snakes, final String word) {
    final int[] moves = word.chars().map("URDL"::indexOf).toArray();
    if (snakes < 1 || word.isEmpty() || word.chars().anyMatch(c -> "URDL".indexOf(c) < 0)) {
      throw new IllegalArgumentException("Invalid snake count or instruction word");
    }
    final int[] x = new int[snakes];
    final int[] y = new int[snakes];
    final Set<Long> visited = new HashSet<>();
    visited.add(0L);
    for (int round = 0; round < (1 << 16); ++round) {
      final int before = visited.size();
      for (final int move : moves) {
        for (int h = 0; h < snakes; ++h) {
          final int u = x[h] + DX[move];
          final int v = y[h] + DY[move];
          if (visited.add((long) u << 32 | v & 0xFFFFFFFFL)) {
            x[h] = u;
            y[h] = v;
          }
        }
      }
      if (visited.size() == before) {
        return before;
      }
    }
    throw new IllegalStateException("The supplied trapping witness did not halt");
  }
}
