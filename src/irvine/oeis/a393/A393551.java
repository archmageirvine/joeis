package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393551: Number of irreducible independent-set complements on an n X k grid,
 * @author Sean Irvine (Java port)
 */
public class A393551 extends Sequence1 {

  // Port of Douglas Boffey's C++ implementation: https://oeis.org/A393551/a393551.cc.txt

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
    final boolean[][] visited = new boolean[h][mX];
    int sx = -1;
    int sy = -1;
    outer:
    for (int i = 0; i < h; ++i) {
      for (int j = 0; j < mX; ++j) {
        if (!bitSet(grid[i], j)) {
          sx = i;
          sy = j;
          break outer;
        }
      }
    }
    if (sx < 0) {
      return false;
    }
    final int[] qx = new int[h * mX];
    final int[] qy = new int[h * mX];
    int qs = 0;
    int qe = 0;
    qx[qe] = sx;
    qy[qe++] = sy;
    visited[sx][sy] = true;
    final int[] dx = {1, -1, 0, 0};
    final int[] dy = {0, 0, 1, -1};
    while (qs < qe) {
      final int x = qx[qs];
      final int y = qy[qs++];
      for (int k = 0; k < 4; ++k) {
        final int nx = x + dx[k];
        final int ny = y + dy[k];
        if (nx >= 0 && ny >= 0 && nx < h && ny < mX) {
          if (!visited[nx][ny] && !bitSet(grid[nx], ny)) {
            visited[nx][ny] = true;
            qx[qe] = nx;
            qy[qe++] = ny;
          }
        }
      }
    }
    for (int i = 0; i < h; ++i) {
      for (int j = 0; j < mX; ++j) {
        if (!bitSet(grid[i], j) && !visited[i][j]) {
          return false;
        }
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

    final Set<String> uniq = new HashSet<>();
    final int[] grid = new int[mY];

    for (int i = 0; i < mRowStates.size(); ++i) {
      final int top = mRowStates.get(i);
      if (top <= mFlipped[top]) {
        grid[0] = top;
        dfs(1, i, grid, uniq);
      }
    }

    return Z.valueOf(uniq.size());
  }
}
