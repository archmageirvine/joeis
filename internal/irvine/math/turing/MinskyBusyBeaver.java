package irvine.math.turing;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;

/**
 * Exact bounded-size verification of the Minsky step and register maxima.
 * @author Gregory Morse
 */
public final class MinskyBusyBeaver {

  private static final int INFINITY = 9;
  private static final int FINITE_BOUND = INFINITY - 1;
  private static final int SMALL_VALUE = 5;
  private static final int WORD_MASK = 7;
  private static final int UNBOUNDED = 1_000_000;
  private static final int OCTAGON_LIMIT = 24;

  private final int mInstructions;
  private final int mStepLimit;
  private final int[] mRegister;
  private final boolean[] mIncrement;
  private final int[] mTarget;
  private final int[] mValue;
  private final int[] mLastVisit;
  private final int[] mLastZero;
  private final int[] mPreviousVisit;
  private final int[][] mHistory;
  private final int[][] mLower;
  private final int[][] mUpper;
  private final BitSet mAbstractStates = new BitSet();
  private final int[] mQueue = new int[20_000];
  private int mQueueSize;
  private long mHalts;
  private long mLoops;
  private long mUnknown;
  private long mVisits;
  private int mSteps;
  private int mScore;
  private boolean mCapped;

  private MinskyBusyBeaver(final int instructions, final int stepLimit) {
    mInstructions = instructions;
    mStepLimit = stepLimit;
    mRegister = new int[instructions];
    mIncrement = new boolean[instructions];
    mTarget = new int[2 * instructions];
    mValue = new int[instructions];
    mLastVisit = new int[instructions];
    mLastZero = new int[instructions];
    mPreviousVisit = new int[stepLimit];
    mHistory = new int[stepLimit][instructions];
    mLower = new int[instructions][instructions];
    mUpper = new int[instructions][instructions];
    Arrays.fill(mTarget, -1);
    Arrays.fill(mLastVisit, -1);
    Arrays.fill(mLastZero, -1);
  }

  private boolean repeats(final int pc, final int registers) {
    for (int previous = mLastVisit[pc]; previous >= 0; previous = mPreviousVisit[previous]) {
      boolean covers = true;
      final int[] initial = mHistory[previous];
      for (int r = 0; r < registers; ++r) {
        if (mValue[r] < initial[r] || mValue[r] > initial[r] && mLastZero[r] >= previous) {
          covers = false;
          break;
        }
      }
      if (covers) {
        // The later configuration repeats the same instruction with every
        // register increased by a nonnegative delta. A register with positive
        // delta did not take any zero branch in the intervening segment.
        // Repeating the segment therefore adds the same delta indefinitely.
        return true;
      }
    }
    return false;
  }

  private boolean cannotReachHalt(final int pc) {
    int pending = 1 << pc;
    int seen = 0;
    while (pending != 0) {
      final int from = Integer.numberOfTrailingZeros(pending);
      final int target = mTarget[2 * from];
      if (target < 0) {
        return false;
      }
      pending |= 1 << target;
      if (!mIncrement[from]) {
        final int zero = mTarget[2 * from + 1];
        if (zero < 0) {
          return false;
        }
        pending |= 1 << zero;
      }
      seen |= 1 << from;
      pending &= ~seen;
    }
    return true;
  }

  private void propagate(final int from, final int to, final int valueLower, final int valueUpper) {
    final int changed = mRegister[from];
    for (int r = 0; r < mInstructions; ++r) {
      mLower[to][r] = Math.min(mLower[to][r], r == changed ? valueLower : mLower[from][r]);
      mUpper[to][r] = Math.max(mUpper[to][r], r == changed ? valueUpper : mUpper[from][r]);
    }
  }

  private boolean excludesMissingBranch(final int pc, final int used) {
    int pending = 1 << pc;
    for (int i = 0; i < used; ++i) {
      Arrays.fill(mLower[i], INFINITY);
      Arrays.fill(mUpper[i], -1);
    }
    for (int r = 0; r < mInstructions; ++r) {
      mLower[pc][r] = Math.min(FINITE_BOUND, mValue[r]);
      mUpper[pc][r] = Math.min(INFINITY, mValue[r]);
    }
    // Inductive interval bounds in a finite lattice. Any branch that can
    // reach an unset target prevents the proof, even a spurious branch.
    while (pending != 0) {
      final int from = Integer.numberOfTrailingZeros(pending);
      pending &= ~(1 << from);
      final int r = mRegister[from];
      final int lower = mLower[from][r];
      final int upper = mUpper[from][r];
      if (!mIncrement[from] && lower == 0) {
        final int zero = mTarget[2 * from + 1];
        if (zero < 0) {
          return false;
        }
        if (widens(from, zero, 0, 0)) {
          propagate(from, zero, 0, 0);
          pending |= 1 << zero;
        }
      }
      if (mIncrement[from] || upper > 0) {
        final int target = mTarget[2 * from];
        if (target < 0) {
          return false;
        }
        final int lo = mIncrement[from] ? Math.min(FINITE_BOUND, lower + 1) : Math.max(0, lower - 1);
        final int hi = mIncrement[from] ? Math.min(INFINITY, upper + 1) : upper == INFINITY ? INFINITY : upper - 1;
        if (widens(from, target, lo, hi)) {
          propagate(from, target, lo, hi);
          pending |= 1 << target;
        }
      }
    }
    return true;
  }

  private boolean widens(final int from, final int to, final int lo, final int hi) {
    final int changed = mRegister[from];
    for (int r = 0; r < mInstructions; ++r) {
      if ((r == changed ? lo : mLower[from][r]) < mLower[to][r]
        || (r == changed ? hi : mUpper[from][r]) > mUpper[to][r]) {
        return true;
      }
    }
    return false;
  }

  private boolean addAbstractState(final int state) {
    if (!mAbstractStates.get(state)) {
      if (mQueueSize == mQueue.length) {
        return false;
      }
      mAbstractStates.set(state);
      mQueue[mQueueSize++] = state;
    }
    return true;
  }

  private boolean closesResidues(final int pc, final int registers) {
    // Exact values through five; above five distinguish the two parities.
    // On decrement, a large even value may cross back to five.
    final int pcShift = 3 * registers;
    final int valuesMask = (1 << pcShift) - 1;
    int initial = pc << pcShift;
    for (int r = 0; r < registers; ++r) {
      final int value = mValue[r];
      initial |= (value <= SMALL_VALUE ? value : 6 + (value & 1)) << (3 * r);
    }
    mAbstractStates.clear();
    mQueueSize = 0;
    addAbstractState(initial);
    for (int i = 0; i < mQueueSize; ++i) {
      final int state = mQueue[i];
      final int from = state >>> pcShift;
      final int shift = 3 * mRegister[from];
      final int value = state >>> shift & WORD_MASK;
      final boolean increment = mIncrement[from];
      final int target = mTarget[2 * from + (!increment && value == 0 ? 1 : 0)];
      if (target < 0) {
        return false;
      }
      final int unchanged = (target << pcShift) | (state & (valuesMask & ~(WORD_MASK << shift)));
      final int next = value > SMALL_VALUE ? value ^ 1 : increment ? value + 1 : Math.max(0, value - 1);
      if (!addAbstractState(unchanged | (next << shift))
        || !increment && value == 6 && !addAbstractState(unchanged | (SMALL_VALUE << shift))) {
        return false;
      }
    }
    return true;
  }

  private static boolean closeOctagon(final int[][] bounds) {
    for (int k = 0; k < bounds.length; ++k) {
      for (int i = 0; i < bounds.length; ++i) {
        if (bounds[i][k] < UNBOUNDED) {
          for (int j = 0; j < bounds.length; ++j) {
            if (bounds[k][j] < UNBOUNDED) {
              bounds[i][j] = Math.min(bounds[i][j], bounds[i][k] + bounds[k][j]);
            }
          }
          if (bounds[i][i] < 0) {
            return false;
          }
        }
      }
    }
    // A signed coordinate whose opposite is j^1 is bounded by half
    // their difference. Combine these unary bounds for each pair.
    for (int i = 0; i < bounds.length; ++i) {
      if (bounds[i][i ^ 1] < UNBOUNDED) {
        for (int j = 0; j < bounds.length; ++j) {
          if (bounds[j ^ 1][j] < UNBOUNDED) {
            bounds[i][j] = Math.min(bounds[i][j], (bounds[i][i ^ 1] >> 1) + (bounds[j ^ 1][j] >> 1));
          }
        }
        if (bounds[i][i] < 0) {
          return false;
        }
      }
    }
    return true;
  }

  private static int bound(final int value) {
    return value > OCTAGON_LIMIT ? UNBOUNDED : Math.max(-OCTAGON_LIMIT, value);
  }

  private boolean closesOctagons(final int pc, final int used, final int[] weights) {
    // Track upper bounds on differences of signed coordinates
    // (+r0,-r0,+r1,-r1,...) at each instruction. Join by weakening.
    final int size = 2 * weights.length;
    final int[][][] pcBounds = new int[used][size][size];
    final boolean[] reached = new boolean[used];
    final int[][] next = new int[size][size];
    int pending = 1 << pc;
    reached[pc] = true;
    for (int i = 0; i < size; ++i) {
      for (int j = 0; j < size; ++j) {
        pcBounds[pc][i][j] = bound(signedValue(i) * weights[i / 2] - signedValue(j) * weights[j / 2]);
      }
    }
    while (pending != 0) {
      final int from = Integer.numberOfTrailingZeros(pending);
      pending &= ~(1 << from);
      final int positive = 2 * mRegister[from];
      final int negative = positive ^ 1;
      for (int branch = 0; branch < (mIncrement[from] ? 1 : 2); ++branch) {
        for (int i = 0; i < size; ++i) {
          System.arraycopy(pcBounds[from][i], 0, next[i], 0, size);
          if ((i & 1) == 1) {
            next[i][i ^ 1] = Math.min(next[i][i ^ 1], 0);
          }
        }
        final int weight = weights[mRegister[from]];
        final int change = mIncrement[from] ? weight : branch == 0 ? -weight : 0;
        if (!mIncrement[from]) {
          if (branch == 0) {
            next[negative][positive] = Math.min(next[negative][positive], -2 * weight);
          } else {
            next[positive][negative] = Math.min(next[positive][negative], 0);
          }
        }
        if (!closeOctagon(next)) {
          continue;
        }
        final int target = mTarget[2 * from + branch];
        if (target < 0) {
          return false;
        }
        boolean changed = !reached[target];
        for (int i = 0; i < size; ++i) {
          final int di = i == positive ? change : i == negative ? -change : 0;
          for (int j = 0; j < size; ++j) {
            final int dj = j == positive ? change : j == negative ? -change : 0;
            final int value = next[i][j] == UNBOUNDED ? UNBOUNDED : bound(next[i][j] + di - dj);
            if (!reached[target] || value > pcBounds[target][i][j]) {
              changed = true;
              pcBounds[target][i][j] = value;
            }
          }
        }
        if (changed) {
          reached[target] = true;
          pending |= 1 << target;
        }
      }
    }
    return true;
  }

  private int signedValue(final int coordinate) {
    return (coordinate & 1) == 0 ? mValue[coordinate / 2] : -mValue[coordinate / 2];
  }

  private boolean closesScaledOctagons(final int pc, final int used, final int registers) {
    final int[] weights = new int[registers];
    Arrays.fill(weights, 1);
    if (closesOctagons(pc, used, weights)) {
      return true;
    }
    for (int r = 0; r < registers; ++r) {
      for (int w = 2; w <= 3; ++w) {
        weights[r] = w;
        if (closesOctagons(pc, used, weights)) {
          return true;
        }
      }
      weights[r] = 1;
    }
    return false;
  }

  private void visit(final int pc, final int used, final int registers, final int time) {
    if (++mVisits > 650_000_000L) {
      mCapped = true;
      return;
    }
    if (pc == used) {
      // The first visit to a previously unseen instruction may instead halt.
      // Otherwise name it, and any new register, in order of first encounter.
      ++mHalts;
      mSteps = Math.max(mSteps, time);
      for (final int value : mValue) {
        mScore = Math.max(mScore, value);
      }
      if (used < mInstructions) {
        for (int r = 0; r <= registers && !mCapped; ++r) {
          mRegister[pc] = r;
          mIncrement[pc] = true;
          execute(pc, used + 1, Math.max(registers, r + 1), time);
          if (!mCapped) {
            mIncrement[pc] = false;
            execute(pc, used + 1, Math.max(registers, r + 1), time);
          }
        }
      }
    } else {
      execute(pc, used, registers, time);
    }
  }

  private void execute(final int pc, final int used, final int registers, final int time) {
    if (repeats(pc, registers) || time == mStepLimit
      && (cannotReachHalt(pc) || excludesMissingBranch(pc, used) || closesResidues(pc, registers)
      || closesScaledOctagons(pc, used, registers))) {
      ++mLoops;
      return;
    }
    if (time == mStepLimit) {
      // A step limit is never used as a nonhalting certificate.
      ++mUnknown;
      if (mUnknown <= 16) {
        final StringBuilder example = new StringBuilder();
        for (int i = 0; i < used; ++i) {
          example.append(' ').append(mRegister[i]).append(mIncrement[i] ? '+' : '-')
            .append(mTarget[2 * i]);
          if (!mIncrement[i]) {
            example.append('/').append(mTarget[2 * i + 1]);
          }
        }
        System.err.println("Unresolved:" + example + " at " + pc + " " + Arrays.toString(mValue));
      }
      return;
    }
    final int previous = mLastVisit[pc];
    mPreviousVisit[time] = previous;
    System.arraycopy(mValue, 0, mHistory[time], 0, registers);
    Arrays.fill(mHistory[time], registers, mInstructions, 0);
    mLastVisit[pc] = time;
    final int r = mRegister[pc];
    final int value = mValue[r];
    final int zero = mLastZero[r];
    final int branch;
    if (mIncrement[pc]) {
      mValue[r] = value + 1;
      branch = 2 * pc;
    } else if (value > 0) {
      mValue[r] = value - 1;
      branch = 2 * pc;
    } else {
      mLastZero[r] = time;
      branch = 2 * pc + 1;
    }
    if (mTarget[branch] < 0) {
      // An unobserved branch can lead to a seen instruction or a fresh one.
      for (int dest = 0; dest <= used && !mCapped; ++dest) {
        mTarget[branch] = dest;
        visit(dest, used, registers, time + 1);
      }
      mTarget[branch] = -1;
    } else {
      visit(mTarget[branch], used, registers, time + 1);
    }
    mLastVisit[pc] = previous;
    mLastZero[r] = zero;
    mValue[r] = value;
  }

  /**
   * Compute the maxima, failing if the search does not settle every machine.
   * @param args total instruction count (including one HALT), optional step limit
   */
  public static void main(final String[] args) {
    if (args.length < 1 || args.length > 2) {
      throw new IllegalArgumentException("Usage: MinskyBusyBeaver <instructions> [step-limit]");
    }
    final int n = Integer.parseInt(args[0]);
    final int limit = args.length == 2 ? Integer.parseInt(args[1]) : 512;
    if (n < 1 || n > 8 || limit < 1 || limit > 512) {
      throw new IllegalArgumentException("Expected 1..8 instructions and 1..512 steps");
    }
    final long start = System.nanoTime();
    final MinskyBusyBeaver search = new MinskyBusyBeaver(n - 1, limit);
    search.visit(0, 0, 0, 0);
    System.out.printf(Locale.ROOT, "n=%d nodes=%d halt=%d loop=%d unknown=%d capped=%b steps=%d score=%d seconds=%.6f%n",
      n, search.mVisits, search.mHalts, search.mLoops, search.mUnknown, search.mCapped,
      search.mSteps, search.mScore, (System.nanoTime() - start) / 1e9);
    if (search.mUnknown != 0 || search.mCapped) {
      throw new IllegalStateException("Search did not certify both maxima");
    }
  }
}
