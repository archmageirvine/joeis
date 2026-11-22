package irvine.math.turing;

import java.util.BitSet;

/**
 * Checks a FAR DFA hint by closing its induced NFA under backward machine steps.
 * @author Gregory Morse
 */
final class FiniteAutomata {
  private FiniteAutomata() { }

  static boolean closes(final int[] table, final int[][] dfa, final boolean mirror) {
    final int width = dfa.length;
    if (width < 1 || width > 64 || dfa[0][0] != 0) {
      return false;
    }
    for (final int[] row : dfa) {
      if (row.length != 2 || row[0] < 0 || row[0] >= width || row[1] < 0 || row[1] >= width) {
        return false;
      }
    }
    final int sink = table.length / 2 * width;
    final BitSet[][] edges = new BitSet[sink + 1][2];
    for (final BitSet[] row : edges) {
      row[0] = new BitSet();
      row[1] = new BitSet();
    }
    edges[sink][0].set(sink);
    edges[sink][1].set(sink);
    for (int slot = 0; slot < table.length; ++slot) {
      final int rule = table[slot];
      for (int u = 0; u < width; ++u) {
        final BitSet out = edges[(slot >>> 1) * width + u][slot & 1];
        if (rule < 0) {
          out.set(sink);
        } else if (((rule & 1) != 0) != mirror) {
          out.set((rule >>> 2) * width + dfa[u][rule >>> 1 & 1]);
        }
      }
    }
    boolean changed;
    do {
      changed = false;
      for (int slot = 0; slot < table.length; ++slot) {
        final int rule = table[slot];
        if (rule < 0 || (((rule & 1) != 0) != mirror)) {
          continue;
        }
        final int write = rule >>> 1 & 1;
        for (int u = 0; u < width; ++u) {
          for (int b = 0; b <= 1; ++b) {
            final BitSet first = edges[(rule >>> 2) * width + u][b];
            final BitSet out = edges[(slot >>> 1) * width + dfa[u][b]][slot & 1];
            final int before = out.cardinality();
            for (int s = first.nextSetBit(0); s >= 0; s = first.nextSetBit(s + 1)) {
              out.or(edges[s][write]);
            }
            changed |= out.cardinality() != before;
          }
        }
      }
    } while (changed);
    // If any finite zero padding accepts the blank tape, this hint proves nothing.
    final BitSet reached = new BitSet();
    reached.set(0);
    do {
      final int before = reached.cardinality();
      for (int s = reached.nextSetBit(0); s >= 0; s = reached.nextSetBit(s + 1)) {
        reached.or(edges[s][0]);
      }
      changed = reached.cardinality() != before;
    } while (changed && !reached.get(sink));
    return !reached.get(sink);
  }
}
