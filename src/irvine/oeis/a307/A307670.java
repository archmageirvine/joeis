package irvine.oeis.a307;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A307670 Number of (undirected) cycles in the n X n antelope graph.
 * @author Sean A. Irvine
 */
public class A307670 implements Sequence {

  private static final int[] DELTA_X = {3, 3, -3, -3, 4, 4, -4, -4};
  private static final int[] DELTA_Y = {4, -4, 4, -4, 3, -3, 3, -3};
  private int mN = 0;
  private long mCycles = 0;
  private int[][] mGraph;
  private boolean[] mUsedVertices = null;
  private final HashSet<Pair<Integer, Integer>> mUsedEdges = new HashSet<>();

  private static int[][] antelopeGraph(final int n) {
    final int[][] g = new int[n * n][];
    for (int x = 0; x < n; ++x) {
      for (int y = 0; y < n; ++y) {
        final List<Integer> neighbours = new ArrayList<>();
        for (int k = 0; k < DELTA_X.length; ++k) {
          final int nx = x + DELTA_X[k];
          final int ny = y + DELTA_Y[k];
          if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
            neighbours.add(ny * n + nx);
          }
        }
        final int[] r = new int[neighbours.size()];
        for (int k = 0; k < neighbours.size(); ++k) {
          r[k] = neighbours.get(k);
        }
        g[y * n + x] = r;
      }
    }
    return g;
  }

  private Pair<Integer, Integer> edge(final int u, final int v) {
    return u < v ? new Pair<>(u, v) : new Pair<>(v, u);
  }

  private void countCycles(final int start, final int current) {
    if (current == start && !mUsedEdges.isEmpty()) {
      ++mCycles;
      return;
    }
    for (final int neighbour : mGraph[current]) {
      if (neighbour >= start) { // ensures start is smallest vertex of cycle
        final Pair<Integer, Integer> e = edge(current, neighbour);
        if (!mUsedVertices[neighbour]) {
          if (mUsedEdges.add(e)) {
            mUsedVertices[neighbour] = true;
            countCycles(start, neighbour);
            mUsedEdges.remove(e);
            mUsedVertices[neighbour] = false;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    mGraph = antelopeGraph(++mN);
    mCycles = 0;
    mUsedVertices = new boolean[mN * mN];
    for (int k = 0; k < mGraph.length; ++k) {
      countCycles(k, k);
    }
    return Z.valueOf(mCycles / 2);  // we went round each cycle both directions
  }
}
