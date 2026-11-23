package irvine.math.turing;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Checks a finite ordered-gap quotient of a FRACTRAN program.
 * @author Gregory Morse
 */
public final class FractranGapInvariant {

  private FractranGapInvariant() {
  }

  private static long pack(final int[] state, final int[] order, final int n) {
    for (int j = 0; j < state.length; ++j) {
      order[j] = (state[j] << 3) + j;
    }
    Arrays.sort(order);
    long result = 0;
    int previous = 0;
    for (int j = 0; j < order.length; ++j) {
      final int value = order[j] >>> 3;
      final int d = value - previous;
      final int gap = d < n ? d : n + d % n;
      result |= (long) (8 * gap + (order[j] & 7)) << (8 * j);
      previous = value;
    }
    return result;
  }

  /**
   * Prove nonhalting by exhausting all reachable cells, or return false.
   * @param program ordered FRACTRAN exponent changes
   * @param n gap threshold and modulus
   * @param limit maximum number of distinct cells
   * @return true only if every reachable cell has a successor and the queue closes
   */
  public static boolean proves(final int[][] program, final int n, final int limit) {
    if (program.length == 0 || n < 2 || n > 16 || limit < 1) {
      return false;
    }
    final int width = program[0].length;
    if (width < 1 || width > 7 || Arrays.stream(program).anyMatch(row -> row.length != width)) {
      return false;
    }
    int lower = 0;
    int upper = 0;
    for (final int[] r : program) {
      for (final int v : r) {
        lower = Math.min(lower, v);
        upper = Math.max(upper, v);
      }
    }
    if ((long) upper - lower >= n) {
      return false;
    }
    final int[] state = new int[width];
    final int[] order = new int[width];
    state[0] = 1;
    final long start = pack(state, order, n);
    final HashSet<Long> seen = new HashSet<>();
    final ArrayDeque<Long> queue = new ArrayDeque<>();
    seen.add(start);
    queue.add(start);
    while (!queue.isEmpty()) {
      final long v = queue.remove();
      int wide = 0;
      for (int j = 0; j < width; ++j) {
        if (((v >>> (8 * j)) & 255) / 8 >= n) {
          wide |= 1 << j;
        }
      }
      // A wide gap cannot change the order across its boundary. After a
      // step its size changes by less than n. Replacing its representative
      // by representative+n therefore covers every further addition of n:
      // the new gap stays wide and its residue is unchanged. This also
      // holds for the gap from zero to the smallest exponent.
      for (int extra = wide;; extra = (extra - 1) & wide) {
        int sum = 0;
        for (int j = 0; j < width; ++j) {
          final int field = (int) ((v >>> (8 * j)) & 255);
          sum += (field >>> 3) + (((extra >>> j) & 1) == 0 ? 0 : n);
          state[field & 7] = sum;
        }
        int[] rule = null;
        for (final int[] r : program) {
          boolean legal = true;
          for (int j = 0; j < width; ++j) {
            legal &= state[j] + r[j] >= 0;
          }
          if (legal) {
            rule = r;
            break;
          }
        }
        if (rule == null) {
          return false;
        }
        for (int j = 0; j < width; ++j) {
          state[j] += rule[j];
        }
        final long moved = pack(state, order, n);
        if (seen.add(moved)) {
          if (seen.size() > limit) {
            return false;
          }
          queue.add(moved);
        }
        if (extra == 0) {
          break;
        }
      }
    }
    return true;
  }

  /**
   * Try the quotient on each line of semicolon-separated exponent rows.
   * @param args file of programs and maximum quotient threshold
   * @throws IOException if the file cannot be read
   */
  public static void main(final String[] args) throws IOException {
    if (args.length != 2) {
      throw new IllegalArgumentException("Expected program file and maximum threshold");
    }
    final int largest = Integer.parseInt(args[1]);
    if (largest < 2 || largest > 16) {
      throw new IllegalArgumentException("Threshold must be in 2..16");
    }
    try (BufferedReader r = Files.newBufferedReader(Path.of(args[0]))) {
      for (String line; (line = r.readLine()) != null; ) {
        final int[][] program = Arrays.stream(line.split(";", -1))
          .map(s -> Arrays.stream(s.split(",", -1)).mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new);
        int n = 2;
        while (n <= largest && !proves(program, n, 350000)) {
          ++n;
        }
        System.out.println(n <= largest ? "proved " + n + " " + line : "unresolved " + line);
      }
    }
  }
}
