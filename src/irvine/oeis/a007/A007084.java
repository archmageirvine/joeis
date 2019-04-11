package irvine.oeis.a007;

import irvine.math.graph.Graph;
import irvine.math.plantri.Plantri;
import irvine.math.plantri.PlantriGraphState;

/**
 * A007084 Number of unlabeled trivalent 3-connected bipartite planar graphs with <code>2n</code> nodes without subgraphs R2 and R4.
 * @author Sean A. Irvine
 */
public class A007084 extends A007083 {

  /** Construct the sequence. */
  public A007084() {
    super();
    next();
    next();
    next();
  }

  static boolean containsR4(final Graph graph) {
    if (graph.order() < 8) {
      return false;
    }
    for (int a = 0; a < graph.order(); ++a) {
      int b = -1;
      while ((b = graph.nextVertex(a, b)) >= 0) {
        int c = -1;
        while ((c = graph.nextVertex(b, c)) >= 0) {
          if (c != a) {
            int d = -1;
            while ((d = graph.nextVertex(c, d)) >= 0) {
              if (d != a && d != b && graph.isAdjacent(a, d)) {
                int e = -1;
                while ((e = graph.nextVertex(b, e)) >= 0) {
                  if (e != a && e != c && e != d) {
                    int f = -1;
                    while ((f = graph.nextVertex(e, f)) >= 0) {
                      if (f != a && f != b && f != c && f != d && graph.isAdjacent(f, c)) {
                        int g = -1;
                        while ((g = graph.nextVertex(f, g)) >= 0) {
                          if (g != a && g != b && g != c && g != d && g != e && graph.isAdjacent(g, d)) {
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
      }
    }
    return false;
  }

  private boolean containsR2(final Graph graph) {
    if (graph.order() < 8) {
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
                        int g = -1;
                        while ((g = graph.nextVertex(b, g)) > 0) {
                          if (g != a && g != c && g != d && g != e && g != f) {
                            int h = -1;
                            while ((h = graph.nextVertex(g, h)) >= 0) {
                              if (h != a && h != b && h != c && h != d && h != f && graph.isAdjacent(e, h)) {
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
          }
        }
      }
    }
    return false;
  }

  @Override
  protected boolean accept(final Plantri plantri, final PlantriGraphState state) {
    final Graph g = plantri.makeDualGraph();
    return !containsR4(g) && !containsR2(g);
  }
}

