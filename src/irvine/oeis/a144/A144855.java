package irvine.oeis.a144;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A144855 Number of paths from <code>(1,1)</code> to <code>(n,n)</code> in an <code>n X n</code> grid using only the steps <code>+(1,0), -(1,0), +(0,1)</code> and <code>-(0,1)</code> which do not self-intersect and which avoid any point <code>(p,q)</code> satisfying <code>"(p-1)*n +</code> q is prime".
 * @author Sean A. Irvine
 */
public class A144855 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private boolean[][] constructGrid(final int n) {
    final boolean[][] grid = new boolean[n][n];
    for (int y = 0; y < n; ++y) {
      for (int x = 0; x < n; ++x) {
        grid[y][x] = mPrime.isPrime(x * n + y + 1);
      }
    }
    return grid;
  }

  private void dumpGrid(final boolean[][] grid, final int xx, final int yy) {
    final StringBuilder boundary = new StringBuilder();
    boundary.append('+').append(StringUtils.rep('-', grid.length)).append('+');
    System.err.println(boundary);
    for (int y = 0; y < grid.length; ++y) {
      System.err.print('|');
      for (int x = 0; x < grid.length; ++x) {
        if (x == xx && y == yy) {
          System.err.print('*');
        } else {
          System.err.print(grid[y][x] ? '#' : ' ');
        }
      }
      System.err.println('|');
    }
    System.err.println(boundary);
  }

  private boolean checkDiagonals(final boolean[][] grid) {
    // Any struck out diagonal makes a solution impossible
    for (int y = 0; y < grid.length; ++y) {
      boolean blocked = true;
      for (int x = 0; x <= y; ++x) {
        blocked &= grid[y - x][x];
      }
      if (blocked) {
        return false;
      }
    }
    return true;
  }

  private boolean blockedRow(final boolean[][] grid, final int y) {
    for (final boolean b : grid[y]) {
      if (!b) {
        return false;
      }
    }
    return true;
  }

  private boolean blockedCol(final boolean[][] grid, final int x) {
    for (int k = 0; k < grid.length; ++k) {
      if (!grid[k][x]) {
        return false;
      }
    }
    return true;
  }

  private boolean blockedDiag(final boolean[][] grid, final int x, final int y) {
    for (int k = x, j = y; k >= 0 && j < grid.length; --k, ++j) {
      if (!grid[j][k]) {
        return false;
      }
    }
    for (int k = x + 1, j = y - 1; j >= 0 && k < grid.length; ++k, --j) {
      if (!grid[j][k]) {
        return false;
      }
    }
    return true;
  }

  private Z count(final boolean[][] grid, final int x, final int y) {
    //    dumpGrid(grid, x, y);
    if (x < 0 || y < 0 || x >= grid.length || y >= grid.length || grid[y][x]) {
      return Z.ZERO;
    }
    if (x == 0 && y == 0) {
      if (mVerbose) {
        System.out.print('.');
        System.out.flush();
      }
      return Z.ONE;
    }
    grid[y][x] = true;
    Z c = count(grid, x - 1, y).add(count(grid, x, y - 1));
    final boolean blocked = blockedDiag(grid, x, y);
    if (!blocked && !blockedRow(grid, y)) {
      c = c.add(count(grid, x, y + 1));
    }
    if (!blocked && !blockedCol(grid, x)) {
      c = c.add(count(grid, x + 1, y));
    }
    grid[y][x] = false;
    return c;
  }

  @Override
  public Z next() {
    final boolean[][] grid = constructGrid(++mN);
    if (!checkDiagonals(grid)) {
      return Z.ZERO;
    }
    if (mVerbose) {
      dumpGrid(grid, -1, -1);
    }
    return count(grid, mN - 1, mN - 1);
  }

  /**
   * Run from a particular value.
   *
   * @param args a <code>String</code> value
   */
  public static void main(final String[] args) {
    final A144855 s = new A144855();
    s.mN = Integer.parseInt(args[0]) - 1;
    while (true) {
      System.out.println(s.next().toString());
    }
  }
}

