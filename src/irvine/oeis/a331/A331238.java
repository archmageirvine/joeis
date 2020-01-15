package irvine.oeis.a331;

import java.io.IOException;
import java.util.Collection;

import irvine.math.IntegerUtils;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.math.nauty.GraphProcessor;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A331238.
 * @author Sean A. Irvine
 */
public class A331238 implements Sequence, GraphProcessor {

  private int mN = 0;
  private int mM = 0;
  private long[] mCounts = new long[0];

  private static int postorder(final Graph graph, final int[] el, final int[] pa, final boolean[] visited, final int v, final int parent, int k) {
    visited[v] = true;
    el[--k] = v;
    if (v != parent) {
      pa[k] = parent;
    }
    int u = -1;
    while ((u = graph.nextVertex(v, u)) >= 0) {
      if (!visited[u]) {
        k = postorder(graph, el, pa, visited, u, v, k);
      }
    }
    return k;
  }

  // todo put this some generic -- GraphUtils
  static int getCuttingNumber(final Graph graph) {
    // Compute cutting number of tree using Harary, Slater

    // Post order
    final int p = graph.order();
    final int[] el = new int[p];
    final int[] pa = new int[p - 1];
    final int k = postorder(graph, el, pa, new boolean[el.length], 0, 0, p);
    assert k == el.length;

    // Cutting numbers
    int[] c = new int[p];
    int[] d = new int[p];
    for (int i = 0; i < pa.length; ++i) {
      d[pa[i]] += d[el[i]] + 1;
      c[pa[i]] += (d[el[i]] + 1) * (p - 2 - d[el[i]]);
      c[el[i]] += (p - 1 - d[el[i]]) * d[el[i]];
    }
    return IntegerUtils.max(c) / 2;
  }

  private int cuttingNumber(final Graph graph, final int vertex) {
    final Collection<Graph> branches = graph.delete(vertex).components();
    if (branches.size() <= 1) {
      return 0;
    }
    final int p = graph.order();
    int cn = (p - 1) * (p - 2) / 2;
    for (final Graph g : branches) {
      final long pg = g.order();
      cn -= pg * (pg - 1) / 2;
    }
    return cn;
  }

  private int cuttingNumber(final Graph graph) {
    int cn = 0;
    for (int v = 0; v < graph.order(); ++v) {
      if (graph.degree(v) > 1) {
        final int cnv = cuttingNumber(graph, v);
        if (cnv > cn) {
          cn = cnv;
        }
      }
    }
    return cn;
  }

  @Override
  public void process(final Graph graph) throws IOException {
    ++mCounts[cuttingNumber(graph)];
    //++mCounts[getCuttingNumber(graph)];
  }

  @Override
  public Z next() {
    if (++mM >= mCounts.length) {
      mCounts = new long[mN * (mN - 1) / 2 + 1];
      ++mN;
      mM = 0;
      System.out.println("n=" + mN);
      final GenerateGraphs gg = new GenerateGraphs(1);
      gg.setVertices(mN);
      gg.setMinEdges(mN - 1);
      //gg.setMaxEdges(mN - 1); // trees
      gg.setMaxEdges(mN * (mN - 1) / 2); // graphs
      gg.setConnectionLevel(1);
      gg.setProcessor(this);
      gg.sanitizeParams();
      try {
        gg.run(false, false, false, 0, 0);
      } catch (final IOException e) {
        throw new RuntimeException(e); // We are not generating output anyway
      }
    }
    return Z.valueOf(mCounts[mM]);
  }
}
