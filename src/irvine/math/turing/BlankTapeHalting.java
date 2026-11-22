package irvine.math.turing;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;

/**
 * Exact bounded searches of binary Turing machines on a blank tape.
 * @author Gregory Morse
 */
public final class BlankTapeHalting {

  private final int mStates;
  private final int mLimit;
  private final int[] mRules;
  private final byte[] mTape;
  private final int[] mPositions;
  private final byte[] mSymbols;
  private final BitSet mTimes = new BitSet();
  private final BitSet mScores = new BitSet();
  private final int mTargetScore;
  private final boolean mLastOnly;
  private final Map<String, Z> mOutputs;
  private final Z[][] mWeights;
  private Z mCount = Z.ZERO;
  private Z mTotalSteps = Z.ZERO;
  private int mCleanMaximum = 0;

  private BlankTapeHalting(final int states, final int limit, final boolean tally, final int targetScore) {
    this(states, limit, tally, targetScore, false, false);
  }

  private BlankTapeHalting(final int states, final int limit, final boolean tally, final int targetScore, final boolean outputs, final boolean lastOnly) {
    mStates = states;
    mLimit = limit;
    mRules = new int[2 * states];
    Arrays.fill(mRules, -1);
    mTape = new byte[Math.addExact(Math.multiplyExact(2, limit), 1)];
    mPositions = new int[limit];
    mSymbols = new byte[limit];
    mWeights = tally || outputs ? new Z[mRules.length][states + 1] : null;
    mTargetScore = targetScore;
    mLastOnly = lastOnly;
    mOutputs = outputs ? new HashMap<>() : null;
  }

  private Z weight(final int used, final int seen) {
    if (mWeights[used][seen] == null) {
      // Complete the unused rules and undo the renaming of the discovered states.
      Z w = Z.valueOf(4L * mStates + (mOutputs == null ? 4 : 2)).pow(mRules.length - used - 1);
      for (int k = 1; k < seen; ++k) {
        w = w.multiply(mStates - k);
      }
      // A halt has four variants. Restore reflection if the first rule did not halt.
      mWeights[used][seen] = mOutputs == null ? w.shiftLeft(used == 0 ? 2 : 3) : w;
    }
    return mWeights[used][seen];
  }

  private boolean visit() {
    return visit(0, mLimit, 1, 0, 0, 0, mLimit, mLimit);
  }

  private boolean visit(int state, int position, final int seen, final int used,
                        final int start, int ones, int low, int high) {
    int time = start;
    boolean found = false;
    while (time < mLimit) {
      low = Math.min(low, position);
      high = Math.max(high, position);
      final byte symbol = mTape[position];
      final int slot = 2 * state + symbol;
      final int rule = mRules[slot];
      if (rule < 0) {
        // An undefined transition may halt here or introduce a new rule.
        mTimes.set(time + 1);
        mScores.set(ones - symbol, ones - symbol + 2);
        if (mOutputs != null) {
          recordOutput(position, used, seen, low, high);
        } else if (mWeights != null) {
          final Z w = weight(used, seen);
          mCount = mCount.add(w);
          mTotalSteps = mTotalSteps.add(w.multiply(time + 1));
          if (ones == symbol) {
            mCleanMaximum = Math.max(mCleanMaximum, time + 1);
          }
        }
        if (mLastOnly && time + 1 == mLimit
          || mTargetScore >= 0 && (mTargetScore == ones - symbol || mTargetScore == ones - symbol + 1)) {
          found = true;
        } else if (time + 1 < mLimit) {
          // Name states in order of discovery and fix the first move's direction.
          for (int next = 0; next < Math.min(mStates, seen + 1) && !found; ++next) {
            for (int write = 0; write < 2 && !found; ++write) {
              for (int direction = time == 0 ? 1 : 0; direction < 2 && !found; ++direction) {
                mRules[slot] = 4 * next + 2 * write + direction;
                found = visit(state, position, Math.max(seen, next + 1), used + 1, time, ones, low, high);
              }
            }
          }
          mRules[slot] = -1;
        }
        break;
      }
      mPositions[time] = position;
      mSymbols[time] = symbol;
      final byte write = (byte) ((rule >>> 1) & 1);
      mTape[position] = write;
      ones += write - symbol;
      position += (rule & 1) == 0 ? -1 : 1;
      state = rule >>> 2;
      ++time;
    }
    while (time > start) {
      --time;
      mTape[mPositions[time]] = mSymbols[time];
    }
    return found;
  }

  private void recordOutput(final int position, final int used, final int seen, final int low, final int high) {
    final Z w = weight(used, seen);
    for (int write = 0; write < 2; ++write) {
      // D(n) includes both choices of the blank symbol.
      for (int blank = 0; blank < 2; ++blank) {
        final StringBuilder word = new StringBuilder();
        for (int k = low; k <= high; ++k) {
          word.append((k == position ? write : mTape[k]) ^ blank);
        }
        mOutputs.merge(word.toString(), w, Z::add);
        if (used > 0) {
          mOutputs.merge(word.reverse().toString(), w, Z::add);
        }
      }
    }
  }

  /**
   * Count the output strings among halting machines using either blank symbol
   * and no motion on halt (the Delahaye-Zenil model).
   * @param states number of nonhalting states
   * @param limit maximum time
   * @return histogram of tape substrings traversed by halting machines
   */
  public static Map<String, Z> outputs(final int states, final int limit) {
    final BlankTapeHalting search = new BlankTapeHalting(states, limit, false, -1, true, false);
    search.visit();
    return search.mOutputs;
  }

  /**
   * Return all attainable halting times at most the specified bound.
   * @param states number of nonhalting states
   * @param limit maximum time
   * @return bit set indexed by halting time
   */
  public static BitSet times(final int states, final int limit) {
    final BlankTapeHalting search = new BlankTapeHalting(states, limit, false, -1);
    search.visit();
    return search.mTimes;
  }

  /**
   * Test whether a machine halts at exactly the specified time.
   * @param states number of nonhalting states
   * @param time exact halting time
   * @return true iff the time is attainable
   */
  public static boolean attainable(final int states, final int time) {
    return new BlankTapeHalting(states, time, false, -1, false, true).visit();
  }

  /**
   * Return counts of ones attainable by halting within the specified bound.
   * @param states number of nonhalting states
   * @param limit maximum time
   * @return attainable scores
   */
  public static BitSet scores(final int states, final int limit) {
    final BlankTapeHalting search = new BlankTapeHalting(states, limit, false, -1);
    search.visit();
    return search.mScores;
  }

  /**
   * Test whether a halting machine within the time bound can leave a given score.
   * @param states number of nonhalting states
   * @param limit maximum time
   * @param score desired number of ones
   * @return true iff such a machine exists within the bound
   */
  public static boolean attainableScore(final int states, final int limit, final int score) {
    return new BlankTapeHalting(states, limit, false, score).visit();
  }

  /**
   * Enumerate and tally all fully labeled transition tables halting within a bound.
   * @param states number of nonhalting states
   * @param limit maximum time
   * @return bounded halting statistics
   */
  public static BlankTapeHalting tally(final int states, final int limit) {
    final BlankTapeHalting search = new BlankTapeHalting(states, limit, true, -1);
    search.visit();
    return search;
  }

  /**
   * @return count of halting tables
   */
  public Z count() {
    return mCount;
  }

  /**
   * @return sum of halting times
   */
  public Z totalSteps() {
    return mTotalSteps;
  }

  /**
   * @return greatest halting time with a blank final tape, or zero if none
   */
  public int cleanMaximum() {
    return mCleanMaximum;
  }
}
