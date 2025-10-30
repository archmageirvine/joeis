package irvine.oeis.a389;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.string.StringUtils;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A389766 extends AbstractSequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 7;

  private static class State {
    private final int mAttacked;
    private final long mColumnCounts;

    private State(final int attacked, final long columnCounts) {
      mAttacked = attacked;
      mColumnCounts = columnCounts;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State other = (State) obj;
      return mAttacked == other.mAttacked && mColumnCounts == other.mColumnCounts;
    }

    @Override
    public int hashCode() {
      return mAttacked;
    }

    @Override
    public String toString() {
      return Long.toString(mColumnCounts, 4) + "(" + Integer.toBinaryString(mAttacked) + ")";
    }
  }

  /** Construct the sequence. */
  public A389766() {
    super(8);
  }

  @Override
  public Z next() {
    if (++mN > Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    final int rowMask = (1 << mN) - 1;
    final int[] attackMasks = new int[mN];
    for (int k = 0; k < mN; ++k) {
      attackMasks[k] = (int) ((0b111L << k) >>> 1) & rowMask;
    }
    Map<State, Long> states = Collections.singletonMap(new State(0, 0), 1L);
    for (int row = 0; row < mN; ++row) {
      final HashMap<State, Long> newStates = new HashMap<>();
      for (final Map.Entry<State, Long> e : states.entrySet()) {
        final State s = e.getKey();
        final long cnt = e.getValue();
        for (int firstKing = 0; firstKing < mN - 2; ++firstKing) {
          if ((s.mAttacked & (1 << firstKing)) == 0) {
            final long firstColCount = (s.mColumnCounts >> (2 * firstKing)) & 3;
            if (firstColCount != 2) {
              // We can place the first king at firstKing
              for (int secondKing = firstKing + 2; secondKing < mN; ++secondKing) {
                if ((s.mAttacked & (1 << secondKing)) == 0) {
                  final long secondColCount = (s.mColumnCounts >> (2 * secondKing)) & 3;
                  if (secondColCount != 2) {
                    // We can place the second king at secondKing
                    newStates.merge(new State(attackMasks[firstKing] | attackMasks[secondKing], s.mColumnCounts + (1L << (2 * firstKing)) + (1L << (2 * secondKing))), cnt, Long::sum);
                  }
                }
              }
            }
          }
        }
      }
      states = newStates;
      if (mVerbose) {
        StringUtils.message("n=" + mN + " completed row " + (row + 1) + " number of states " + states.size());
      }
    }
    Z sum = Z.ZERO;
    for (final long v : states.values()) {
      sum = sum.add(v);
    }
    return sum;
  }
}
