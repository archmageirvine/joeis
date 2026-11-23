package irvine.math.turing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Exact finite-snake census; undecided words are not counted as infinite.
 * @author Gregory Morse
 */
public final class SnakeTally {

  private static final int[] DX = {0, 1, 0, -1};
  private static final int[] DY = {1, 0, -1, 0};
  private static final int SHORT_SPAN = 32;
  private static final int ROUNDS = 1024;
  private static final int INFINITE = -1;
  private static final int UNRESOLVED = 0;
  private static final int ABSENT = Integer.MIN_VALUE;
  private static final long LOW_BITS = 0x5555555555555555L;

  // Proof inputs: the exceptional census word IDs certified non-halting by
  // the affine replay. These are not cached sequence values.
  private static final List<Set<Integer>> SMALL_HOLDOUTS = List.of(
    Set.of(),
    Set.of(),
    Set.of(),
    Set.of(),
    Set.of(57),
    Set.of(),
    Set.of(57, 228, 705, 912, 937, 1017),
    Set.of(3986, 3992),
    Set.of(3709, 3805, 3829, 14649),
    Set.of(8089, 14233, 15257, 27441, 44932, 48658, 48664, 61028, 63889),
    Set.of(11233, 12166, 14565, 28401, 31229, 31613, 31709, 31733, 35809,
      43972, 44193, 44577, 44673, 44818, 44824, 44932, 45702, 47238,
      47622, 48202, 48226, 48232, 48658, 48664, 77553, 90089, 96233,
      97769, 111025, 112321, 112353, 120809, 122345, 128489, 134113, 142276,
      142497, 142881, 142977, 143122, 143128, 143236, 166852, 176772, 178308,
      178692, 182802, 182808, 188946, 188952, 190482, 190488, 192801, 192897,
      206413, 206736, 209553, 211089, 216742, 219113, 220649, 226793, 234393,
      236690, 236696, 238665, 249828, 251369)
  );
  private static final Map<Integer, Result> SMALL = new ConcurrentHashMap<>();
  private static final int CACHE_OFFSET = 11;
  // Use the uncached census plus the complete holdout audit to regenerate.
  private static final long[] CACHED_COUNTS = {61803, 276650, 1219508, 5309179, 22868295, 97663066, 414156146, 1746439048};
  private static final String[] ATTAINING_WORDS = {
    "URUURUUULLD", "URUULLDUDDDD", "URRRLLDLRRULL", "URRURRRLDLRULL",
    "UDDRULUUUULLULD", "URRURRRLDDLRUULL", "URRRDLULUUUUULURL", "UDDDRULULLULLUULDU",
  };

  private final int[] mWord;
  private final int[] mX;
  private final int[] mY;
  private final boolean[] mMoves;
  private final int[] mStartsX = new int[ROUNDS];
  private final int[] mStartsY = new int[ROUNDS];
  private final Map<Long, Integer> mOutside = new HashMap<>();
  private final int[] mStamp = new int[1 << 16];
  private final int[] mEntered = new int[mStamp.length];
  private int mEpoch;
  private int mVisited;
  private int mXmin;
  private int mXmax;
  private int mYmin;
  private int mYmax;

  private SnakeTally(final int period) {
    mWord = new int[period];
    mX = new int[period * ROUNDS];
    mY = new int[mX.length];
    mMoves = new boolean[mX.length];
  }

  private static long cell(final int x, final int y) {
    return (long) x << 32 | y & 0xFFFFFFFFL;
  }

  private static boolean inGrid(final int x, final int y) {
    return ((x + 128 | y + 128) & ~255) == 0;
  }

  private static int index(final int x, final int y) {
    return (x + 128) << 8 | (y + 128);
  }

  private int entered(final int x, final int y) {
    if (inGrid(x, y)) {
      final int i = index(x, y);
      return mStamp[i] == mEpoch ? mEntered[i] : ABSENT;
    }
    return mOutside.getOrDefault(cell(x, y), ABSENT);
  }

  private boolean enter(final int x, final int y, final int time) {
    if (inGrid(x, y)) {
      final int i = index(x, y);
      if (mStamp[i] == mEpoch) {
        return false;
      }
      mStamp[i] = mEpoch;
      mEntered[i] = time;
    } else if (mOutside.putIfAbsent(cell(x, y), time) != null) {
      return false;
    }
    ++mVisited;
    return true;
  }

  // Repeat the observed segment shifted by d. An accepted target may
  // not intersect the existing path or an earlier translated segment:
  // both kinds of intersection would put an existing cell on its +d ray.
  // A rejected target needs an earlier blocker within its copy, or a
  // blocker from some previous copy. In the latter case, verify each
  // intervening point on the ray until a blocker in the segment is found.
  private boolean repeats(final int rounds, final int end, final int x, final int y) {
    final int startRound = end - rounds;
    final int dx = x - mStartsX[startRound % ROUNDS];
    final int dy = y - mStartsY[startRound % ROUNDS];
    if (dx == 0 && dy == 0) {
      return false;
    }
    final int start = startRound * mWord.length;
    for (int step = start; step < end * mWord.length; ++step) {
      final int i = step % mX.length;
      if (mMoves[i]) {
        for (int u = mX[i] + dx, v = mY[i] + dy;
             u >= mXmin && u <= mXmax && v >= mYmin && v <= mYmax; u += dx, v += dy) {
          if (entered(u, v) != ABSENT) {
            return false;
          }
        }
      } else if (entered(mX[i], mY[i]) < start) {
        for (int u = mX[i] + dx, v = mY[i] + dy;; u += dx, v += dy) {
          final int time = entered(u, v);
          if (time == ABSENT) {
            return false;
          }
          if (time >= start) {
            break;
          }
        }
      }
    }
    return true;
  }

  private int length(final int limit) {
    mOutside.clear();
    if (++mEpoch == 0) {
      Arrays.fill(mStamp, 0);
      mEpoch = 1;
    }
    mVisited = 0;
    enter(0, 0, -1);
    mXmin = 0;
    mXmax = 0;
    mYmin = 0;
    mYmax = 0;
    int x = 0;
    int y = 0;
    for (int round = 0; round < limit; ++round) {
      mStartsX[round % ROUNDS] = x;
      mStartsY[round % ROUNDS] = y;
      final int before = mVisited;
      for (int j = 0; j < mWord.length; ++j) {
        final int step = round * mWord.length + j;
        final int i = step % mX.length;
        final int d = mWord[j];
        mX[i] = x + DX[d];
        mY[i] = y + DY[d];
        mMoves[i] = enter(mX[i], mY[i], step);
        if (mMoves[i]) {
          x = mX[i];
          y = mY[i];
          mXmin = Math.min(mXmin, x);
          mXmax = Math.max(mXmax, x);
          mYmin = Math.min(mYmin, y);
          mYmax = Math.max(mYmax, y);
        }
      }
      if (mVisited == before) {
        return before;
      }
      final int widest = (round & 7) == 7 ? SHORT_SPAN : 4;
      for (int span = 1; span <= round + 1 && span <= widest; ++span) {
        if (repeats(span, round + 1, x, y)) {
          return INFINITE;
        }
      }
    }
    for (int span = SHORT_SPAN + 1; span <= Math.min(limit, ROUNDS); ++span) {
      if (repeats(span, limit, x, y)) {
        return INFINITE;
      }
    }
    return UNRESOLVED;
  }

  private static final class Result {
    private long mFinite;
    private long mPeriodic;
    private long mUnknown;
    private int mLongest;
    private long mChampion;

    private void add(final Result row) {
      mFinite += row.mFinite;
      mPeriodic += row.mPeriodic;
      mUnknown += row.mUnknown;
      if (row.mLongest > mLongest || row.mLongest == mLongest && row.mChampion < mChampion) {
        mLongest = row.mLongest;
        mChampion = row.mChampion;
      }
    }
  }

  private void search(final int limit, final long first, final long bound, final Result out,
                      final boolean listUnknown, final Set<Integer> certified) {
    for (long k = first; k < bound; ++k) {
      final long lo = k & LOW_BITS;
      final long hi = (k >>> 1) & LOW_BITS;
      if ((lo & ~hi) == 0 || (hi & ~lo) == 0 || (lo & hi) == 0
        || ((k >>> Long.numberOfTrailingZeros(lo)) & 3) != 1) {
        continue;
      }
      // Rotate the first direction to north and the first horizontal
      // direction to east. A missing direction cannot make a trap.
      for (int j = 1; j < mWord.length; ++j) {
        mWord[j] = (int) (k >>> (2 * (j - 1))) & 3;
      }
      final int len = length(limit);
      if (len == INFINITE) {
        ++out.mPeriodic;
      } else if (len == UNRESOLVED) {
        if (certified != null && !certified.contains((int) k)) {
          throw new IllegalStateException("Uncertified snake: " + word(mWord.length, k));
        }
        ++out.mUnknown;
        if (listUnknown) {
          System.out.println("unknown " + k + " " + word(mWord.length, k));
        }
      } else {
        ++out.mFinite;
        if (len > out.mLongest || len == out.mLongest && k < out.mChampion) {
          out.mLongest = len;
          out.mChampion = k;
        }
      }
    }
  }

  private static String word(final int period, final long k) {
    final StringBuilder word = new StringBuilder(period).append('U');
    for (int j = 1; j < period; ++j) {
      word.append("URDL".charAt((int) (k >>> (2 * (j - 1))) & 3));
    }
    return word.toString();
  }

  private static Result small(final int n) {
    if (n < 1 || n >= CACHE_OFFSET) {
      throw new IllegalArgumentException();
    }
    return SMALL.computeIfAbsent(n, period -> {
      final Result tally = new Result();
      final Set<Integer> certified = SMALL_HOLDOUTS.get(period);
      new SnakeTally(period).search(7500, 0, 1L << (2 * (period - 1)), tally, false, certified);
      if (tally.mUnknown != certified.size()) {
        throw new IllegalStateException("Incomplete proof roster at period " + period);
      }
      return tally;
    });
  }

  private static int checkedIndex(final int n) {
    final int index = n - CACHE_OFFSET;
    if (index >= CACHED_COUNTS.length || index >= ATTAINING_WORDS.length) {
      throw new UnsupportedOperationException("No fully certified census at period " + n);
    }
    return index;
  }

  /**
   * Count trapping words up to square symmetries.
   * @param n instruction period
   * @return number of trapping words
   */
  public static long count(final int n) {
    return n < CACHE_OFFSET ? small(n).mFinite : CACHED_COUNTS[checkedIndex(n)];
  }

  /**
   * Find the finite maximum.
   * @param n instruction period
   * @return largest number of occupied squares
   */
  public static long maximum(final int n) {
    if (n < CACHE_OFFSET) {
      return small(n).mLongest;
    }
    final String word = ATTAINING_WORDS[checkedIndex(n)];
    final SnakeTally replay = new SnakeTally(n);
    for (int k = 0; k < n; ++k) {
      replay.mWord[k] = "URDL".indexOf(word.charAt(k));
    }
    final int length = replay.length(7500);
    if (length < 1) {
      throw new IllegalStateException("Attaining word did not trap at period " + n);
    }
    return length;
  }

  /**
   * Run the uncached census (including unresolved word IDs if requested).
   * @param args period rounds workers [finite count or -1] [first end] [list]
   */
  public static void main(final String[] args) throws InterruptedException, ExecutionException {
    final int period = Integer.parseInt(args[0]);
    final int limit = Integer.parseInt(args[1]);
    final int workers = args.length > 2 ? Integer.parseInt(args[2]) : 1;
    final long knownFinite = args.length > 3 ? Long.parseLong(args[3]) : -1;
    if (period < 1 || period > 18 || limit < 1 || limit > 100_000 || workers < 1 || workers > 64
      || args.length == 5 || args.length > 7 || args.length == 7 && !"list".equals(args[6])) {
      throw new IllegalArgumentException();
    }
    final long total = 1L << (2 * (period - 1));
    final long first = args.length >= 6 ? Long.parseLong(args[4]) : 0;
    final long end = args.length >= 6 ? Long.parseLong(args[5]) : total;
    final boolean listUnknown = args.length == 7;
    if (first < 0 || end <= first || end > total) {
      throw new IllegalArgumentException("Invalid disjoint word range");
    }
    final AtomicLong next = new AtomicLong(first);
    final long span = 1L << 15;
    final var pool = Executors.newFixedThreadPool(workers);
    final List<Future<Result>> jobs = new ArrayList<>();
    final Result result = new Result();
    try {
      for (int t = 0; t < workers; ++t) {
        jobs.add(pool.submit(() -> {
          final SnakeTally search = new SnakeTally(period);
          final Result row = new Result();
          for (long k; (k = next.getAndAdd(span)) < end;) {
            search.search(limit, k, Math.min(k + span, end), row, listUnknown, null);
          }
          return row;
        }));
      }
      for (final Future<Result> job : jobs) {
        result.add(job.get());
      }
    } finally {
      pool.shutdownNow();
    }
    System.out.printf("period=%d first=%d end=%d finite=%d periodic=%d unknown=%d max=%d witness=%s%n",
      period, first, end, result.mFinite, result.mPeriodic, result.mUnknown, result.mLongest, word(period, result.mChampion));
    if (knownFinite >= 0 && result.mFinite != knownFinite) {
      throw new IllegalStateException("Finite count differs from the supplied census");
    }
  }
}
