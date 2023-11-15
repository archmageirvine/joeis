package irvine.oeis.a066;

import java.util.Arrays;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066863 Number of binary arrangements without adjacent 1's on n X n staggered hexagonal grid.
 * @author Sean A. Irvine
 */
public class A066863 extends Sequence1 {

  private int mN = 0;

  private static Z s(final Z[] t) {
    return t[0].add(t[1]);
  }

  private static Z zmin(final Z a, final Z b) {
    if (b.isZero()) {
      return a;
    }
    if (a.isZero()) {
      return b;
    }
    return a.min(b);
  }

  private final MemoryFunctionInt2<Z[]> mB = new MemoryFunctionInt2<>() {

    @Override
    protected Z[] compute(final int n, final int m) {
      if (n == 0 && m == 0) {
        return new Z[] {Z.ONE, Z.ONE};
      }
      if (n < 0 || m < 0) {
        return new Z[] {Z.ZERO, Z.ZERO};
      }
      if (n == 0) {
        final Z[] t = get(n, m - 1);
        return new Z[] {s(t), t[0]};
      }
      if (m == 0) {
        final Z[] t = get(n - 1, m);
        return new Z[] {s(t), t[0]};
      }
      if ((m & 1) == 1) {
        final Z[] w = get(n, m - 1);
        final Z[] sw = get(n - 1, m - 1);
        final Z[] s = get(n - 1, m);
        final Z[] se = get(n - 1, m + 1);
        return new Z[] {s(w).max(s(sw)).max(s(s)).max(s(se)), zmin(zmin(zmin(w[0], sw[0]), s[0]), se[0])};
      } else {
        final Z[] w = get(n, m - 1);
        final Z[] s = get(n - 1, m);
        return new Z[] {s(w).max(s(s)), zmin(w[0], s[0])};
      }
    }
  };

  private Z get(final Z[][][] m, final int y, final int x, final int side) {
    if (y < 0 || x < y || y >= m.length || x >= m.length) {
      return Z.ZERO;
    }
    return m[y][x][side];
  }

  private long mCount0 = 0;
  private long mCount1 = 0;
  private boolean[][] mT = null;

  private boolean t(final int y, final int x) {
    if (y < 0 || x < 0 || x >= mN || y >= mN) {
      return false;
    }
    return mT[y][x];
  }

  private void search(final int y, final int x) {
    if (y == mN) {
      if (mT[mN - 1][mN - 1]) {
        ++mCount1;
      } else {
        ++mCount0;
      }
      return;
    }
    if (x >= mN) {
      search(y + 1, 0);
      return;
    }
    search(y, x + 1);
    if (!t(y, x - 1) && !t(y - 1, x)) {
      if ((x & 1) == 0) {
        mT[y][x] = true;
        search(y, x + 1);
        mT[y][x] = false;
      } else if (!t(y - 1, x - 1) && !t(y - 1, x + 1)) {
        mT[y][x] = true;
        search(y, x + 1);
        mT[y][x] = false;
      }
    }
  }

  @Override
  public Z next() {
    for (int y = 2; y >= 0; --y) {
      for (int x = 0; x < 4; ++x) {
        System.out.print(Arrays.toString(mB.get(y, x)) + ", ");
      }
      System.out.println();
    }
    final Z[][][] m = new Z[++mN][mN][2];
    m[0][0][0] = Z.ONE;
    m[0][0][1] = Z.ONE;
    for (int y = 0; y < mN; ++y) {
      for (int x = y == 0 ? 1 : y; x < mN; ++x) {
        m[y][x][0] = get(m, y, x - 1, 0).add(get(m, y, x - 1, 1))
          .add(get(m, y - 1, x, 0).add(get(m, y - 1, x, 1)));
        m[y][x][1] = zmin(get(m, y, x - 1, 0), get(m, y - 1, x, 0));
        if ((x & 1) == 1) {
          m[y][x][0] = m[y][x][0].add(get(m, y - 1, x - 1, 0).add(get(m, y - 1, x - 1, 1)))
            .add(get(m, y - 1, x + 1, 0).add(get(m, y - 1, x + 1, 1)));
          m[y][x][1] = zmin(zmin(m[y][x][1], get(m, y - 1, x - 1, 0)), get(m, y - 1, x + 1, 0));
        }
      }
    }
    System.out.println(Arrays.deepToString(m));
    System.out.println("B=" + s(mB.get(mN - 1, mN - 1)) + " " + Arrays.toString(mB.get(mN - 1, mN - 1)));
    mCount0 = 0;
    mCount1 = 0;
    mT = new boolean[mN][mN];
    search(0, 0);
    System.out.println("S=" + (mCount0 + mCount1) + " " + mCount0 + "," + mCount1);
    return m[mN - 1][mN - 1][0].add(m[mN - 1][mN - 1][1]);
  }
}
