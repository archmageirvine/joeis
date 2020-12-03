package irvine.oeis.a006;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A006184 Number of cycles in the complement of a path.
 * @author Sean A. Irvine
 */
public class A006184 implements Sequence {

  // Based on C++ code at https://comeoncodeon.wordpress.com/2010/06/07/number-of-cycles-in-a-graph/

  private int mN = -1;

  // Makes K_n - P_n
  private boolean[][] makePathComplementGraph(final int n) {
    final boolean[][] adj = new boolean[n][n];
    for (int u = 0; u < n; ++u) {
      for (int v = u + 2; v < n; ++v) {
        adj[u][v] = true;
        adj[v][u] = true;
      }
    }
    return adj;
  }

  private Z[] getRow(final LongDynamicArray<Z[]> f, final long row, final int n) {
    final Z[] res = f.get(row);
    if (res != null) {
      return res;
    }
    final Z[] t = new Z[n];
    Arrays.fill(t, Z.ZERO);
    f.set(row, t);
    return t;
  }

  private Z countCyclesInGraph(final boolean[][] adj) {
    final int n = adj.length;
    // Let, i denote a subset S of our vertices
    // k be the smallest set bit of i
    // then f[i][j] is the number of simple paths from j to k that
    // contains vertices only from the set S.
    final LongDynamicArray<Z[]> f = new LongDynamicArray<>();
    for (int u = 0; u < n; ++u) {
      for (int v = u + 1; v < n; ++v) {
        if (adj[u][v]) {
          getRow(f, (1L << u) + (1L << v), n)[v] = Z.ONE;
        }
      }
    }
    Z res = Z.ZERO;
    int k = 0;
    for (long i = 7; i < (1L << n); ++i) {
      boolean flag = true;
      for (int j = 0; j < n; j++) {
        if ((i & (1L << j)) != 0 && getRow(f, i, n)[j].isZero()) {
          if (flag) {
            flag = false;
            k = j;
            continue;
          }
          for (int l = k + 1; l < n; ++l) {
            if ((i & (1L << l)) != 0 && adj[j][l]) {
              f.get(i)[j] = getRow(f, i, n)[j].add(getRow(f, i - (1L << j), n)[l]);
            }
          }
          if (adj[k][j]) {
            res = res.add(f.get(i)[j]);
          }
        }
      }
    }
    return res.divide2();
  }

  @Override
  public Z next() {
    return countCyclesInGraph(makePathComplementGraph(++mN));
  }
}

