package irvine.math.turing;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Enumerate reduced, ordered FRACTRAN programs by their prime-exponent columns.
 * @author Gregory Morse
 */
public final class FractranCensus {

  private static final int RULES = 10;
  private static final int PRIMES = 11;
  private static final int LIMIT = 400;
  private static final int NONHALTING = -1;
  private static final int UNRESOLVED = -2;
  private static final PrintWriter OUT = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8), 1 << 17));

  private FractranCensus() {
  }

  private static int exponent(final long column, final int rule) {
    return (int) ((column >>> (6 * rule)) << 58 >> 58);
  }

  private static final class Columns {
    private long[] mCodes = new long[16];
    private long[] mDominance = new long[16];
    private int[] mFlags = new int[16];
    private int mSize;

    private void add(final long code, final long dominance, final int flags) {
      if (mSize == mCodes.length) {
        mCodes = Arrays.copyOf(mCodes, mSize * 2);
        mDominance = Arrays.copyOf(mDominance, mSize * 2);
        mFlags = Arrays.copyOf(mFlags, mSize * 2);
      }
      mCodes[mSize] = code;
      mDominance[mSize] = dominance;
      mFlags[mSize++] = flags;
    }
  }

  private static final class Result {
    private long mHalts;
    private long mLoops;
    private long mReduced;
    private long mUnresolved;
    private int mMaximum;
    private String mWitness = "()";

    private void merge(final Result r) {
      mHalts += r.mHalts;
      mLoops += r.mLoops;
      mReduced += r.mReduced;
      mUnresolved += r.mUnresolved;
      if (r.mMaximum > mMaximum) {
        mMaximum = r.mMaximum;
        mWitness = r.mWitness;
      }
    }
  }

  private static final class Sweep {
    private final int mSize;
    private final int mRules;
    private final int mBudget;
    private final int mFull;
    private final Columns mOther = new Columns();
    private final Columns mInitial = new Columns();

    private Sweep(final int size, final int rules) {
      mSize = size;
      mRules = rules;
      mBudget = size - rules;
      mFull = (1 << rules) - 1;
      for (int mass = 1; mass <= mBudget; ++mass) {
        vectors(0, mass, mass, 0, 0, 0, false);
      }
    }

    private void vectors(final int j, final int rest, final int mass, final long prefix,
                         final int negative, final int unit, final boolean positive) {
      if (j == mRules) {
        if (rest == 0 && (unit != 0 || mass < mBudget && positive && negative != 0)) {
          long dominates = 0;
          int at = 0;
          for (int later = 1; later < mRules; ++later) {
            final int b = Math.min(0, exponent(prefix, later));
            for (int first = 0; first < later; ++first) {
              if (Math.min(0, exponent(prefix, first)) >= b) {
                dominates |= 1L << at;
              }
              ++at;
            }
          }
          if (unit != 0) {
            mInitial.add(prefix, dominates, (mass << RULES) | negative);
          }
          if (mass < mBudget && positive && negative != 0) {
            mOther.add(prefix, dominates, (mass << RULES) | negative);
          }
        }
        return;
      }
      final int bit = 1 << j;
      for (int x = -rest; x <= rest; x += j + 1 == mRules && rest > 0 ? 2 * rest : 1) {
        vectors(j + 1, rest - Math.abs(x), mass, prefix | ((long) (x & 63) << (6 * j)),
          x < 0 ? negative | bit : negative, x == -1 ? unit | bit : unit, positive || x > 0);
      }
    }

    private final class Worker {
      private final Result mResult = new Result();
      private final long[] mTable = new long[PRIMES];
      private final int[][] mMove = new int[RULES][PRIMES];
      private final int[] mDemand = new int[RULES];
      private final int[][] mHistory = new int[LIMIT + 1][PRIMES];
      private final int[] mPrevious = new int[RULES];
      private final int[] mPenultimate = new int[RULES];
      private final int[] mActions = new int[LIMIT + 1];
      private final int[] mState = new int[PRIMES];

      private String table(final int width) {
        final StringBuilder s = new StringBuilder("(");
        for (int j = 0; j < mRules; ++j) {
          s.append('(');
          for (int i = 0; i < width; ++i) {
            s.append(exponent(mTable[i], j)).append(',');
          }
          s.append("),");
        }
        return s.append(')').toString();
      }

      private boolean repeats(final int from, final int to, final int width) {
        if (from < 0) {
          return false;
        }
        int fixed = 0;
        for (int i = 0; i < width; ++i) {
          if (mState[i] < mHistory[from][i]) {
            return false;
          }
          if (mState[i] == mHistory[from][i]) {
            fixed |= 1 << i;
          }
        }
        if (fixed == (1 << width) - 1) {
          return true;
        }
        // Each earlier rule stays disabled in a coordinate whose drift
        // is zero. The selected rule stays enabled by nonnegative drift.
        for (int k = from; k < to; ++k) {
          for (int j = 0; j < mActions[k]; ++j) {
            boolean blocked = false;
            for (int a = fixed & mDemand[j]; a != 0; a &= a - 1) {
              final int i = Integer.numberOfTrailingZeros(a);
              if (mHistory[k][i] + mMove[j][i] < 0) {
                blocked = true;
                break;
              }
            }
            if (!blocked) {
              return false;
            }
          }
        }
        return true;
      }

      private int runtime(final int width) {
        for (int j = 0; j < mRules; ++j) {
          int negative = 0;
          for (int i = 0; i < width; ++i) {
            final int d = exponent(mTable[i], j);
            mMove[j][i] = d;
            if (d < 0) {
              negative |= 1 << i;
            }
          }
          mDemand[j] = negative;
          mPrevious[j] = -1;
          mPenultimate[j] = -1;
        }
        Arrays.fill(mState, 0, width, 0);
        mState[0] = 1;
        for (int t = 0; t <= LIMIT; ++t) {
          int j = 0;
          for (; j < mRules; ++j) {
            int a = mDemand[j];
            for (; a != 0; a &= a - 1) {
              final int i = Integer.numberOfTrailingZeros(a);
              if (mState[i] + mMove[j][i] < 0) {
                break;
              }
            }
            if (a == 0) {
              break;
            }
          }
          if (j == mRules) {
            return t;
          }
          if (t >= 7 && (repeats(mPrevious[j], t, width) || repeats(mPenultimate[j], t, width))) {
            return NONHALTING;
          }
          System.arraycopy(mState, 0, mHistory[t], 0, width);
          mActions[t] = j;
          mPenultimate[j] = mPrevious[j];
          mPrevious[j] = t;
          for (int i = 0; i < width; ++i) {
            mState[i] += mMove[j][i];
          }
        }
        return UNRESOLVED;
      }

      private void enumerate(final int width, final int missing, final int enabled, final int rest,
                             final int first, final long dominates) {
        if (enabled == 0 || missing != 0 && Integer.bitCount(missing) + 1 > rest) {
          return;
        }
        if (rest == 0) {
          if (dominates != 0) {
            // An earlier denominator divides a later one. Removing
            // the inert rule strictly reduces cost without changing the run.
            ++mResult.mReduced;
            return;
          }
          final int t = runtime(width);
          if (t == NONHALTING) {
            ++mResult.mLoops;
          } else if (t == UNRESOLVED) {
            ++mResult.mUnresolved;
            OUT.println("unresolved " + mSize + ' ' + table(width));
          } else {
            ++mResult.mHalts;
            if (t > mResult.mMaximum) {
              mResult.mMaximum = t;
              mResult.mWitness = table(width);
            }
          }
        } else if (rest >= 2) {
          for (int i = first; i < mOther.mSize; ++i) {
            final int f = mOther.mFlags[i];
            final int weight = f >>> RULES;
            if (weight > rest) {
              break;
            }
            if ((enabled & ~f) != 0) {
              mTable[width] = mOther.mCodes[i];
              enumerate(width + 1, missing & ~f, enabled & ~f, rest - weight, i, dominates & mOther.mDominance[i]);
            }
          }
        }
      }

      private void visit(final int i) {
        final long initial = mInitial.mCodes[i];
        final int flags = mInitial.mFlags[i];
        int units = 0;
        for (int r = 0; r < mRules; ++r) {
          if (exponent(initial, r) == -1) {
            units |= 1 << r;
          }
        }
        mTable[0] = initial;
        enumerate(1, mFull & ~flags, units, mBudget - (flags >>> RULES), 0, mInitial.mDominance[i]);
      }
    }

    private void run(final int index, final int stride, final int workers) throws InterruptedException, ExecutionException {
      final AtomicInteger next = new AtomicInteger(index);
      final ForkJoinPool pool = new ForkJoinPool(workers);
      final Result total = new Result();
      try {
        final Result[] completed = pool.submit(() -> IntStream.range(0, workers).parallel().mapToObj(worker -> {
          final Worker run = new Worker();
          for (int i; (i = next.getAndAdd(stride)) < mInitial.mSize;) {
            run.visit(i);
          }
          return run.mResult;
        }).toArray(Result[]::new)).get();
        for (final Result result : completed) {
          total.merge(result);
        }
      } finally {
        pool.shutdown();
      }
      OUT.println("size=" + mSize + " halt=" + total.mHalts + " infinite=" + total.mLoops + " unresolved=" + total.mUnresolved
        + " reduced=" + total.mReduced + " maximum=" + total.mMaximum + " roots=" + mInitial.mSize + " witness=" + total.mWitness);
      OUT.flush();
      if (OUT.checkError()) {
        throw new IllegalStateException("Could not write the complete census report");
      }
    }
  }

  /**
   * Compute one exact cost and rule class, optionally split by root index.
   * @param args size, rule count, workers, and optional shard index and count
   * @throws InterruptedException if the census is stopped
   * @throws ExecutionException if a worker fails
   */
  public static void main(final String[] args) throws InterruptedException, ExecutionException {
    if (args.length != 3 && args.length != 5) {
      throw new IllegalArgumentException("Expected size, rules, workers, and optional shard index and count");
    }
    final int size = Integer.parseInt(args[0]);
    final int rules = Integer.parseInt(args[1]);
    final int workers = Integer.parseInt(args[2]);
    final int index = args.length == 5 ? Integer.parseInt(args[3]) : 0;
    final int stride = args.length == 5 ? Integer.parseInt(args[4]) : 1;
    if (size < 2 || size > 21 || rules < 1 || rules > size / 2 || workers < 1 || index < 0 || index >= stride) {
      throw new IllegalArgumentException("Invalid census bounds");
    }
    new Sweep(size, rules).run(index, stride, workers);
  }
}
