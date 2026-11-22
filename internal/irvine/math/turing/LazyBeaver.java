package irvine.math.turing;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;

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

  private LazyBeaver(final int states, final int budget, final long limit) {
    mTable = new int[2 * states];
    Arrays.fill(mTable, -1);
    mBudget = budget;
    mLimit = limit;
  }

  private void visit(final int used, final int seen) {
    if (used == mTable.length) {
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

  /**
   * Solve Lazy Beaver if the finite horizon includes a missing time.
   * @param args state count, time horizon, optional node cap
   */
  public static void main(final String[] args) {
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
