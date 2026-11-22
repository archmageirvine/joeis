package irvine.math.turing;

import java.util.Arrays;

/**
 * Rare fallback: find a repeated transcript, then check the tape recurrence exactly.
 * @author Gregory Morse
 */
final class LateLoop {
  private LateLoop() { }

  static boolean closes(final int[] rules, final int steps) {
    final byte[] tape = new byte[2 * steps + 1];
    final byte[] slots = new byte[steps + 1];
    final int[] positions = new int[steps + 1];
    final byte[] edges = new byte[steps + 1];
    int head = steps;
    int state = 0;
    int left = head;
    int right = head;
    for (int k = 0; k <= steps; ++k) {
      final int slot = 2 * state + tape[head];
      slots[k] = (byte) slot;
      positions[k] = head;
      edges[k] = (byte) ((head <= left ? 1 : 0) | (head >= right ? 2 : 0));
      left = Math.min(left, head);
      right = Math.max(right, head);
      final int rule = rules[slot];
      if (rule < 0) {
        return false;
      }
      if (k != steps) {
        tape[head] = (byte) (rule >>> 1 & 1);
        head += (rule & 1) == 0 ? -1 : 1;
        state = rule >>> 2;
      }
    }
    // Work cap is not an assumption about the answer; it can only return UNKNOWN.
    int budget = 50_000_000;
    int witnesses = 32;
    for (int period = 1; period <= steps / 2; ++period) {
      final int drift = positions[steps] - positions[steps - period];
      final int side = drift > 0 ? 2 : 1;
      for (int k = 0; k <= steps - period; ++k) {
        if (--budget == 0) {
          return false;
        }
        final int later = steps - k;
        final int earlier = later - period;
        if (slots[later] != slots[earlier]) {
          break;
        }
        if (k >= period - 1 && (drift == 0 || (edges[later] & edges[earlier] & side) != 0)) {
          if (repeats(rules, slots, positions, earlier, later, tape.length)) {
            return true;
          }
          if (--witnesses == 0) {
            return false;
          }
        }
      }
    }
    return false;
  }

  private static boolean repeats(final int[] rules, final byte[] slots, final int[] positions,
                                 final int earlier, final int later, final int width) {
    final byte[] now = new byte[width];
    for (int i = 0; i < earlier; ++i) {
      now[positions[i]] = (byte) (rules[slots[i]] >>> 1 & 1);
    }
    final byte[] before = Arrays.copyOf(now, width);
    int low = positions[earlier];
    int high = low;
    for (int i = earlier; i < later; ++i) {
      final int at = positions[i];
      now[at] = (byte) (rules[slots[i]] >>> 1 & 1);
      low = Math.min(low, at);
      high = Math.max(high, at);
    }
    final int shift = positions[later] - positions[earlier];
    final int from = shift >= 0 ? low : 0;
    final int to = shift <= 0 ? high : width - 1;
    for (int i = from; i <= to; ++i) {
      final int j = i + shift;
      if (before[i] != (j >= 0 && j < width ? now[j] : 0)) {
        return false;
      }
    }
    return true;
  }
}
