package irvine.oeis.a069;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069808 Smallest k&gt;n such that prime(n)-1 divides prime(k)-1.
 * @author Sean A. Irvine
 */
public class A069831 extends Sequence0 {

  // todo this misses K_5 for 10 edges
  // todo is there a direct way from allowed partitions

  private static final Comparator<Integer> COMPARATOR = (a, b) -> Integer.compare(b, a);

  private Set<Graph> mA = Collections.emptySet();
  private Set<Graph> mB = Collections.emptySet();
  private Set<Graph> mC = Collections.emptySet();
  private Set<Graph> mD = Collections.emptySet();
  private int mN = -1;

  private List<Integer> degreeVector(final Graph g) {
    final ArrayList<Integer> v = new ArrayList<>(g.order());
    for (int k = 0; k < g.order(); ++k) {
      v.add((int) g.degree(k));
    }
    v.sort(COMPARATOR);
    return v;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE; // empty graph
    } else if (mN == 3) {
      mD = Collections.singleton(GraphFactory.complete(3)); // K3
    } else if (mN >= 4) {
      final Set<List<Integer>> partitions = new HashSet<>();
      final Set<Graph> res = new HashSet<>();
      // Add 1 edge
      for (final Graph s : mD) {
        final int w = s.order();
        for (int u = 0; u < w; ++u) {
          if (s.degree(u) == 2) {
            final Graph t = s.copy(w + 1);
            final int v = s.nextVertex(u, -1);
            t.removeEdge(u, v);
            t.addEdge(u, w);
            t.addEdge(w, v);
            if (partitions.add(degreeVector(t))) {
              res.add(t);
            }
            break;
          }
        }
      }
      // Add 3 edges, introducing 2 new vertices of degree 2
      for (final Graph s : mB) {
        final int w = s.order();
        for (int u = 0; u < w; ++u) {
          final Graph t = s.copy(w + 2);
          t.addEdge(u, w);
          t.addEdge(u, w + 1);
          t.addEdge(w, w + 1);
          if (partitions.add(degreeVector(t))) {
            res.add(t);
          }
        }
      }
      // Add 3 edges, introducing 1 new vertex of degree 2
      for (final Graph s : mB) {
        final int w = s.order();
        for (int u = 0; u < w; ++u) {
          for (int v = 0; v < u; ++v) {
            if (!s.isAdjacent(u, v)) {
              final Graph t = s.copy(w + 1);
              t.addEdge(u, w);
              t.addEdge(v, w);
              t.addEdge(u, v);
              if (partitions.add(degreeVector(t))) {
                res.add(t);
              }
            }
          }
        }
      }
      // Add 4 edges in a diamond, introducing 2 new vertices of degree 2
      for (final Graph s : mA) {
        final int w = s.order();
        for (int u = 0; u < w; ++u) {
          for (int v = 0; v < u; ++v) {
            final Graph t = s.copy(w + 2);
            t.addEdge(u, w);
            t.addEdge(v, w);
            t.addEdge(u, w + 1);
            t.addEdge(v, w + 1);
            if (partitions.add(degreeVector(t))) {
              res.add(t);
            }
          }
        }
      }
      mA = mB;
      mB = mC;
      mC = mD;
      mD = res;
      System.out.println(mN + " " + partitions);
    }
//    // todo better to build this map as we go? only keeping unique
//    final HashSet<List<Integer>> res = new HashSet<>();
//    for (final Graph g : mD) {
//      res.add(degreeVector(g));
//    }
//    System.out.println("Vectors: " + res);
//    return Z.valueOf(res.size());
    return Z.valueOf(mD.size());
  }
}

