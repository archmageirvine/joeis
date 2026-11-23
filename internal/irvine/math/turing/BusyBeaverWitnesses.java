package irvine.math.turing;

import java.util.BitSet;

/**
 * Records halting times and shortest small-score witnesses during an exact enumeration.
 * @author Gregory Morse
 */
final class BusyBeaverWitnesses {
  private final BitSet mTimes = new BitSet();
  private final int[] mLength = new int[64];
  private final String[] mMachine = new String[mLength.length];

  void record(final int[] table, final int time, final int ones, final int haltSlot) {
    mTimes.set(time);
    // The checked halting action writes 1. A write of 0 changes the score by one.
    save(table, time, ones - 1, haltSlot, false);
    save(table, time, ones, haltSlot, true);
  }

  private void save(final int[] table, final int time, final int score, final int haltSlot, final boolean write) {
    if (score >= mLength.length || mLength[score] != 0 && time >= mLength[score]) {
      return;
    }
    mLength[score] = time;
    mMachine[score] = format(table, haltSlot, write);
  }

  static String format(final int[] table, final int haltSlot, final boolean write) {
    final StringBuilder result = new StringBuilder();
    for (int i = 0; i < table.length; ++i) {
      final int rule = table[i];
      if (rule < 0) {
        result.append(i == haltSlot ? write ? "1RZ" : "0RZ" : "---");
      } else {
        result.append(rule >>> 1 & 1).append((rule & 1) == 0 ? 'L' : 'R').append((char) ('A' + (rule >>> 2)));
      }
    }
    return result.toString();
  }

  void print() {
    System.out.println("firstMissingTime=" + mTimes.nextClearBit(1));
    for (int n = 0; n < mLength.length; ++n) {
      if (mLength[n] != 0) {
        System.out.println("score=" + n + " steps=" + mLength[n] + " machine=" + mMachine[n]);
      }
    }
  }
}
