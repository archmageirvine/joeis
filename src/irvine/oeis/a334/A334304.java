package irvine.oeis.a334;

import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.nauty.DirectedGraph;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A334304 Number of distinct acyclic orientations of the edges of an n-dimensional cube with complete graphs as facets.
 * @author Sean A. Irvine
 */
public class A334304 extends DirectedGraph implements Sequence {

  private int mN = -1;
  private long mCount = 0;

  private boolean isAcyclic(final Graph g) {
    final int[] marks = new int[g.order()];
    Arrays.fill(marks, -1);
    final TreeSet<Integer> t = new TreeSet<>();
    // Explore from each vertex in turn
    for (int v = 0; v < g.order(); ++v) {
      marks[v] = v + 1;
      t.add(v);
      while (!t.isEmpty()) {
        final int u = t.pollFirst();
        for (int w = g.nextVertex(u, -1); w >= 0; w = g.nextVertex(u, w)) {
          if (w == v) {
            return false;
          }
          if (marks[w] != v + 1) {
            t.add(w);
            marks[w] = v + 1;
          }
        }
      }
    }
    return true;
  }

  @Override
  protected void process(final Graph g) {
    if (isAcyclic(g)) {
      //if (g.girth() == 0) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    final Graph g = GraphFactory.hypercube(mN);
    // Complete the faces
    for (int m = 1; m < g.order(); m <<= 1) {
      for (int u = 0; u < g.order(); ++u) {
        for (int v = u + 1; v < g.order(); ++v) {
          if ((u & m) == (v & m)) {
            g.addEdge(u, v);
          }
        }
      }
    }
    System.out.println(g.order() + " " + g.size());
    mCount = 0;
    try {
      direct(g, 0, g.size(), g.size(), true, g.order());
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
    return Z.valueOf(mCount);
  }
}
