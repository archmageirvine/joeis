package irvine.math.turing;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

/**
 * Forward closure of weighted left/right DFA states with bounded interval endpoints.
 * @author Gregory Morse
 */
final class WeightedAutomata {
  private final int[] mTable;
  private final int[][] mL;
  private final int[][] mR;
  private final int mCutoff;
  private final boolean[][] mLBad;
  private final boolean[][] mRBad;
  private final Set<Long> mSeen = new HashSet<>();
  private final ArrayDeque<Long> mPending = new ArrayDeque<>();

  private WeightedAutomata(final int[] table, final int[][] l, final int[][] r, final int cutoff) {
    this.mTable = table;
    this.mL = l;
    this.mR = r;
    this.mCutoff = cutoff;
    mLBad = badSigns(l);
    mRBad = badSigns(r);
  }

  private static boolean valid(final int[][] dfa) {
    if (dfa.length < 1 || dfa.length > 128 || dfa[0][0] != 0 || dfa[0][1] != 0) {
      return false;
    }
    for (final int[] row : dfa) {
      if (row.length != 4 || row[0] < 0 || row[0] >= dfa.length || row[2] < 0 || row[2] >= dfa.length
        || row[1] < -100 || row[1] > 100 || row[3] < -100 || row[3] > 100) {
        return false;
      }
    }
    return true;
  }

  private static boolean[][] badSigns(final int[][] dfa) {
    final boolean[][] bad = new boolean[2][dfa.length];
    for (int sign = 0; sign <= 1; ++sign) {
      boolean changed;
      do {
        changed = false;
        for (int i = 0; i < dfa.length; ++i) {
          for (int b = 0; b <= 2; b += 2) {
            final int to = dfa[i][b];
            if (!bad[sign][to] && (bad[sign][i] || (sign == 0 ? dfa[i][b + 1] < 0 : dfa[i][b + 1] > 0))) {
              bad[sign][to] = true;
              changed = true;
            }
          }
        }
      } while (changed);
    }
    return bad;
  }

  // direction 0: exact; 1: [weight,+infinity); 2: (-infinity,weight].
  private void add(final int a, final int b, final int slot, final int weight, final int direction) {
    if (weight < 0 && direction != 1 && !mLBad[0][a] && !mRBad[0][b]
      || weight > 0 && direction != 2 && !mLBad[1][a] && !mRBad[1][b]) {
      return;
    }
    final int magnitude = Math.abs(weight);
    if (direction == 0) {
      enqueue(a, b, slot, weight, magnitude < mCutoff ? 0 : weight > 0 ? 1 : 2);
    } else if (magnitude > mCutoff) {
      // Widen by one, not all the way to the cutoff. Keep the translated
      // endpoint precise enough to distinguish the hard certificates.
      enqueue(a, b, slot, weight + (direction == 1 ? -1 : 1), direction);
    } else if (magnitude < mCutoff) {
      enqueue(a, b, slot, weight, 0);
      enqueue(a, b, slot, weight + (direction == 1 ? 1 : -1), direction);
    } else {
      enqueue(a, b, slot, weight, direction);
    }
  }

  private void enqueue(final int a, final int b, final int slot, final int weight, final int direction) {
    final long key = (long) weight << 20 | (long) direction << 18 | a << 11 | b << 4 | slot;
    if (mSeen.add(key)) {
      mPending.addLast(key);
    }
  }

  private boolean check() {
    add(0, 0, 0, 0, 0);
    while (!mPending.isEmpty()) {
      if (mSeen.size() > 100_000) {
        return false;
      }
      final long key = mPending.removeFirst();
      final int a = (int) (key >>> 11 & 127);
      final int b = (int) (key >>> 4 & 127);
      final int slot = (int) (key & 15);
      final int weight = (int) (key >> 20);
      final int direction = (int) (key >>> 18 & 3);
      final int rule = mTable[slot];
      if (rule < 0) {
        return false;
      }
      final int write = rule & 2;
      final int next = 2 * (rule >>> 2);
      if ((rule & 1) != 0) {
        for (int k = 0; k < mR.length; ++k) {
          for (int sym = 0; sym <= 2; sym += 2) {
            if (mR[k][sym] == b) {
              add(mL[a][write], k, next + sym / 2, weight + mL[a][write + 1] - mR[k][sym + 1], direction);
            }
          }
        }
      } else {
        for (int k = 0; k < mL.length; ++k) {
          for (int sym = 0; sym <= 2; sym += 2) {
            if (mL[k][sym] == a) {
              add(k, mR[b][write], next + sym / 2, weight + mR[b][write + 1] - mL[k][sym + 1], direction);
            }
          }
        }
      }
    }
    return true;
  }

  static boolean closes(final int[] table, final int[][] l, final int[][] r, final int cutoff) {
    return cutoff >= 1 && cutoff <= 100 && valid(l) && valid(r) && new WeightedAutomata(table, l, r, cutoff).check();
  }
}
