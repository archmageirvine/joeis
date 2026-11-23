package irvine.math.turing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Finite-horizon proof of attainable halting times in tree normal form.
 * @author Gregory Morse
 */
public final class LazyBeaver {
  private final int[] mTable;
  private final BitSet mTimes = new BitSet();
  private final BusyBeaver.Simulator mSimulator = new BusyBeaver.Simulator(false);
  private final int mBudget;
  private final long mLimit;
  private long mVisited;
  private boolean mCapped;
  private BitSet mContinuedTimes;
  private boolean mStopAtHorizon;
  private List<Branch> mFrontier;

  private static final class Branch {
    private final int[] mTable;
    private final int mSeen;

    private Branch(final int[] table, final int seen) {
      mTable = table.clone();
      mSeen = seen;
    }
  }

  private static final int SPLIT_DEPTH = 5;

  private LazyBeaver(final int states, final int budget, final long limit) {
    mTable = new int[2 * states];
    Arrays.fill(mTable, -1);
    mBudget = budget;
    mLimit = limit;
  }

  private void visit(final int used, final int seen) {
    if (used == mTable.length || mStopAtHorizon && mTimes.get(mBudget)) {
      return;
    }
    if (used == SPLIT_DEPTH && mFrontier != null) {
      mFrontier.add(new Branch(mTable, seen));
      return;
    }
    if (mVisited == mLimit) {
      mCapped = true;
      return;
    }
    if (++mVisited % 100_000_000 == 0) {
      System.out.println("visited=" + mVisited + " provisionalGap=" + mTimes.nextClearBit(1));
    }
    final int result = mSimulator.run(mTable, mBudget, true);
    // Unlike a Busy Beaver maximum, nonhalting need not be decided:
    // a branch that has not halted by the horizon supplies no time here.
    if (result <= 0) {
      return;
    }
    mTimes.set(result);
    if (mContinuedTimes != null && result >= mBudget / 2 && result + 1 < mBudget) {
      // The extra state can extend some witnesses by more than one step.
      for (int direction = -1; direction <= 1; direction += 2) {
        final int symbol = mSimulator.symbolNearHalt(direction);
        for (int k = 1; k < mBudget - result; ++k) {
          if (mSimulator.symbolNearHalt((k + 1) * direction) != symbol) {
            mContinuedTimes.set(result + k + 1);
            break;
          }
        }
      }
    }
    if (result == mBudget) {
      return; // The next undefined action cannot be reached any earlier.
    }
    final int hole = mSimulator.haltSlot();
    for (int next = 0; next < Math.min(mTable.length / 2, seen + 1) && !mCapped; ++next) {
      for (int action = used == 0 ? 1 : 0; action < 4 && !mCapped; ++action) {
        if (used != 0 || (action & 1) != 0) {
          mTable[hole] = 4 * next + action;
          visit(used + 1, Math.max(seen, next + 1));
        }
      }
    }
    mTable[hole] = -1;
  }

  private static int parallel(final int states, final int horizon, final int workers)
      throws InterruptedException, ExecutionException {
    final LazyBeaver root = new LazyBeaver(states, horizon, Long.MAX_VALUE);
    root.mFrontier = new ArrayList<>();
    root.visit(0, 1);
    final AtomicInteger next = new AtomicInteger();
    final var pool = Executors.newFixedThreadPool(workers);
    final List<Future<LazyBeaver>> jobs = new ArrayList<>();
    try {
      for (int worker = 0; worker < workers; ++worker) {
        jobs.add(pool.submit(() -> {
          final LazyBeaver search = new LazyBeaver(states, horizon, Long.MAX_VALUE);
          for (int k; (k = next.getAndIncrement()) < root.mFrontier.size();) {
            final Branch branch = root.mFrontier.get(k);
            System.arraycopy(branch.mTable, 0, search.mTable, 0, branch.mTable.length);
            search.visit(SPLIT_DEPTH, branch.mSeen);
          }
          return search;
        }));
      }
      for (final Future<LazyBeaver> job : jobs) {
        final LazyBeaver search = job.get();
        root.mTimes.or(search.mTimes);
        root.mVisited = Math.addExact(root.mVisited, search.mVisited);
        root.mCapped |= search.mCapped;
      }
    } finally {
      pool.shutdownNow();
    }
    final int missing = root.mTimes.nextClearBit(1);
    if (root.mCapped || missing > horizon) {
      throw new IllegalStateException("Finite proof did not close");
    }
    System.out.printf(Locale.ROOT, "states=%d branches=%d visited=%d firstMissing=%d%n",
      states, root.mFrontier.size(), root.mVisited, missing);
    return missing;
  }

  private static void leastStates(final int horizon) {
    final int[] known = new int[horizon + 1];
    final BitSet continued = new BitSet();
    for (int states = 1; states <= 5; ++states) {
      final long start = System.nanoTime();
      final LazyBeaver proof = new LazyBeaver(states, horizon, Long.MAX_VALUE);
      if (states == 5) {
        proof.mContinuedTimes = continued;
      }
      proof.visit(0, 1);
      if (proof.mCapped) {
        throw new IllegalStateException("Finite proof did not close");
      }
      for (int n = proof.mTimes.nextSetBit(1); n >= 0; n = proof.mTimes.nextSetBit(n + 1)) {
        if (known[n] == 0) {
          known[n] = states;
        }
      }
      System.err.printf(Locale.ROOT, "states=%d visited=%d seconds=%.6f%n",
        states, proof.mVisited, (System.nanoTime() - start) / 1e9);
    }
    for (int n = 1; n <= horizon; ++n) {
      int states = known[n];
      if (states == 0) {
        // The complete searches above exclude at most five states.
        // A fresh initial state can spend one step writing blank;
        // a fresh final state can scan out of a monochromatic run.
        states = 6;
        if (known[n - 1] == 0 && !continued.get(n)) {
          System.err.println("Searching for a longer witness at time " + n);
          final LazyBeaver witness = new LazyBeaver(states, n, Long.MAX_VALUE);
          witness.mStopAtHorizon = true;
          witness.visit(0, 1);
          if (!witness.mTimes.get(n)) {
            throw new UnsupportedOperationException("Time " + n + " requires more than six states");
          }
        }
      }
      System.out.println(n + " " + states);
    }
  }

  /**
   * Solve Lazy Beaver if the finite horizon includes a missing time.
   * @param args state count, time horizon, optional node cap; or --parallel states horizon workers
   * @throws InterruptedException if a parallel check is interrupted
   * @throws ExecutionException if a parallel check fails
   */
  public static void main(final String[] args) throws InterruptedException, ExecutionException {
    if (args.length == 4 && "--parallel".equals(args[0])) {
      final int states = Integer.parseInt(args[1]);
      final int horizon = Integer.parseInt(args[2]);
      final int workers = Integer.parseInt(args[3]);
      if (states < 1 || states > 6 || horizon < 1 || horizon > 32_768 || workers < 1 || workers > 64) {
        throw new IllegalArgumentException("Invalid finite search bounds");
      }
      parallel(states, horizon, workers);
      return;
    }
    if (args.length == 2 && "--least-states".equals(args[0])) {
      final int horizon = Integer.parseInt(args[1]);
      if (horizon < 1 || horizon > 32_768) {
        throw new IllegalArgumentException("Invalid finite search horizon");
      }
      leastStates(horizon);
      return;
    }
    if (args.length < 2 || args.length > 3) {
      throw new IllegalArgumentException("Usage: LazyBeaver <states> <time-horizon> [node-cap]");
    }
    final int states = Integer.parseInt(args[0]);
    final int horizon = Integer.parseInt(args[1]);
    final long cap = args.length == 3 ? Long.parseLong(args[2]) : Long.MAX_VALUE;
    if (states < 1 || states > 6 || horizon < 1 || horizon > 32_768 || cap < 1) {
      throw new IllegalArgumentException("Invalid finite search bounds");
    }
    final long start = System.nanoTime();
    final LazyBeaver proof = new LazyBeaver(states, horizon, cap);
    proof.visit(0, 1);
    final int missing = proof.mTimes.nextClearBit(1);
    System.out.printf(Locale.ROOT, "n=%d horizon=%d visited=%d absentCandidate=%d capped=%b seconds=%.6f%n",
      states, horizon, proof.mVisited, missing, proof.mCapped, (System.nanoTime() - start) / 1e9);
    if (proof.mCapped || missing > horizon) {
      throw new IllegalStateException("Finite proof did not close");
    }
  }
}
