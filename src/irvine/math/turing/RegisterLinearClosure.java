package irvine.math.turing;

import java.util.Arrays;

/**
 * Inductive closure using lower bounds on small integer linear forms in
 * the registers. Only used when simpler register bounds are inconclusive.
 * @author Gregory Morse
 */
final class RegisterLinearClosure {
  private static final int UNBOUNDED = -1_000_000;
  private static final int NO_UPPER_BOUND = -UNBOUNDED;
  private static final int LIMIT = 96;
  private static final int RADIUS = 2;
  private static final int BASE = 2 * RADIUS + 1;

  private final int mRegisters;
  private final int mCount;
  private final int mZero;
  private final int[] mPlace;
  private final int[][] mCoeff;
  private final int[][] mSums;
  private final int[][] mBounds;
  private final boolean[] mReached;
  private final int[] mGuarded;
  private final int[] mNext;
  private long mPending;

  RegisterLinearClosure(final int instructions, final int registers) {
    mRegisters = registers;
    mPlace = new int[registers];
    int count = 1;
    for (int r = 0; r < registers; ++r) {
      mPlace[r] = count;
      count *= BASE;
    }
    mCount = count;
    mZero = count / 2;
    mCoeff = new int[mCount][registers];
    mSums = new int[mCount][mCount];
    for (int f = 0; f < mCount; ++f) {
      for (int r = 0; r < registers; ++r) {
        mCoeff[f][r] = f / mPlace[r] % BASE - RADIUS;
      }
    }
    for (int f = 0; f < mCount; ++f) {
      Arrays.fill(mSums[f], -1);
      for (int g = f; g < mCount; ++g) {
        boolean inRange = true;
        for (int r = 0; r < registers; ++r) {
          inRange &= Math.abs(mCoeff[f][r] + mCoeff[g][r]) <= RADIUS;
        }
        if (inRange) {
          mSums[f][g] = f + g - mZero;
        }
      }
    }
    final int states = instructions << registers;
    mBounds = new int[states][mCount];
    mReached = new boolean[states];
    mGuarded = new int[mCount];
    mNext = new int[mCount];
  }

  private static int widen(final int value) {
    return value < -LIMIT ? UNBOUNDED : Math.min(LIMIT, value);
  }

  private boolean strengthen(final int[] lower) {
    for (int f = 0; f < mCount; ++f) {
      if (lower[f] != UNBOUNDED) {
        for (int g = f; g < mCount; ++g) {
          final int h = mSums[f][g];
          if (h != -1 && lower[g] != UNBOUNDED) {
            lower[h] = Math.max(lower[h], Math.min(LIMIT, lower[f] + lower[g]));
          }
        }
      }
    }
    return lower[mZero] <= 0;
  }

  private boolean transfer(final int[] lower, final int r, final int low, final int high, final int delta) {
    final int place = mPlace[r];
    final int min = Math.max(low, lower[mZero + place]);
    final int max = Math.min(high, lower[mZero - place] == UNBOUNDED ? NO_UPPER_BOUND : -lower[mZero - place]);
    if (min > max) {
      return false;
    }
    for (int f = 0; f < mCount; ++f) {
      int best = lower[f];
      final int coeff = mCoeff[f][r];
      for (int c = -RADIUS; c <= RADIUS; ++c) {
        final int other = lower[f + (c - coeff) * place];
        if (other != UNBOUNDED && (c <= coeff || max != NO_UPPER_BOUND)) {
          best = Math.max(best, other + (coeff - c) * (c <= coeff ? min : max));
        }
      }
      mGuarded[f] = best;
    }
    mGuarded[mZero + place] = Math.max(mGuarded[mZero + place], min);
    if (max != NO_UPPER_BOUND) {
      mGuarded[mZero - place] = Math.max(mGuarded[mZero - place], -max);
    }
    if (!strengthen(mGuarded)) {
      return false;
    }
    for (int f = 0; f < mCount; ++f) {
      mNext[f] = mGuarded[f] == UNBOUNDED ? UNBOUNDED : widen(mGuarded[f] + delta * mCoeff[f][r]);
    }
    // Every actual register is nonnegative, independently of our templates.
    for (final int unit : mPlace) {
      mNext[mZero + unit] = Math.max(mNext[mZero + unit], 0);
    }
    return true;
  }

  private boolean send(final int from, final int target, final int mask, final int register,
                       final int lo, final int hi, final int delta) {
    if (!transfer(mBounds[from], register, lo, hi, delta)) {
      return true;
    }
    if (target < 0) {
      return false;
    }
    final int to = target << mRegisters | mask;
    boolean changed = !mReached[to];
    for (int f = 0; f < mCount; ++f) {
      if (!mReached[to] || mNext[f] < mBounds[to][f]) {
        mBounds[to][f] = mNext[f];
        changed = true;
      }
    }
    if (changed) {
      mReached[to] = true;
      mPending |= 1L << to;
    }
    return true;
  }

  boolean closes(final int pc, final int[] start, final int[] register, final boolean[] inc, final int[] targets) {
    // Keep distinct polyhedra for each zero/nonzero pattern. Joining
    // across those patterns can erase a guard that holds disjunctively.
    int initial = pc << mRegisters;
    for (int r = 0; r < mRegisters; ++r) {
      if (start[r] != 0) {
        initial |= 1 << r;
      }
    }
    mReached[initial] = true;
    for (int f = 0; f < mCount; ++f) {
      int value = 0;
      for (int r = 0; r < mRegisters; ++r) {
        value += start[r] * mCoeff[f][r];
      }
      mBounds[initial][f] = widen(value);
    }
    mPending = 1L << initial;
    int work = 0;
    while (mPending != 0) {
      if (++work > 4000) {
        return false;
      }
      final int from = Long.numberOfTrailingZeros(mPending);
      mPending &= ~(1L << from);
      final int instruction = from >>> mRegisters;
      final int mask = from & ((1 << mRegisters) - 1);
      final int r = register[instruction];
      final int bit = 1 << r;
      if (inc[instruction]) {
        if (!send(from, targets[2 * instruction], mask | bit, r, 0, NO_UPPER_BOUND, 1)) {
          return false;
        }
      } else if ((mask & bit) == 0) {
        if (!send(from, targets[2 * instruction + 1], mask, r, 0, 0, 0)) {
          return false;
        }
      } else if (!send(from, targets[2 * instruction], mask & ~bit, r, 1, 1, -1)
        || !send(from, targets[2 * instruction], mask, r, 2, NO_UPPER_BOUND, -1)) {
        return false;
      }
    }
    return true;
  }
}
