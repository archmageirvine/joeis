package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020881 Number of strong restricted edge-subgraphs in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020881 implements Sequence {

  private int mN = 1;
  private int[][] mGraph = null;
  private long mCount = 0;

  static int[][] mobiusLadderGraph(final int n) {
    final int[][] neighbours = new int[2 * n][3];
    for (int k = 0; k < n; ++k) {
      neighbours[k][0] = k + 1;
      neighbours[k][1] = k - 1;
      neighbours[k][2] = n + k;
      neighbours[n + k][0] = n + k + 1;
      neighbours[n + k][1] = n + k - 1;
      neighbours[n + k][2] = k;
    }
    neighbours[0][1] = 2 * n - 1;
    neighbours[2 * n - 1][0] = 0;
    return neighbours;
  }

  private void search(final int vertex, final int last, final int[] degree) {
    if (vertex == degree.length) {
      ++mCount;
      return;
    }
    // Need to use either 1 or 2 edges from this vertex
    if (degree[vertex] >= 1) {
      search(vertex + 1, vertex + 1, degree);
    }
    if (degree[vertex] < 2) {
      for (final int n : mGraph[vertex]) {
        if (n > last && degree[n] < 2) {
          ++degree[vertex];
          ++degree[n];
          search(vertex, n, degree);
          --degree[n];
          --degree[vertex];
        }
      }
    }
  }

  @Override
  public Z next() {
    mGraph = mobiusLadderGraph(++mN);
    mCount = 0;
    search(0, 0, new int[mGraph.length]);
    return Z.valueOf(mCount);
  }
}
