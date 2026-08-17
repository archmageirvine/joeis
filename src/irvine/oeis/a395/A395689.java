package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395689 allocated for Chris Segroves.
 * @author Sean A. Irvine
 */
public class A395689 extends Sequence1 {

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads", String.valueOf(Runtime.getRuntime().availableProcessors())));
  private static final int SPLIT_DEPTH = 4;
  private int mN;
  private long mFull;

  private static class State {
    private final int mK;
    private final long[] mRow;
    private final long[] mCol;

    State(final int k, final long[] row, final long[] col) {
      mK = k;
      mRow = row;
      mCol = col;
    }
  }

  /**
   * Generate independent subtrees.
   * @param k current cell
   * @param depth number of cells assigned
   * @param row row masks
   * @param col column masks
   * @param states list of states
   */
  private void split(final int k, final int depth, final long[] row, final long[] col, final ArrayList<State> states) {
    int kk = k;
    // Skip diagonal cells
    while (kk < mN * mN) {
      final int i = kk / mN;
      final int j = kk % mN;
      if (i != j) {
        break;
      }
      ++kk;
    }
    if (kk == mN * mN || depth == SPLIT_DEPTH) {
      states.add(new State(kk, row.clone(), col.clone()));
      return;
    }
    final int i = kk / mN;
    final int j = kk % mN;
    long available = mFull & ~(row[i] | col[j]);
    while (available != 0) {
      final long bit = available & -available;
      available -= bit;
      row[i] |= bit;
      col[j] |= bit;
      split(kk + 1, depth + 1, row, col, states);
      row[i] ^= bit;
      col[j] ^= bit;
    }
  }

  /**
   * Sequential backtracking search.
   * @param k current cell
   * @param row row masks
   * @param col column masks
   * @return number of completions
   */
  private long count(int k, final long[] row, final long[] col) {
    // Skip fixed diagonal cells.
    while (k < mN * mN) {
      final int i = k / mN;
      final int j = k % mN;
      if (i != j) {
        break;
      }
      ++k;
    }

    if (k == mN * mN) {
      return 1;
    }

    final int i = k / mN;
    final int j = k % mN;

    long available = mFull & ~(row[i] | col[j]);
    long total = 0;
    while (available != 0) {
      final long bit = available & -available;
      available -= bit;
      row[i] |= bit;
      col[j] |= bit;
      total += count(k + 1, row, col);
      row[i] ^= bit;
      col[j] ^= bit;
    }
    return total;
  }

  @Override
  public Z next() {
    if (++mN >= 63) {
      throw new UnsupportedOperationException();
    }
    mFull = (1L << mN) - 1;
    final long[] row = new long[mN];
    final long[] col = new long[mN];
    // Idempotence: L[i][i] = i
    for (int i = 0; i < mN; ++i) {
      final long bit = 1L << i;
      row[i] = bit;
      col[i] = bit;
    }
    // For small n the number of branches is too small to make parallelization worthwhile
    if (mN < 5) {
      return Z.valueOf(count(0, row, col));
    }
    // Parallel search
    final ArrayList<State> states = new ArrayList<>();
    split(0, 0, row, col, states);
    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
    try {
      final List<Future<Long>> futures = new ArrayList<>(states.size());
      for (final State state : states) {
        futures.add(executor.submit(() ->
          count(state.mK, state.mRow, state.mCol)));
      }
      Z total = Z.ZERO;
      for (final Future<Long> future : futures) {
        try {
          total = total.add(future.get());
        } catch (final InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        } catch (final ExecutionException e) {
          throw new RuntimeException(e.getCause());
        }
      }
      return total;
    } finally {
      executor.shutdown();
    }
  }
}
