package irvine.math.turing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/**
 * Recomputes the step and score Busy Beaver numbers for up to five states.
 * @author Gregory Morse
 */
public final class BusyBeaver {

  private BusyBeaver() {
  }
  private static final int NONHALT = -1;
  private static final int UNKNOWN = 0;
  private static final int WIDTH = 1 << 17;
  private static final int CENTER = WIDTH / 2;

  private static int[] parse(final String name) {
    final String code = name.replace("_", "");
    if (code.isEmpty() || code.length() % 6 != 0 || code.length() > 30) {
      throw new IllegalArgumentException(name);
    }
    final int[] table = new int[code.length() / 3];
    for (int i = 0; i < table.length; ++i) {
      final int at = 3 * i;
      if (code.startsWith("---", at)) {
        table[i] = -1;
      } else {
        final int write = code.charAt(at) - '0';
        final char dir = code.charAt(at + 1);
        final char next = code.charAt(at + 2);
        if (write < 0 || write > 1 || (dir != 'L' && dir != 'R')
          || (next != 'Z' && (next < 'A' || next >= 'A' + table.length / 2))) {
          throw new IllegalArgumentException(name);
        }
        table[i] = next == 'Z' ? -2 - write : 4 * (next - 'A') + 2 * write + (dir == 'R' ? 1 : 0);
      }
    }
    return table;
  }

  private static long tableKey(final int[] table) {
    long code = 1;
    for (final int rule : table) {
      code = code << 5 | Math.max(0, rule + 1);
    }
    return code;
  }

  private static final class Hint {
    private final String mMethod;
    private final int[] mArgs;
    private final int[][] mLeft;
    private final int[][] mRight;

    private Hint(final String label, final String[] fields) {
      final String[] parts = label.split("_params_", 2);
      mMethod = parts[0];
      mArgs = parts.length == 2 ? Arrays.stream(parts[1].split("_")).mapToInt(Integer::parseInt).toArray() : new int[0];
      mLeft = fields.length >= 3 ? rows(fields[2]) : null;
      mRight = fields.length >= 4 ? rows(fields[3]) : null;
    }

    private static int[][] rows(final String text) {
      return Arrays.stream(text.split(";")).map(row -> Arrays.stream(row.split(":"))
        .mapToInt(Integer::parseInt).toArray()).toArray(int[][]::new);
    }

    private int check(final Simulator sim, final int[] table) {
      final boolean closed;
      switch (mMethod) {
        case "REPWL":
          closed = new RepeatedWords(table, mArgs[0], mArgs[1], mArgs[2], mArgs[3]).closes();
          break;
        case "NGRAM_CPS_IMPL1":
          closed = new GramClosure(table, mArgs[1], mArgs[2], mArgs[0], false, Math.min(50_000, mArgs[3])).closes();
          break;
        case "NGRAM_CPS_IMPL2":
        case "NGRAM_CPS_LRU":
          final boolean lru = "NGRAM_CPS_LRU".equals(mMethod);
          final int budget = mArgs[0] > 16 && !lru ? 150_000 : 50_000;
          closed = new GramClosure(table, mArgs[0], mArgs[1], lru ? 10 : 0, lru, Math.min(budget, mArgs[2])).closes();
          break;
        case "FAR_certificates":
          closed = mLeft != null && (FiniteAutomata.closes(table, mLeft, false) || FiniteAutomata.closes(table, mLeft, true));
          break;
        case "WFAR_certificates":
          boolean weighted = false;
          for (final int cutoff : new int[] {mArgs[0], 2 * mArgs[0], 4 * mArgs[0], 8 * mArgs[0]}) {
            if (mLeft != null && mRight != null && WeightedAutomata.closes(table, mLeft, mRight, cutoff)) {
              weighted = true;
              break;
            }
          }
          closed = weighted;
          break;
        case "HALT_DECIDER_47176870":
          return sim.run(table, 50_000_000, false);
        case "LOOP1":
          final int loop = sim.run(table, 1_050_000, true);
          return loop == UNKNOWN && LateLoop.closes(table, 1_050_000) ? NONHALT : loop;
        case "SPORADIC_MACHINES":
          return FinnedMachines.closes(table) || FibonacciCounter.closes(table) || ShiftOverflow.closes(table)
            || SkeletOne.closes(table) || SkeletSeventeen.closes(table) ? NONHALT : UNKNOWN;
        default:
          return UNKNOWN;
      }
      return closed ? NONHALT : UNKNOWN;
    }
  }

  private static Map<Long, Hint> loadHints(final Path path) throws IOException {
    final Map<Long, Hint> hints = new HashMap<>();
    try (BufferedReader input = new BufferedReader(new InputStreamReader(
      new GZIPInputStream(Files.newInputStream(path)), StandardCharsets.US_ASCII))) {
      for (String line; (line = input.readLine()) != null;) {
        final String[] fields = line.split(",", -1);
        if (fields.length < 2 || hints.size() >= 10_000) {
          throw new IllegalArgumentException("Malformed or oversized hints");
        }
        if (hints.put(tableKey(parse(fields[0])), new Hint(fields[1], fields)) != null) {
          throw new IllegalArgumentException("Duplicate machine hint: " + fields[0]);
        }
      }
    }
    return hints;
  }

  static final class Simulator {
    private final byte[] mTape = new byte[WIDTH];
    private final byte[] mPrevious = new byte[WIDTH];
    private int mLeft = CENTER;
    private int mRight = CENTER;
    private int mOnes;
    private int mHaltSlot;
    private final boolean mRepwl;
    private Map<Long, Hint> mHints = Map.of();
    private final HistoryGram[] mHistory;
    Simulator(final boolean wide) {
      final int radius = wide ? 5 : 4;
      mRepwl = !wide;
      mNgrams = new NGram[radius + 1];
      for (int r = 1; r <= radius; ++r) {
        mNgrams[r] = new NGram(r);
      }
      mHistory = wide ? new HistoryGram[] {
        new HistoryGram(1, 1), new HistoryGram(2, 1), new HistoryGram(2, 2), new HistoryGram(3, 2),
        new HistoryGram(2, 3), new HistoryGram(2, 4), new HistoryGram(3, 3), new HistoryGram(3, 4),
        new HistoryGram(2, 4, true), new HistoryGram(3, 4, true)
      } : new HistoryGram[] {
        new HistoryGram(1, 1), new HistoryGram(2, 1), new HistoryGram(2, 2), new HistoryGram(3, 2)
      };
    }

    private final NGram[] mNgrams;

    private boolean noHaltReachable(final int[] table) {
      int todo = 1;
      int done = 0;
      while (todo != 0) {
        final int bit = Integer.lowestOneBit(todo);
        final int state = Integer.numberOfTrailingZeros(bit);
        final int a = table[2 * state];
        final int b = table[2 * state + 1];
        if (a < 0 || b < 0) {
          return false;
        }
        done |= bit;
        todo = (todo | 1 << (a >>> 2) | 1 << (b >>> 2)) & ~done;
      }
      return true;
    }

    private boolean matches(final int from, final int to, final int shift, final int oldLeft, final int oldRight) {
      // Compare exact symbols, not hashes; the stored support is blank outside its interval.
      for (int i = from; i <= to; ++i) {
        final int j = i + shift;
        final int old = i >= oldLeft && i <= oldRight ? mPrevious[i] : 0;
        final int now = j >= mLeft && j <= mRight ? mTape[j] : 0;
        if (old != now) {
          return false;
        }
      }
      return true;
    }

    int haltSlot() {
      return mHaltSlot;
    }

    int run(final int[] table, final int limit, final boolean loopCheck) {
      Arrays.fill(mTape, mLeft, mRight + 1, (byte) 0);
      mLeft = CENTER;
      mRight = CENTER;
      mOnes = 0;
      mHaltSlot = -1;
      if (loopCheck && noHaltReachable(table)) {
        return NONHALT;
      }
      int position = CENTER;
      int state = 0;
      int savedState = 0;
      int savedHead = CENTER;
      int oldLeft = CENTER;
      int oldRight = CENTER;
      mPrevious[CENTER] = 0;
      int min = CENTER;
      int max = CENTER;
      int checkpoint = 1;
      for (int step = 0; step < limit; ++step) {
        if (position < 0 || position >= WIDTH) {
          return UNKNOWN;
        }
        mLeft = Math.min(mLeft, position);
        mRight = Math.max(mRight, position);
        final int read = mTape[position];
        final int slot = 2 * state + read;
        final int rule = table[slot];
        if (rule < 0) {
          mHaltSlot = slot;
          // The released TNF data completes an undefined halt with write-one.
          mOnes += (rule == -2 ? 0 : 1) - read;
          return step + 1;
        }
        if (loopCheck) {
          min = Math.min(min, position);
          max = Math.max(max, position);
          if (step != 0 && state == savedState) {
            final int shift = position - savedHead;
            // The repeated segment can only inspect the chosen interval or half-line.
            final int from = shift >= 0 ? min : Math.min(oldLeft, mLeft - shift);
            final int to = shift <= 0 ? max : Math.max(oldRight, mRight - shift);
            if (matches(from, to, shift, oldLeft, oldRight)) {
              return NONHALT;
            }
          }
          if (step == checkpoint) {
            oldLeft = mLeft;
            oldRight = mRight;
            System.arraycopy(mTape, mLeft, mPrevious, mLeft, mRight - mLeft + 1);
            savedHead = position;
            savedState = state;
            min = position;
            max = position;
            checkpoint = checkpoint <= Integer.MAX_VALUE / 2 ? checkpoint * 2 : Integer.MAX_VALUE;
          }
        }
        final int write = rule >>> 1 & 1;
        mTape[position] = (byte) write;
        mOnes += write - read;
        position += (rule & 1) == 0 ? -1 : 1;
        state = rule >>> 2;
      }
      return UNKNOWN;
    }

    private int classify(final int[] table, final int limit) {
      final int outcome = run(table, limit, true);
      if (outcome != UNKNOWN) {
        return outcome;
      }
      for (int r = 1; r < mNgrams.length; ++r) {
        if (mNgrams[r].closes(table, 3200)) {
          return NONHALT;
        }
      }
      for (final HistoryGram gram : mHistory) {
        if (gram.closes(table, 3200)) {
          return NONHALT;
        }
      }
      if (!mHints.isEmpty()) {
        final int extended = run(table, 4100, true);
        if (extended != UNKNOWN) {
          return extended;
        }
        final Hint hint = mHints.get(tableKey(table));
        if (hint != null) {
          final int result = hint.check(this, table);
          if (result != UNKNOWN) {
            return result;
          }
        }
        for (int len = 4; len <= 8; len += 2) {
          for (int r = 2; r <= 3; ++r) {
            if (new GramClosure(table, r, r, len, false, 3600).closes()) {
              return NONHALT;
            }
          }
        }
        if (normalizedNonhalt(table)) {
          return NONHALT;
        }
        if (hint == null) {
          final int late = run(table, 20_000, true);
          if (late != UNKNOWN) {
            return late;
          }
          for (int r = 2; r <= 6; ++r) {
            for (int len = 0; len <= 10; len += 2) {
              if (new GramClosure(table, r, r, len, false, 30_000).closes()) {
                return NONHALT;
              }
            }
            if (new GramClosure(table, r, r, 10, true, 30_000).closes()) {
              return NONHALT;
            }
          }
          for (int width = 1; width <= 8; ++width) {
            for (int sat = 2; sat <= 3; ++sat) {
              if (new RepeatedWords(table, width, sat, 320, 8000).closes()) {
                return NONHALT;
              }
            }
          }
        }
      }
      if (mRepwl && table.length == 8) {
        for (int len = 4; len <= 10; len += 2) {
          for (int radius = 2; radius <= (len == 10 ? 4 : 3); ++radius) {
            if (new GramClosure(table, radius, radius, len, false, 25_000).closes()) {
              return NONHALT;
            }
          }
        }
        if (new GramClosure(table, 2, 2, 10, true, 25_000).closes()) {
          return NONHALT;
        }
      }
      if (mRepwl && new RepeatedWords(table, 4, 3, 320, 8000).closes()) {
        return NONHALT;
      }
      return UNKNOWN;
    }

    /** Skip a finite blank-preserving prefix, then rename and optionally reflect. */
    private boolean normalizedNonhalt(final int[] table) {
      int s = 0;
      for (int skipped = 0; skipped < table.length / 2; ++skipped) {
        final int rule = table[s * 2];
        if (rule < 0) {
          return false;
        }
        if ((rule & 2) != 0) {
          if (skipped == 0) {
            return false;
          }
          final int[] order = new int[table.length / 2];
          order[0] = s;
          return renamedNonhalt(table, order, 1, 1 << s, 1 ^ (rule & 1));
        }
        s = rule >>> 2;
      }
      return false;
    }

    private boolean renamedNonhalt(final int[] table, final int[] order, final int pos, final int used, final int mirror) {
      if (pos == order.length) {
        final int[] name = new int[pos];
        for (int i = 0; i < pos; ++i) {
          name[order[i]] = i;
        }
        final int[] renamed = new int[table.length];
        for (int i = 0; i < pos; ++i) {
          for (int bit = 0; bit <= 1; ++bit) {
            final int rule = table[2 * order[i] + bit];
            renamed[2 * i + bit] = rule < 0 ? rule : 4 * name[rule >>> 2] + ((rule & 3) ^ mirror);
          }
        }
        final Hint hint = mHints.get(tableKey(renamed));
        return hint != null && hint.check(this, renamed) == NONHALT;
      }
      for (int i = 0; i < order.length; ++i) {
        if ((used & 1 << i) == 0) {
          order[pos] = i;
          if (renamedNonhalt(table, order, pos + 1, used | 1 << i, mirror)) {
            return true;
          }
        }
      }
      return false;
    }
  }

  /**
   * The same closure check on an augmented tape, recording the last one or two
   * (state, read-symbol) pairs at each cell. Projection to the low bit
   * recovers exactly the original Turing machine.
   */
  private static final class HistoryGram {
    private static final int SYMBOL_BITS = 15;
    private static final int SYMBOL_MASK = (1 << SYMBOL_BITS) - 1;
    private final boolean mLru;
    private final int mHistoryModulus;
    private final long mMask;
    private final long mPrefix;

    private HistoryGram(final int radius, final int length) {
      this(radius, length, false);
    }

    private HistoryGram(final int radius, final int length, final boolean lru) {
      this.mLru = lru;
      int modulus = 1;
      for (int k = 0; k < length; ++k) {
        modulus *= 11;
      }
      mHistoryModulus = modulus;
      mMask = (1L << (SYMBOL_BITS * radius)) - 1;
      mPrefix = mMask >>> SYMBOL_BITS;
    }

    private int history(final int old, final int token) {
      if (!mLru) {
        return (11 * old + token) % mHistoryModulus;
      }
      // Move the current transition to the front of a bounded recency list.
      int tail = old;
      int result = token;
      for (int place = 11; tail != 0 && place < mHistoryModulus; tail /= 11) {
        final int item = tail % 11;
        if (item != token) {
          result += place * item;
          place *= 11;
        }
      }
      return result;
    }

    private static final class Context {
      private final long mLeft;
      private final long mRight;
      private final int mMiddleState;

      private Context(final long left, final long right, final int middleState) {
        this.mLeft = left;
        this.mRight = right;
        this.mMiddleState = middleState;
      }

      @Override
      public int hashCode() {
        return (31 * Long.hashCode(mLeft) + Long.hashCode(mRight)) * 31 + mMiddleState;
      }

      @Override
      public boolean equals(final Object obj) {
        if (!(obj instanceof Context)) {
          return false;
        }
        final Context c = (Context) obj;
        return mLeft == c.mLeft && mRight == c.mRight && mMiddleState == c.mMiddleState;
      }
    }

    private boolean addGram(final Map<Long, List<Long>> grams, final long word) {
      final List<Long> match = grams.computeIfAbsent(word & mPrefix, unused -> new ArrayList<>());
      if (match.contains(word)) {
        return false;
      }
      match.add(word);
      return true;
    }

    private boolean closes(final int[] table, final int budget) {
      final Map<Long, List<Long>> leftGrams = new HashMap<>();
      final Map<Long, List<Long>> rightGrams = new HashMap<>();
      addGram(leftGrams, 0);
      addGram(rightGrams, 0);
      final List<Context> contexts = new ArrayList<>();
      final Set<Context> seen = new HashSet<>();
      final Context initial = new Context(0, 0, 0);
      contexts.add(initial);
      seen.add(initial);
      int work = 0;
      while (true) {
        boolean changed = false;
        for (int k = 0; k < contexts.size(); ++k) {
          if (++work > budget) {
            return false;
          }
          final Context c = contexts.get(k);
          final int middle = c.mMiddleState & SYMBOL_MASK;
          final int slot = (c.mMiddleState >>> SYMBOL_BITS) * 2 + (middle & 1);
          final int rule = table[slot];
          if (rule < 0) {
            return false;
          }
          final int write = 2 * history(middle >>> 1, slot + 1) + (rule >>> 1 & 1);
          final int next = rule >>> 2;
          final boolean moveRight = (rule & 1) != 0;
          final long source = moveRight ? c.mRight : c.mLeft;
          final long destination = moveRight ? c.mLeft : c.mRight;
          changed |= addGram(moveRight ? leftGrams : rightGrams, destination);
          final long pushed = ((destination << SYMBOL_BITS) | write) & mMask;
          final List<Long> pops = (moveRight ? rightGrams : leftGrams).get(source >>> SYMBOL_BITS);
          if (pops != null) {
            for (final long pop : pops) {
              final Context successor = new Context(moveRight ? pushed : pop, moveRight ? pop : pushed,
                (next << SYMBOL_BITS) | ((int) source & SYMBOL_MASK));
              if (seen.add(successor)) {
                contexts.add(successor);
              }
            }
          }
        }
        if (!changed) {
          return true;
        }
      }
    }
  }

  /** Binary NGramCPS (Algorithm 2 of the BB(5) paper), without tape histories. */
  private static final class NGram {
    private final int mRadius;
    private final int mMask;
    private final int mFar;
    private final int[] mSeen;
    private final int[] mList;
    private int mGeneration;

    private NGram(final int r) {
      mRadius = r;
      mMask = (1 << r) - 1;
      mFar = 1 << (r - 1);
      mSeen = new int[10 << (2 * r)];
      mList = new int[mSeen.length];
    }

    private int key(final int slot, final int left, final int right) {
      return (slot << (2 * mRadius)) | (left << mRadius) | right;
    }

    private boolean closes(final int[] table, final int budget) {
      if (++mGeneration == 0) {
        Arrays.fill(mSeen, 0);
        ++mGeneration;
      }
      mSeen[0] = mGeneration;
      mList[0] = 0;
      int size = 1;
      long leftGrams = 1;
      long rightGrams = 1;
      int work = 0;
      while (true) {
        final long oldLeftGrams = leftGrams;
        final long oldRightGrams = rightGrams;
        for (int i = 0; i < size; ++i) {
          if (++work > budget) {
            return false;
          }
          final int context = mList[i];
          final int left = context >>> mRadius & mMask;
          final int right = context & mMask;
          final int rule = table[context >>> (2 * mRadius)];
          if (rule < 0) {
            return false;
          }
          final int write = rule >>> 1 & 1;
          final int next = (rule >>> 2) * 2;
          if ((rule & 1) != 0) {
            leftGrams |= 1L << left;
            final int push = ((left << 1) | write) & mMask;
            for (int pop = right >>> 1; pop <= (right >>> 1) + mFar; pop += mFar) {
              if ((rightGrams & (1L << pop)) != 0) {
                final int candidate = key(next | (right & 1), push, pop);
                if (mSeen[candidate] != mGeneration) {
                  mSeen[candidate] = mGeneration;
                  mList[size++] = candidate;
                }
              }
            }
          } else {
            rightGrams |= 1L << right;
            final int push = ((right << 1) | write) & mMask;
            for (int pop = left >>> 1; pop <= (left >>> 1) + mFar; pop += mFar) {
              if ((leftGrams & (1L << pop)) != 0) {
                final int candidate = key(next | (left & 1), pop, push);
                if (mSeen[candidate] != mGeneration) {
                  mSeen[candidate] = mGeneration;
                  mList[size++] = candidate;
                }
              }
            }
          }
        }
        if (leftGrams == oldLeftGrams && rightGrams == oldRightGrams) {
          return true;
        }
      }
    }
  }

  private static final class Counters {
    private long mHalt;
    private long mNonhalt;
    private long mUnknown;
    private int mSteps;
    private int mScore;

    private void record(final int result, final int ones) {
      if (result > 0) {
        ++mHalt;
        mSteps = Math.max(mSteps, result);
        mScore = Math.max(mScore, ones);
      } else if (result == NONHALT) {
        ++mNonhalt;
      } else {
        ++mUnknown;
      }
    }

    private long total() {
      return mHalt + mNonhalt + mUnknown;
    }

    @Override
    public String toString() {
      return String.format(Locale.ROOT,
        "rows=%d halt=%d nonhalt=%d unknown=%d maxSteps=%d maxScore=%d",
        total(), mHalt, mNonhalt, mUnknown, mSteps, mScore);
    }
  }

  private static final class Tree {
    private final Simulator mSimulator;
    private final Counters mCounts = new Counters();
    private final int mLimit;
    private final long mNodes;
    private final int[] mTable;
    private final long[][] mWeights;
    private final List<String> mExamples = new ArrayList<>();
    private final BusyBeaverWitnesses mWitnesses = new BusyBeaverWitnesses();
    private boolean mCapped;
    private long mLabeledHalters;
    private long mLabeledTotalSteps;
    private int mBlankMaximum;

    private Tree(final Simulator simulator, final int states, final int limit, final long nodes) {
      this.mSimulator = simulator;
      this.mLimit = limit;
      this.mNodes = nodes;
      mTable = new int[2 * states];
      Arrays.fill(mTable, -1);
      mWeights = new long[mTable.length][states + 1];
      long completions = 1;
      for (int used = mTable.length - 1; used >= 0; --used) {
        // At the first hit of the missing rule, there are four possible
        // halting actions. The unused slots may be filled arbitrarily.
        // Undo the first-move reflection and the order-of-discovery names.
        long weight = (used == 0 ? 4 : 8) * completions;
        for (int seen = 1; seen <= states; ++seen) {
          mWeights[used][seen] = weight;
          weight *= states - seen;
        }
        completions *= 4 * states + 4;
      }
    }

    private void visit(final int used, final int seen) {
      if (used == mTable.length) {
        // Match the reference convention: omit leaves with no undefined rule.
        return;
      }
      if (mCounts.total() >= mNodes) {
        mCapped = true;
        return;
      }
      final int result = mSimulator.classify(mTable, mLimit);
      mCounts.record(result, mSimulator.mOnes);
      if (result == UNKNOWN && mExamples.size() < 24) {
        mExamples.add(BusyBeaverWitnesses.format(mTable, -1, false));
      }
      if (result > 0) {
        final long weight = mWeights[used][seen];
        mLabeledHalters = Math.addExact(mLabeledHalters, weight);
        mLabeledTotalSteps = Math.addExact(mLabeledTotalSteps, Math.multiplyExact(weight, result));
        if (mSimulator.mOnes == 1) {
          // The recorded halt writes a 1. Clearing that cell would leave
          // an entirely blank tape exactly when that is the only 1.
          mBlankMaximum = Math.max(mBlankMaximum, result);
        }
        final int slot = mSimulator.mHaltSlot;
        mWitnesses.record(mTable, result, mSimulator.mOnes, slot);
        for (int next = 0; next < Math.min(mTable.length / 2, seen + 1) && !mCapped; ++next) {
          for (int write = 0; write < 2 && !mCapped; ++write) {
            for (int d = used == 0 ? 1 : 0; d < 2 && !mCapped; ++d) {
              mTable[slot] = 4 * next + 2 * write + d;
              visit(used + 1, Math.max(seen, next + 1));
            }
          }
        }
        mTable[slot] = -1;
      }
    }

  }


  /**
   * Traverse the tree of normalized machines and report the two maxima.
   * @param args state count (1..5), followed for five states by the certificate file
   * @throws IOException if the certificate file cannot be read
   */
  public static void main(final String[] args) throws IOException {
    if (args.length < 1 || args.length > 2) {
      throw new IllegalArgumentException("Usage: BusyBeaver <states> [certificate-file]");
    }
    final int states = Integer.parseInt(args[0]);
    if (states < 1 || states > 5 || args.length != (states == 5 ? 2 : 1)) {
      throw new IllegalArgumentException("Use a state count of 1..5 and supply certificates only for five states");
    }
    final long start = System.nanoTime();
    final Simulator simulator = new Simulator(states == 5);
    if (states == 5) {
      simulator.mHints = loadHints(Path.of(args[1]));
    }
    final Tree tree = new Tree(simulator, states, 512, 190_000_000L);
    tree.visit(0, 1);
    if (tree.mCapped || tree.mCounts.mUnknown != 0) {
      throw new IllegalStateException("Incomplete enumeration: " + tree.mCounts + " " + tree.mExamples);
    }
    System.out.printf(Locale.ROOT, "n=%d %s labeledHalters=%d labeledTotalSteps=%d blankMaximum=%d seconds=%.6f%n",
      states, tree.mCounts, tree.mLabeledHalters, tree.mLabeledTotalSteps, tree.mBlankMaximum, (System.nanoTime() - start) / 1e9);
    tree.mWitnesses.print();
  }
}
