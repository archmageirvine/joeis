package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038375 Maximal number of spanning paths in a tournament on n nodes.
 * @author Sean A. Irvine
 */
public class A038375 extends Sequence1 {

  // Cf. https://codegolf.stackexchange.com/questions/203179/spanning-paths-in-a-tournament-on-n-nodes

  private int mN = 0;
  private int mMax = 0;
  private int[] mM = null;

  private int path(final int n, final int y, int visited) {
    if ((visited |= 1 << y) == (1 << n) - 1) {
      return 1;
    }
    int res = 0;
    for (int msk = mM[y] & ~visited, b; msk != 0; msk ^= b) {
      res += path(n, 31 - Integer.numberOfLeadingZeros(b = msk & -msk), visited);
    }
    return res;
  }

  private int count(final int n) {
    int res = 0;
    for (int y = 0; y < n; ++y) {
      res += path(n, y, 0);
    }
    return res;
  }

  void build(final int n, final int x, final int y) {
    if (y == n - 1) {
      mMax = Math.max(mMax, count(n));
    } else {
      for (int j = x == y + 1 ? 1 : 0; j <= (x == n - 1 && y == 0 ? 0 : 1); ++j) {
        mM[y] = mM[y] & ~(1 << x) | j << x;
        mM[x] = mM[x] & ~(1 << y) | (j ^ 1) << y;
        if (x + 1 < n) {
          build(n, x + 1, y);
        } else {
          build(n, y + 2, y + 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    mM = new int[mN];
    mMax = 0;
    build(mN, 1, 0);
    return Z.valueOf(mMax);
  }
}
