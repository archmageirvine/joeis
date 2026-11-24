package irvine.math.turing;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * Bounded reconstruction of the compressed register-machine census of Calude,
 * Dinneen and Shu (2002). The archive uses a preliminary run in which READ
 * is inert; only its halters and loops are passed to the READ interpreter.
 * @author Gregory Morse
 */
public final class CompressedRegisterMachineCensus {

  private static final int MAX_WIDTH = 12;
  private static final int STEP_LIMIT = 100;
  private static final BigInteger EMPTY = BigInteger.ZERO;
  private static final int CELL_BITS = 8;
  private static final int CELL_MASK = (1 << CELL_BITS) - 1;
  private static final int ADDRESS = 129;
  private static final BigInteger[] CELLS = new BigInteger[ADDRESS + MAX_WIDTH];
  static {
    for (int k = 0; k < CELLS.length; ++k) {
      CELLS[k] = BigInteger.valueOf(k);
    }
  }

  /** Outcomes in the final interpreter. */
  public enum Outcome {
    /** Halted after consuming exactly the supplied input. */
    HALT,
    /** Invalid execution. */
    ERROR,
    /** Repeated a state that determines control flow. */
    LOOP,
    /** Requested an additional input character. */
    OVERREAD
  }

  private final int mLimit;
  private final char[] mOp;
  private final int[] mDst;
  private final int[] mSrc;
  private final int[] mLabel;
  private final BigInteger[] mRegisters;
  private final long[] mHalts;
  private final BiConsumer<String, Outcome> mObserver;
  private int mSize;
  private int mWidth;
  private int mStatic;
  private int mLive;
  private boolean mDeep;

  private static final class State {
    private final int mPc;
    private final BigInteger[] mCells;

    private State(final int pc, final BigInteger[] cells) {
      mPc = pc;
      mCells = cells;
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof State)) {
        return false;
      }
      final State that = (State) obj;
      return mPc == that.mPc && Arrays.equals(mCells, that.mCells);
    }

    @Override
    public int hashCode() {
      return 31 * mPc + Arrays.hashCode(mCells);
    }
  }

  private CompressedRegisterMachineCensus(final int limit, final BiConsumer<String, Outcome> observer) {
    if (limit < 1 || limit > MAX_WIDTH) {
      throw new IllegalArgumentException("Unsupported census width: " + limit);
    }
    mLimit = limit;
    mOp = new char[limit];
    mDst = new int[limit];
    mSrc = new int[limit];
    mLabel = new int[limit];
    mRegisters = new BigInteger[limit];
    mHalts = new long[limit + 1];
    mObserver = observer;
  }

  /**
   * Enumerate halting strings by total length in seven-bit characters.
   * @param limit maximum number of characters
   * @return counts indexed by length, with an unused zero-th entry
   */
  public static long[] count(final int limit) {
    return count(limit, null);
  }

  /**
   * Enumerate with an optional observer for archive comparisons.
   * @param limit maximum number of characters
   * @param observer receives encoded strings and outcomes
   * @return counts indexed by length
   */
  public static long[] count(final int limit, final BiConsumer<String, Outcome> observer) {
    final CompressedRegisterMachineCensus census = new CompressedRegisterMachineCensus(limit, observer);
    census.generate(0, -1, 0, 0, 0);
    return census.mHalts;
  }

  private static boolean preload(final char op) {
    return op == '&' || op == '(';
  }

  private static boolean readsControl(final char op) {
    return op == '=' || op == '#' || op == '@';
  }

  // The canonical-name frontier and the archive's leading register-copy
  // restriction are lexical rules; neither depends on a census total.
  private boolean admissible(final int size, final int leading) {
    boolean leadingCopy = false;
    int seen = 0;
    for (int i = 0; i < size; ++i) {
      final char op = mOp[i];
      if (leadingCopy && op != '/') {
        return false;
      }
      if (i < leading && mSrc[i] < 0) {
        leadingCopy = true;
      }
      if ((op == '=' || op == '#') && mSrc[i] < 0) {
        return false;
      }
      if (op == '/' || op == '?') {
        continue;
      }
      final int dst = mDst[i];
      final int src = ~mSrc[i];
      final int before = seen;
      if (dst > seen) {
        return false;
      }
      seen = Math.max(seen, dst + 1);
      if (src >= 0) {
        if (src > seen) {
          return false;
        }
        if (preload(op) && before != 0 && dst == before && src <= dst) {
          seen = before;
        } else {
          seen = Math.max(seen, src + 1);
        }
      }
    }
    return true;
  }

  private void extend(final int leading, final int target, final int size, final int width,
                      final char op, final int dst, final int src, final int label, final int length, final int names) {
    final int nextWidth = width + length;
    final int nextLeading = leading == size && preload(op) ? leading + 1 : leading;
    final int nextTarget = Math.max(label, target);
    if (nextWidth >= mLimit || nextTarget > size + mLimit - nextWidth - nextLeading) {
      return;
    }
    mOp[size] = op;
    mDst[size] = dst;
    mSrc[size] = src;
    mLabel[size] = label;
    generate(nextLeading, nextTarget, size + 1, nextWidth, names);
  }

  private void generate(final int leading, final int target, final int size, final int width, final int names) {
    if (target <= size - leading && admissible(size, leading)) {
      mOp[size] = '%';
      mSize = size + 1;
      mWidth = width + 1;
      mStatic = leading;
      mLive = 0;
      for (int k = 0; k < size; ++k) {
        if (readsControl(mOp[k])) {
          mLive |= 1 << mDst[k];
        }
      }
      if (mLive != 0) {
        markDependencies(size);
      }
      Arrays.fill(mRegisters, EMPTY);
      if (execute(0, 0, 0, 0, true, mRegisters) != Outcome.ERROR) {
        Arrays.fill(mRegisters, EMPTY);
        execute(0, 0, 0, 0, false, mRegisters);
      }
    }
    if (width + 1 == mLimit) {
      return;
    }
    extend(leading, target, size, width, '/', 0, 0, -1, 1, names);
    if (width + 2 == mLimit) {
      return;
    }
    final int top = size + mLimit - width - 2 - leading;
    for (int label = 0; label <= top; ++label) {
      extend(leading, target, size, width, '?', 0, 0, label, label < 10 ? 2 : 3, names);
    }
    for (int r = 0; r <= names; ++r) {
      final int nextNames = Math.max(names, r + 1);
      extend(leading, target, size, width, '!', r, 0, -1, 2, nextNames);
      extend(leading, target, size, width, ')', r, 0, -1, 2, nextNames);
      extend(leading, target, size, width, '@', r, 0, -1, 2, nextNames);
      if (width + 4 >= mLimit) {
        continue;
      }
      for (int label = 0; label <= top - 2; ++label) {
        extend(leading, target, size, width, '^', r, 0, label, label < 10 ? 4 : 5, nextNames);
      }
      final int maxConstant = width + 6 < mLimit ? 127 : width + 5 < mLimit ? 99 : 9;
      for (int x = -nextNames - 1; x <= maxConstant; ++x) {
        final int newerNames = x < 0 ? Math.max(nextNames, -x) : nextNames;
        final int length = x < 10 ? 4 : x < 100 ? 5 : 6;
        extend(leading, target, size, width, '&', r, x, -1, length, newerNames);
        extend(leading, target, size, width, '(', r, x, -1, length, newerNames);
        for (int label = 0; label <= top - length; ++label) {
          final int compareLength = length + (label < 10 ? 2 : 3);
          extend(leading, target, size, width, '=', r, x, label, compareLength, newerNames);
          extend(leading, target, size, width, '#', r, x, label, compareLength, newerNames);
        }
      }
    }
  }

  private void markDependencies(final int size) {
    int before;
    do {
      before = mLive;
      for (int i = 0; i < size; ++i) {
        if (preload(mOp[i]) && mSrc[i] < 0 && (mLive & (1 << mDst[i])) != 0) {
          mLive |= 1 << ~mSrc[i];
        }
      }
    } while (mLive != before);
    // Otherwise the top cell of each live register determines all its
    // future top cells and control decisions, even if a stack grows.
    mDeep = false;
    for (int i = 0; i < size; ++i) {
      if (popsLiveRegister(i)) {
        mDeep = true;
        return;
      }
    }
  }

  private boolean popsLiveRegister(final int i) {
    return mOp[i] == ')' && (mLive & (1 << mDst[i])) != 0
      || mOp[i] == '(' && mSrc[i] < 0 && ~mSrc[i] != mDst[i] && (mLive & (1 << ~mSrc[i])) != 0;
  }

  private State state(final int pc, final BigInteger[] regs, final boolean exact) {
    final BigInteger[] cells = new BigInteger[Integer.bitCount(mLive)];
    int j = 0;
    for (int bits = mLive; bits != 0; bits &= bits - 1) {
      final BigInteger value = regs[Integer.numberOfTrailingZeros(bits)];
      cells[j++] = exact ? value : CELLS[value.intValue() & CELL_MASK];
    }
    return new State(pc, cells);
  }

  private Outcome record(final Outcome outcome, final int used, final int input, final boolean legacy) {
    if (!legacy && mObserver != null) {
      mObserver.accept(encoded(used, input), outcome);
    }
    return outcome;
  }

  private String encoded(final int used, final int input) {
    final StringBuilder word = new StringBuilder(mWidth + used);
    for (int i = 0; i < mSize; ++i) {
      final char op = mOp[i];
      word.append(op);
      if (op == '/' || op == '%') {
        continue;
      }
      if (op == '?') {
        word.append(mLabel[i]);
        continue;
      }
      word.append((char) ('a' + mDst[i]));
      if (preload(op) || op == '=' || op == '#') {
        word.append(',');
        final int s = mSrc[i];
        if (s < 0) {
          word.append((char) ('a' + ~s));
        } else {
          word.append(s);
        }
      }
      if (op == '^' || op == '=' || op == '#') {
        word.append(',').append(mLabel[i]);
      }
    }
    for (int i = used - 1; i >= 0; --i) {
      word.append((input >>> i) & 1);
    }
    return word.toString();
  }

  private Outcome execute(int pc, final int used, final int input, int steps, final boolean legacy, final BigInteger[] regs) {
    int visited = 0;
    Set<State> seen = null;
    Set<State> visible = null;
    while (pc >= 0 && pc < mSize) {
      final int bit = 1 << pc;
      if ((visited & bit) != 0) {
        return record(Outcome.LOOP, used, input, legacy);
      }
      // Repeating a program counter without inspecting a register or
      // consuming input proves a cycle, even when a register grows.
      visited = readsControl(mOp[pc]) ? 0 : visited | bit;
      if (mLive != 0 && steps >= 12) {
        if (seen == null) {
          seen = new HashSet<>();
        }
        if (!seen.add(state(pc, regs, mDeep))) {
          return record(Outcome.LOOP, used, input, legacy);
        }
        if (mDeep) {
          if (visible == null) {
            visible = new HashSet<>();
          }
          // A top-cell cycle is sufficient if this segment did not expose
          // any deeper cell of a live register. Start a new segment after a pop.
          if (!visible.add(state(pc, regs, false))) {
            return record(Outcome.LOOP, used, input, legacy);
          }
          if (popsLiveRegister(pc)) {
            visible.clear();
          }
        }
      }
      // An unclassified run is an error, not evidence of nonhalting.
      if (steps++ == STEP_LIMIT) {
        throw new UnsupportedOperationException("Unclassified program " + encoded(used, input));
      }
      final int i = pc++;
      final int dst = mDst[i];
      final int src = mSrc[i];
      switch (mOp[i]) {
        case '%':
          if (!legacy) {
            ++mHalts[mWidth + used];
          }
          return record(Outcome.HALT, used, input, legacy);
        case '/':
          break;
        case '?':
          pc = mStatic + mLabel[i];
          break;
        case '!':
          if (!legacy) {
            record(Outcome.OVERREAD, used, input, false);
            if (mWidth + used < mLimit) {
              // An overread is extended by both possible data bits. There
              // is no bound based on the number of static READ instructions.
              final BigInteger[] zero = regs.clone();
              zero[dst] = CELLS[1];
              execute(pc, used + 1, input << 1, steps, false, zero);
              regs[dst] = CELLS[2];
              execute(pc, used + 1, (input << 1) | 1, steps, false, regs);
            }
            return Outcome.OVERREAD;
          }
          break;
        case '^':
          regs[dst] = CELLS[ADDRESS + pc - mStatic];
          pc = mStatic + mLabel[i];
          break;
        case '@':
          final int address = regs[dst].intValue() & CELL_MASK;
          if (address < ADDRESS) {
            return record(Outcome.ERROR, used, input, legacy);
          }
          pc = mStatic + address - ADDRESS;
          break;
        case ')':
          regs[dst] = regs[dst].shiftRight(CELL_BITS);
          break;
        case '&':
          regs[dst] = src < 0 ? regs[~src] : src == 0 ? EMPTY : CELLS[1 + src];
          break;
        case '(':
          if (src >= 0) {
            regs[dst] = regs[dst].shiftLeft(CELL_BITS).add(CELLS[1 + src]);
          } else if (~src != dst) {
            final int cell = regs[~src].intValue() & CELL_MASK;
            if (cell != 0) {
              regs[dst] = regs[dst].shiftLeft(CELL_BITS).add(CELLS[cell]);
              regs[~src] = regs[~src].shiftRight(CELL_BITS);
            }
          }
          break;
        case '=':
        case '#':
          final int cell = regs[dst].intValue() & CELL_MASK;
          if (cell >= ADDRESS && mOp[i] == '=') {
            return record(Outcome.ERROR, used, input, legacy);
          }
          final boolean equal = cell == 0 ? legacy && src == 0 : cell == src + 1;
          if (equal == (mOp[i] == '=')) {
            pc = mStatic + mLabel[i];
          }
          break;
        default:
          throw new IllegalStateException("Unknown instruction: " + mOp[i]);
      }
    }
    return record(Outcome.ERROR, used, input, legacy);
  }
}
