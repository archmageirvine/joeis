package irvine.math.turing;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Exhaustive bounded-size verification of Turing-machine maxima.
 * @author Gregory Morse
 */
public final class AlphabetBusyBeaver {

  private static final Map<Integer, AlphabetBusyBeaver> RESULTS = new ConcurrentHashMap<>();
  private static final Map<Integer, AlphabetBusyBeaver> INSTRUCTION_RESULTS = new ConcurrentHashMap<>();
  private static final int NONHALT = -1;
  private static final int UNKNOWN = 0;
  private static final int TAPE_SIZE = 1 << 16;
  private static final int CENTER = TAPE_SIZE / 2;
  private static final long PUBLISHED_SEVEN_INSTRUCTION_HALTERS = 264_055_010L;

  private final int mSymbols;
  private final int mStates;
  private final int mInstructionLimit;
  private final boolean mExplicitHalt;
  private final int mBits;
  private final int mSymbolMask;
  private final int[] mTable;
  private final byte[] mTape = new byte[TAPE_SIZE];
  private final byte[] mSnapshot = new byte[TAPE_SIZE];
  private int mLeft = CENTER;
  private int mRight = CENTER;
  private int mMarks;
  private int mHaltSlot;
  private int mSteps;
  private int mScore;
  private long mHalters;
  private long mNonhalters;
  private long mUnresolved;

  private AlphabetBusyBeaver(final int symbols) {
    this(2, symbols, 2 * symbols, true);
  }

  private AlphabetBusyBeaver(final int states, final int symbols, final int instructions, final boolean explicitHalt) {
    mSymbols = symbols;
    mStates = states;
    mInstructionLimit = instructions;
    mExplicitHalt = explicitHalt;
    mBits = 32 - Integer.numberOfLeadingZeros(symbols - 1);
    mSymbolMask = (1 << mBits) - 1;
    mTable = new int[states * symbols];
    Arrays.fill(mTable, -1);
  }

  private boolean matches(final int from, final int to, final int shift, final int left, final int right) {
    for (int i = from; i <= to; ++i) {
      final int j = i + shift;
      final int a = i >= left && i <= right ? mSnapshot[i] : 0;
      final int b = j >= mLeft && j <= mRight ? mTape[j] : 0;
      if (a != b) {
        return false;
      }
    }
    return true;
  }

  private int simulate(final int limit, final boolean detectLoops) {
    Arrays.fill(mTape, mLeft, mRight + 1, (byte) 0);
    mLeft = CENTER;
    mRight = CENTER;
    mMarks = 0;
    int state = 0;
    int head = CENTER;
    int oldState = 0;
    int oldHead = CENTER;
    int oldLeft = CENTER;
    int oldRight = CENTER;
    int min = CENTER;
    int max = CENTER;
    int checkpoint = 1;
    mSnapshot[CENTER] = 0;
    for (int t = 0; t < limit; ++t) {
      if (head < 0 || head >= TAPE_SIZE) {
        return UNKNOWN;
      }
      mLeft = Math.min(mLeft, head);
      mRight = Math.max(mRight, head);
      final int read = mTape[head];
      final int slot = mSymbols * state + read;
      final int rule = mTable[slot];
      if (rule < 0) {
        mHaltSlot = slot;
        if (mExplicitHalt && mSymbols > 1 && read == 0) {
          ++mMarks;
        }
        return t + 1;
      }
      if (detectLoops) {
        min = Math.min(min, head);
        max = Math.max(max, head);
        if (t > 0 && state == oldState) {
          final int shift = head - oldHead;
          final int from = shift >= 0 ? min : Math.min(oldLeft, mLeft - shift);
          final int to = shift <= 0 ? max : Math.max(oldRight, mRight - shift);
          if (matches(from, to, shift, oldLeft, oldRight)) {
            return NONHALT;
          }
        }
        if (t == checkpoint) {
          oldLeft = mLeft;
          oldRight = mRight;
          System.arraycopy(mTape, oldLeft, mSnapshot, oldLeft, oldRight - oldLeft + 1);
          oldState = state;
          oldHead = head;
          min = head;
          max = head;
          checkpoint *= 2;
        }
      }
      final int write = (rule >>> 1) & mSymbolMask;
      mTape[head] = (byte) write;
      mMarks += (write == 0 ? 0 : 1) - (read == 0 ? 0 : 1);
      head += (rule & 1) == 0 ? -1 : 1;
      state = rule >>> (mBits + 1);
    }
    return UNKNOWN;
  }

  private boolean gram(final int width, final int history, final boolean lru, final int work) {
    return new GramClosure(mTable, mSymbols, width, width, history, lru, work).closes();
  }

  private boolean repeated(final int width, final int saturation, final int work) {
    return new RepeatedWords(mTable, mSymbols, width, saturation, 320, work).closes();
  }

  private int classify() {
    final int first = simulate(107, true);
    if (first != UNKNOWN || mSymbols == 1) {
      return first;
    }
    if (gram(1, 0, false, 400) || gram(2, 0, false, 800)
      || gram(3, 0, false, 400) || gram(4, 0, false, 800)) {
      return NONHALT;
    }
    final int longer = simulate(4100, true);
    if (longer != UNKNOWN) {
      return longer;
    }
    if (repeated(2, 3, 400) || gram(2, 10, true, 1000)
      || gram(2, 2, false, 3000) || gram(3, 2, false, 1600)
      || gram(2, 4, false, 600) || gram(3, 4, false, 1600)
      || gram(2, 6, false, 3200) || gram(3, 6, false, 3200)
      || gram(3, 8, false, 1600) || gram(3, 10, true, 20_000)
      || repeated(4, 2, 2000) || repeated(6, 2, 2000)
      || gram(4, 0, false, 20_000)) {
      return NONHALT;
    }
    // A timeout is unresolved, never a proof. The budget is deliberately
    // larger than necessary for all discovered halters.
    final int bounded = simulate(4_000_000, false);
    if (bounded != UNKNOWN || mExplicitHalt) {
      return bounded;
    }
    final int shifted = simulate(TAPE_SIZE, true);
    if (shifted != UNKNOWN) {
      return shifted;
    }
    // Sparse seven-instruction tables sometimes need a larger invariant
    // than the small two-state alphabet search does.
    for (int width = 1; width <= 12; ++width) {
      for (int saturation = 2; saturation <= 4; ++saturation) {
        if (new RepeatedWords(mTable, mSymbols, width, saturation, 2048, 24_000).closes()) {
          return NONHALT;
        }
      }
    }
    for (int width = 1; width <= 6; ++width) {
      for (int history = 0; history <= 10; ++history) {
        if (gram(width, history, false, 60_000)) {
          return NONHALT;
        }
      }
      if (gram(width, 10, true, 60_000)) {
        return NONHALT;
      }
    }
    return UNKNOWN;
  }

  private String machineCode() {
    int states = 1;
    int symbols = 1;
    for (int k = 0; k < mTable.length; ++k) {
      final int action = mTable[k];
      if (action >= 0) {
        states = Math.max(states, 1 + Math.max(k / mSymbols, action >>> (mBits + 1)));
        symbols = Math.max(symbols, 1 + Math.max(k % mSymbols, action >>> 1 & mSymbolMask));
      }
    }
    final StringBuilder code = new StringBuilder();
    for (int s = 0; s < states; ++s) {
      if (s > 0) {
        code.append('_');
      }
      for (int c = 0; c < symbols; ++c) {
        final int action = mTable[s * mSymbols + c];
        if (action < 0) {
          code.append("---");
        } else {
          code.append(action >>> 1 & mSymbolMask).append((action & 1) == 0 ? 'L' : 'R')
            .append((char) ('A' + (action >>> (mBits + 1))));
        }
      }
    }
    return code.toString();
  }

  private void visit(final int used, final int states, final int symbols) {
    if (used == mTable.length) {
      return; // A complete table with no halting action cannot halt.
    }
    final int result = classify();
    if (result == NONHALT) {
      ++mNonhalters;
    } else if (result == UNKNOWN) {
      if (++mUnresolved <= 32) {
        System.err.println("Unresolved machine: " + machineCode());
      }
    } else {
      ++mHalters;
      mSteps = Math.max(mSteps, mExplicitHalt ? result : result - 1);
      mScore = Math.max(mScore, mMarks);
      if (used == mInstructionLimit) {
        return;
      }
      final int hole = mHaltSlot;
      // Only first appearances matter: rename states and nonblank
      // symbols on discovery, and reflect the first move to the right.
      for (int next = 0; next < Math.min(mStates, states + 1); ++next) {
        for (int write = 0; write < Math.min(mSymbols, symbols + 1); ++write) {
          for (int dir = used == 0 ? 1 : 0; dir < 2; ++dir) {
            mTable[hole] = (next << (mBits + 1)) | (write << 1) | dir;
            visit(used + 1, Math.max(states, next + 1), Math.max(symbols, write + 1));
          }
        }
      }
      mTable[hole] = -1;
    }
  }

  /**
   * Compute both maxima for two working states and the given alphabet size.
   * @param symbols number of tape symbols, from one to four
   * @return the completed enumeration
   */
  public static AlphabetBusyBeaver compute(final int symbols) {
    if (symbols < 1 || symbols > 4) {
      throw new UnsupportedOperationException("Only one to four tape symbols supported");
    }
    return RESULTS.computeIfAbsent(symbols, n -> {
      final AlphabetBusyBeaver result = new AlphabetBusyBeaver(n);
      result.visit(0, 1, 1);
      if (result.mUnresolved != 0) {
        throw new IllegalStateException("Search did not certify both maxima");
      }
      return result;
    });
  }

  /**
   * Compute both maxima with an instruction budget and no explicit halt.
   * @param instructions maximum number of defined transitions, from zero to seven
   * @return the completed enumeration
   */
  public static AlphabetBusyBeaver instructionLimited(final int instructions) {
    return INSTRUCTION_RESULTS.computeIfAbsent(instructions, n -> instructionLimited(n, -1));
  }

  private static AlphabetBusyBeaver instructionLimited(final int instructions, final long knownHalters) {
    if (instructions < 0 || instructions > 7) {
      throw new UnsupportedOperationException("Only zero to seven instructions supported");
    }
    // Each new state or nonblank symbol first appears as the target or
    // written symbol of some instruction. The initial state and blank
    // symbol therefore give at most n+1 names of each kind.
    final AlphabetBusyBeaver result = new AlphabetBusyBeaver(instructions + 1, instructions + 1, instructions, false);
    result.visit(0, 1, 1);
    if (knownHalters >= 0 && result.mHalters != knownHalters) {
      throw new IllegalStateException("Found " + result.mHalters + " halters, expected " + knownHalters);
    }
    if (knownHalters < 0 && result.mUnresolved != 0) {
      throw new IllegalStateException(result.mUnresolved + " unresolved machines for " + instructions
        + " instructions after " + result.mHalters + " halting and " + result.mNonhalters
        + " nonhalting classifications: lower bounds " + result.mSteps + " steps, " + result.mScore + " nonblank cells");
    }
    return result;
  }

  /**
   * @return maximum number of steps, including the final step if halt is explicit
   */
  public int maximumSteps() {
    return mSteps;
  }

  /**
   * @return maximum number of nonblank cells on halting
   */
  public int maximumScore() {
    return mScore;
  }

  /**
   * Enumerate normalized two-state machines, failing on any unresolved case.
   * @param args the tape alphabet size, or --instructions budget [--published-count]
   */
  public static void main(final String[] args) {
    if ((args.length == 2 || args.length == 3) && "--instructions".equals(args[0])) {
      final int budget = Integer.parseInt(args[1]);
      final long start = System.nanoTime();
      if (args.length == 3 && (budget != 7 || !"--published-count".equals(args[2]))) {
        throw new IllegalArgumentException("The published-count replay is only available for budget seven");
      }
      final long knownHalters = args.length == 3 ? PUBLISHED_SEVEN_INSTRUCTION_HALTERS : -1;
      final AlphabetBusyBeaver result = knownHalters < 0 ? instructionLimited(budget) : instructionLimited(budget, knownHalters);
      System.out.printf(Locale.ROOT, "budget=%d halt=%d nonhalt=%d unresolved=%d steps=%d score=%d seconds=%.6f%n",
        budget, result.mHalters, result.mNonhalters, result.mUnresolved, result.mSteps, result.mScore, (System.nanoTime() - start) / 1e9);
      if (knownHalters >= 0) {
        System.out.println("Completeness uses the published halter count, not classification of every table.");
      }
      return;
    }
    if (args.length != 1) {
      throw new IllegalArgumentException("Usage: AlphabetBusyBeaver <symbols>");
    }
    final int symbols = Integer.parseInt(args[0]);
    final long start = System.nanoTime();
    final AlphabetBusyBeaver result = compute(symbols);
    System.out.printf(Locale.ROOT, "symbols=%d halt=%d nonhalt=%d unknown=%d steps=%d score=%d seconds=%.6f%n",
      symbols, result.mHalters, result.mNonhalters, result.mUnresolved, result.mSteps, result.mScore,
      (System.nanoTime() - start) / 1e9);
  }
}
