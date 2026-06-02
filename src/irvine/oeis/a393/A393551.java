package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393551 T(n,k) is the number of distinct enforceable unique-solution shadings in an n X k Hitori puzzle up to rotation and reflection, read by rows.
 * @author Sean A. Irvine (Java port)
 */
public class A393551 extends Sequence1 {

  // Port of Douglas Boffey's C++ implementation: https://oeis.org/A393551/a393551.cc.txt

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads",
    String.valueOf(Runtime.getRuntime().availableProcessors())));
  private int mX = 0;
  private int mY = 0;

  private List<Integer> mRowStates;
  private List<List<Integer>> mNextRows;
  private int[] mFlipped;

  private static boolean bitSet(final int bitmap, final int bit) {
    return (bitmap & (1 << bit)) != 0;
  }

  private static int setBit(final int bitmap, final int bit) {
    return bitmap | (1 << bit);
  }

  private static int clearBit(final int bitmap, final int bit) {
    return bitmap & ~(1 << bit);
  }

  private static boolean independent(final int m) {
    return (m & (m << 1)) == 0;
  }

  private void buildRowStates() {
    mRowStates = new ArrayList<>();
    final int lim = 1 << mX;
    for (int m = 0; m < lim; ++m) {
      if (independent(m)) {
        mRowStates.add(m);
      }
    }
    mNextRows = new ArrayList<>();
    for (int i = 0; i < mRowStates.size(); ++i) {
      final List<Integer> nxt = new ArrayList<>();
      for (int j = 0; j < mRowStates.size(); ++j) {
        if ((mRowStates.get(i) & mRowStates.get(j)) == 0) {
          nxt.add(j);
        }
      }
      mNextRows.add(nxt);
    }
  }

  private void initFlipped() {
    final int lim = 1 << mX;
    mFlipped = new int[lim];
    for (int i = 0; i < lim; ++i) {
      int r = 0;
      for (int j = 0; j < mX; ++j) {
        if (bitSet(i, j)) {
          r |= 1 << (mX - j - 1);
        }
      }
      mFlipped[i] = r;
    }
  }

  private boolean connectedUnshaded(final int[] grid) {
    final int h = grid.length;
    final int mask = (1 << mX) - 1;

    // Find first unshaded cell
    int sr = -1;
    int sc = -1;
    for (int r = 0; r < h; ++r) {
      final int unshaded = (~grid[r]) & mask;
      if (unshaded != 0) {
        sr = r;
        sc = Integer.numberOfTrailingZeros(unshaded);
        break;
      }
    }

    if (sr < 0) {
      return false;
    }

    // visited rows as bitmasks
    final int[] vis = new int[h];
    vis[sr] = 1 << sc;

    boolean changed;
    do {
      changed = false;
      for (int r = 0; r < h; ++r) {
        final int v = vis[r];
        if (v == 0) {
          continue;
        }
        final int allowed = (~grid[r]) & mask;
        // horizontal expansion
        int expand = v;
        expand |= (expand << 1) & mask;
        expand |= expand >>> 1;
        expand &= allowed;
        if ((expand & ~vis[r]) != 0) {
          vis[r] |= expand;
          changed = true;
        }
        // vertical expansion
        if (r > 0) {
          final int up = vis[r] & ((~grid[r - 1]) & mask);
          if ((up & ~vis[r - 1]) != 0) {
            vis[r - 1] |= up;
            changed = true;
          }
        }

        if (r + 1 < h) {
          final int down = vis[r] & ((~grid[r + 1]) & mask);
          if ((down & ~vis[r + 1]) != 0) {
            vis[r + 1] |= down;
            changed = true;
          }
        }
      }

    } while (changed);

    // check all unshaded visited
    for (int r = 0; r < h; ++r) {
      final int unshaded = (~grid[r]) & mask;
      if ((unshaded & ~vis[r]) != 0) {
        return false;
      }
    }

    return true;
  }

  private boolean reducible(final int[] grid) {
    final int h = grid.length;
    for (int r = 0; r < h; ++r) {
      for (int c = 0; c < mX; ++c) {
        if (bitSet(grid[r], c)) {
          continue;
        }
        grid[r] = setBit(grid[r], c);
        if (independent(grid[r])
          && (r == 0 || (grid[r] & grid[r - 1]) == 0)
          && (r + 1 >= h || (grid[r] & grid[r + 1]) == 0)
          && connectedUnshaded(grid)) {
          grid[r] = clearBit(grid[r], c);
          return true;
        }
        grid[r] = clearBit(grid[r], c);
      }
    }
    return false;
  }

  private void flipVertical(final int[] g) {
    for (int i = 0; i < mY / 2; ++i) {
      final int t = g[i];
      g[i] = g[mY - i - 1];
      g[mY - i - 1] = t;
    }
  }

  private void flipHorizontal(final int[] g) {
    for (int i = 0; i < mY; ++i) {
      g[i] = mFlipped[g[i]];
    }
  }

  private void flipDiagonal(final int[] g) {
    for (int i = 1; i < mX; ++i) {
      for (int j = 0; j < i; ++j) {
        final boolean b1 = bitSet(g[i], j);
        final boolean b2 = bitSet(g[j], i);
        if (b1 != b2) {
          g[i] ^= 1 << j;
          g[j] ^= 1 << i;
        }
      }
    }
  }

  private int compare(final int[] a, final int[] b) {
    final int n = Math.min(a.length, b.length);
    for (int i = 0; i < n; ++i) {
      if (a[i] != b[i]) {
        return Integer.compare(a[i], b[i]);
      }
    }
    return Integer.compare(a.length, b.length);
  }

  private boolean isCanonical(final int[] grid) {
    if (grid[mY - 1] < grid[0]) {
      return false;
    }
    final int[] copy = grid.clone();
    flipVertical(copy);
    if (compare(copy, grid) < 0) {
      return false;
    }
    flipHorizontal(copy);
    if (compare(copy, grid) < 0) {
      return false;
    }
    flipVertical(copy);
    if (compare(copy, grid) < 0) {
      return false;
    }
    if (mX != mY) {
      return true;
    }
    flipDiagonal(copy);
    if (compare(copy, grid) < 0) {
      return false;
    }
    flipVertical(copy);
    if (compare(copy, grid) < 0) {
      return false;
    }
    flipHorizontal(copy);
    if (compare(copy, grid) < 0) {
      return false;
    }
    flipVertical(copy);
    return compare(copy, grid) >= 0;
  }

  private void dfs(final int r, final int prevIdx, final int[] grid, final Set<String> uniq) {
    // Lemma 3/4 pruning
    if (r == 2) {
      final int shadedTop = grid[0] | grid[1];
      final int mask = (1 << mX) - 1;
      final int unshaded = (~shadedTop) & mask;
      final int withBorders = (unshaded << 1) | 1 | (2 << mX);
      if ((withBorders & (withBorders << 1) & (withBorders << 2)) != 0) {
        return;
      }
    }

    if (r == mY) {
      final int minDim = Math.min(mX, mY);
      final int maxDim = Math.max(mX, mY);

      if ((minDim != 1 || maxDim > 2)
        && connectedUnshaded(grid)
        && !reducible(grid)) {
        if (isCanonical(grid)) {
          uniq.add(toKey(grid));
        }
      }
      return;
    }

    for (final int idx : mNextRows.get(prevIdx)) {
      grid[r] = mRowStates.get(idx);
      dfs(r + 1, idx, grid, uniq);
    }
  }

  private String toKey(final int[] grid) {
    final StringBuilder sb = new StringBuilder();
    for (final int v : grid) {
      sb.append(v).append(',');
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    if (++mY > mX) {
      ++mX;
      mY = 1;
    }

    buildRowStates();
    initFlipped();

    final ExecutorService pool = Executors.newFixedThreadPool(THREADS);
    final List<Future<Set<String>>> futures = new ArrayList<>();
    for (int i = 0; i < mRowStates.size(); ++i) {
      final int idx = i;
      final int top = mRowStates.get(i);
      if (top > mFlipped[top]) {
        continue;
      }
      futures.add(pool.submit(() -> {
        final Set<String> local = new HashSet<>();
        final int[] grid = new int[mY];
        grid[0] = top;
        dfs(1, idx, grid, local);
        return local;
      }));
    }

    // merge results
    final Set<String> uniq = new HashSet<>();
    for (Future<Set<String>> f : futures) {
      try {
        uniq.addAll(f.get());
      } catch (final InterruptedException | ExecutionException e) {
        throw new RuntimeException(e);
      }
    }

    pool.shutdown();
    return Z.valueOf(uniq.size());
  }
}
