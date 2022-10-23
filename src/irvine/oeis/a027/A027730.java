package irvine.oeis.a027;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.graph.CountIndependentSets;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027730 Number of independent subsets of nodes in graph formed from n-fold subdivision of tetrahedron.
 * @author Sean A. Irvine
 */
public class A027730 extends Sequence0 {

  private int mN = -1;

  protected int dimension() {
    return 3; // tetrahedron
  }

  private void nextCoords(final int[] coords) {
    if (coords.length < 1) {
      throw new IllegalArgumentException();
    }
    int k = 0;
    for (int j = coords.length; 1 <= j; --j) {
      if (coords[j - 1] > 0) {
        k = j;
        break;
      }
    }
    final int t;
    final int i1;
    if (k == 0) {
      coords[coords.length - 1] = 1;
      return;
    } else if (k == 1) {
      t = coords[0] + 1;
      i1 = coords.length;
    } else {
      t = coords[k - 1];
      i1 = k - 1;
    }
    coords[k - 1] = 0;
    ++coords[i1 - 1];
    coords[coords.length - 1] += t - 1;
  }

  private int order(final int n) {
    return Binomial.binomial(n + dimension() - 1, dimension()).intValueExact();
  }

  private String key(final int[] coords) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < coords.length - 1; ++k) {
      sb.append(coords[k]).append(',');
    }
    return sb.toString();
  }

  private void addEdge(final Map<String, Integer> coordsToVertex, final Graph g, final int u, final int[] t) {
    final Integer v = coordsToVertex.get(key(t));
    if (v != null) {
      g.addEdge(u, v);
    }
  }

  private Graph simplex(final int n) {
    final int order = order(n);
    final Graph g = GraphFactory.create(order);
    final int[] t = new int[dimension() + 1];
    t[t.length - 1] = n - 1;
    final Map<String, Integer> coordsToVertex = new HashMap<>();
    for (int u = 0; u < order; ++u, nextCoords(t)) {
      coordsToVertex.put(key(t), u);
    }
    Arrays.fill(t, 0);
    t[t.length - 1] = n - 1;
    for (int u = 0; u < order; ++u, nextCoords(t)) {
      for (int k = 0; k < dimension(); ++k) {
        --t[k];
        addEdge(coordsToVertex, g, u, t);
        for (int j = k + 1; j < dimension(); ++j) {
          ++t[j];
          addEdge(coordsToVertex, g, u, t);
          --t[j];
        }
        t[k] += 2;
        addEdge(coordsToVertex, g, u, t);
        for (int j = k + 1; j < dimension(); ++j) {
          --t[j];
          addEdge(coordsToVertex, g, u, t);
          ++t[j];
        }
        --t[k];
      }
    }
    return g;
  }

  @Override
  public Z next() {
    return Z.valueOf(CountIndependentSets.count(simplex(++mN)));
  }
}
