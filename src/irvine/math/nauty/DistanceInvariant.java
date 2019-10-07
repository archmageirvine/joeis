package irvine.math.nauty;

import irvine.math.graph.Graph;
import irvine.math.graph.SmallGraph;

/**
 * @author Sean A. Irvine
 */
final class DistanceInvariant {

  private DistanceInvariant() { }

  /* make distance invariant
     return false if n-1 not maximal else return true */
  static boolean distanceInvariant(final Graph g, final int[] invar) {
    final int n = g.order();
    for (int v = n - 1; v >= 0; --v) {
      int inv = 0;
      long frontier = GenerateGraphs.BIT[v];
      long sofar = frontier;
      for (int d = 1; frontier != 0; ++d) {
        long workset = 0;
        inv += (long) Long.bitCount(frontier) ^ (0x57 + d);
        while (frontier != 0) {
          final int w = Long.numberOfLeadingZeros(frontier);
          frontier ^= GenerateGraphs.BIT[w];
          workset |= ((SmallGraph) g).getEdgeVector(w);
        }
        frontier = workset & ~sofar;
        sofar |= frontier;
      }
      invar[v] = inv;
      if (v < n - 1 && inv > invar[n - 1]) {
        return false;
      }
    }
    return true;
  }
}
