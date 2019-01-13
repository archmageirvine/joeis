package irvine.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import irvine.util.Permutation;

/**
 * Count the number of non-isomorphic vertex labellings of a graph.
 * @author Sean A. Irvine
 * @param <E> edge type
 */
public final class VertexLabeling<E> {

  // The number of labellings is |V|! / |Aut(G)|.
  // Computing |Aut(G)| appears almost as hard as computing Aut(G), which itself
  // is at least as hard as isomorphism.
  // This implementation does simple backtracking, ok for 10 or so vertices.

  private static final class Labeling {
    // Linearized adjacency matrix
    private final boolean[] mLabeling;

    private Labeling(final int order) {
      mLabeling = new boolean[order * order];
    }

    @Override
    public boolean equals(final Object other) {
      return other instanceof Labeling && Arrays.equals(((Labeling) other).mLabeling, mLabeling);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mLabeling);
    }

    void clear() {
      Arrays.fill(mLabeling, false);
    }
  }

  private final Graph<Integer, E> mGraph;
  private final int[] mInverseWorkspace;
  private final List<List<Integer>> mAdj;
  private Labeling mLab;
  private final HashSet<Labeling> mLabelings = new HashSet<>();

  private VertexLabeling(final Graph<Integer, E> graph) {
    mGraph = graph;
    mInverseWorkspace = new int[mGraph.order()];
    mAdj = new ArrayList<>(mGraph.order());
    for (int k = 0; k < mGraph.order(); ++k) {
      final ArrayList<Integer> neighbours = new ArrayList<>();
      mAdj.add(neighbours);
      for (final Vertex<Integer, E> n : mGraph.getVertex(k).neighbours()) {
        neighbours.add(n.label());
      }
    }
    mLab = new Labeling(mGraph.order());
  }

  // mInverseWorkspace reused here to avoid reallocation
  // mLab reused when possible to avoid reallocation

  private void count(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      mInverseWorkspace[p[k]] = k;
    }
    final boolean[] isomap = mLab.mLabeling;
    for (int k = 0, l = 0; k < p.length; ++k, l += p.length) {
      final int vertexNumber = p[k];
      for (final int n : mAdj.get(vertexNumber)) {
        isomap[l + mInverseWorkspace[n]] = true;
      }
    }
    if (!mLabelings.contains(mLab)) {
      mLabelings.add(mLab);
      // We are keeping the labeling, so allocate a new one for workspace
      mLab = new Labeling(p.length);
    } else {
      mLab.clear();
    }
  }

  private int count() {
    final Permutation perm = new Permutation(mGraph.order());
    int[] p;
    while ((p = perm.next()) != null) {
      count(p);
    }
    return mLabelings.size();
  }

  /**
   * Return a count of the number of labelings of the specified graph.
   * @param graph graph to count labelings of
   * @param <E> edge type
   * @return count
   */
  public static <E> int countLabellings(final Graph<Integer, E> graph) {
    return new VertexLabeling<>(graph).count();
  }

  /**
   * Reads from standard input.
   *
   * @param args number of colours
   * @throws java.io.IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty()) {
          final Graph<Integer, String> g = EdgeThreeColouring.makeGraph(line);
          System.out.println(line + " labelings=" + countLabellings(g));
        }
      }
    }
  }
}
