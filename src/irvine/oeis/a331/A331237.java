package irvine.oeis.a331;

import irvine.math.IntegerUtils;
import irvine.math.graph.Graph;
import irvine.math.nauty.GenerateGraphs;
import irvine.oeis.ParallelGenerateGraphsSequence;

/**
 * A331237.
 * @author Sean A. Irvine
 */
public class A331237 extends ParallelGenerateGraphsSequence {

  /** Construct the sequence. */
  public A331237() {
    super(0, 0, false, false, false);
  }

  private int postorder(final Graph graph, final int[] el, final int[] pa, final boolean[] visited, final int v, final int parent, int k) {
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

  @Override
  protected long getCount(final Graph graph) {
    // Compute cutting number of tree using Harary, Slater

    // Post order
    final int p = graph.order();
    final int[] el = new int[p];
    final int[] pa = new int[p - 1];
    final int k = postorder(graph, el, pa, new boolean[el.length], 0, 0, p);
    assert k == el.length;

    // Cutting numbers
    final int[] c = new int[p];
    final int[] d = new int[p];
    for (int i = 0; i < pa.length; ++i) {
      d[pa[i]] += d[el[i]] + 1;
      c[pa[i]] += (d[el[i]] + 1) * (p - 2 - d[el[i]]);
      c[el[i]] += (p - 1 - d[el[i]]) * d[el[i]];
    }
    return IntegerUtils.max(c) / 2;
  }

  @Override
  protected void graphGenInit(final GenerateGraphs gg) {
    gg.setVertices(mN);
    gg.setMinEdges(mN - 1);
    gg.setMaxEdges(mN - 1);
    gg.setConnectionLevel(1);
  }
}
