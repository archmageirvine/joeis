package irvine.oeis.a007;

import irvine.math.graph.Graph;
import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;

/**
 * A007085 Number of unlabeled trivalent 3-connected bipartite planar graphs with <code>2n</code> nodes without subgraphs <code>R1</code> and <code>R4</code>.
 * @author Sean A. Irvine
 */
public class A007085 extends A007083 {

  /** Construct the sequence. */
  public A007085() {
    super();
    next();
    next();
    next();
  }

  private boolean containsR1(final Graph graph) {
    if (graph.order() < 6) {
      return false;
    }
    for (int a = 0; a < graph.order(); ++a) {
      int b = -1;
      while ((b = graph.nextVertex(a, b)) >= 0) {
        int c = -1;
        while ((c = graph.nextVertex(a, c)) >= 0) {
          if (c != b) {
            int d = -1;
            while ((d = graph.nextVertex(a, d)) >= 0) {
              if (d != b && d != c) {
                int e = -1;
                while ((e = graph.nextVertex(b, e)) >= 0) {
                  if (e != a && e != c && e != d && graph.isAdjacent(c, e)) {
                    int f = -1;
                    while ((f = graph.nextVertex(c, f)) >= 0) {
                      if (f != a && f != b && f != d && f != e && graph.isAdjacent(d, f)) {
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  @Override
  protected boolean accept(final Plantri plantri, final PlantriGraphState state) {
    final Graph g = plantri.makeDualGraph();
    return !containsR1(g) && !A007084.containsR4(g);
  }
}

