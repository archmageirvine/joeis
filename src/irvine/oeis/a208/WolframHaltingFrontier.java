package irvine.oeis.a208;

/**
 * Exact first-visit frontier for Wolfram machine 596440.
 * @author Gregory Morse
 */
final class WolframHaltingFrontier {

  private static final int[] WRITE = {1, 2, 1, 2, 2, 0};
  private static final int[] MOVE = {1, -1, -1, -1, 1, 1};
  private static final int[] STATE = {1, 0, 0, 0, 1, 0};
  private static final int TIME_BITS = 16;
  private static final int TIME_MASK = (1 << TIME_BITS) - 1;

  private static final class Frontier {
    private final long[] mEntries;
    private final int mMask;
    private int mSize;

    Frontier(final int capacity) {
      mEntries = new long[capacity];
      mMask = capacity - 1;
    }

    void add(final long key, final int elapsed) {
      if (elapsed >= TIME_MASK || key >>> (Long.SIZE - TIME_BITS) != 0) {
        throw new IllegalStateException("Frontier packed representation exceeded");
      }
      long h = key;
      h = (h ^ h >>> 30) * 0xbf58476d1ce4e5b9L;
      h = (h ^ h >>> 27) * 0x94d049bb133111ebL;
      int i = (int) (h ^ h >>> 31) & mMask;
      final long value = (key << TIME_BITS) | (elapsed + 1L);
      while (true) {
        final long old = mEntries[i];
        if (old == 0) {
          if (++mSize >= mMask) {
            throw new IllegalStateException("Frontier allocation exhausted");
          }
          mEntries[i] = value;
          return;
        }
        if (old >>> TIME_BITS == key) {
          mEntries[i] = Math.max(value, old);
          return;
        }
        i = (i + 1) & mMask;
      }
    }
  }

  private static final class Run {
    private long mLeft;
    private int mState;
    private int mSteps;

    // Returns true at the first visit to the next unknown cell; false at halt.
    boolean run(long tape, int state, int head, final int boundary, final int elapsed) {
      long hi = 0;
      mSteps = elapsed;
      while (head >= 0 && head < boundary) {
        if (++mSteps >= TIME_MASK || head >= 64) {
          throw new IllegalStateException("Unresolved computation; no maximum reported");
        }
        final int shift = (head & 31) << 1;
        final boolean high = head >= 32;
        final long current = high ? hi : tape;
        final int symbol = (int) (current >>> shift) & 3;
        final int rule = 3 * state + symbol;
        final long toggle = (long) (symbol ^ WRITE[rule]) << shift;
        if (high) {
          hi ^= toggle;
        } else {
          tape ^= toggle;
        }
        state = STATE[rule];
        head += MOVE[rule];
      }
      mLeft = tape;
      mState = state;
      return head == boundary;
    }
  }

  private static int capacity(final int size) {
    // Each prefix has at most three children. Reserve enough room for all.
    return Math.max(8, Integer.highestOneBit(3 * size + 1) << 1);
  }

  private Frontier mFrontier = new Frontier(8);
  private int mWidth;
  private int mEarly;

  WolframHaltingFrontier() {
    mFrontier.add(0L, 0);
  }

  int next(final boolean extend) {
    final int n = mWidth++;
    if (n > 22 || mFrontier == null || extend && n == 22) {
      throw new UnsupportedOperationException("Supported input lengths are 0 through 22");
    }
    int best = mEarly;
    final Frontier next = extend ? new Frontier(capacity(mFrontier.mSize)) : null;
    final Run run = new Run();
    for (final long entry : mFrontier.mEntries) {
      if (entry == 0) {
        continue;
      }
      final int elapsed = ((int) entry & TIME_MASK) - 1;
      final int state = (int) (entry >>> TIME_BITS) & 1;
      final long tape = entry >>> (TIME_BITS + 1);
      // All tape cells beyond the given input start blank.
      run.run(tape, state, n, Integer.MAX_VALUE, elapsed);
      best = Math.max(best, run.mSteps);
      if (next != null) {
        for (int digit = 0; digit < 3; ++digit) {
          if (run.run(tape | (long) digit << (2 * n), state, n, n + 1, elapsed)) {
            // Identical left tape and state have identical future behavior.
            // Only the longest elapsed time can contribute to the maximum.
            next.add((run.mLeft << 1) | run.mState, run.mSteps);
          } else {
            mEarly = Math.max(mEarly, run.mSteps);
          }
        }
      }
    }
    mFrontier = next;
    return best;
  }

  static int replay(final long input) {
    final Run run = new Run();
    run.run(input, 0, 0, Integer.MAX_VALUE, 0);
    return run.mSteps;
  }
}
