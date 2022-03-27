package irvine.math.graph;

import java.util.function.Function;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;

/**
 * Defines a function used for enumerating counts of edges.
 * @author Sean A. Irvine
 */
public interface Edges {

  /**
   * Compute the count.
   * @param partition particular partition
   * @param yf callback function
   * @return count
   */
  Z edges(final int[] partition, final Function<Integer, Z> yf);

  /**
   * Digraph edges without loops.
   */
  Edges DIGRAPH_EDGES = (partition, yf) -> {
    Z prod = Z.ONE;
    for (int i = 1; i < partition.length; ++i) {
      for (int j = 0; j < i; ++j) {
        final int g = IntegerUtils.gcd(partition[i], partition[j]);
        prod = prod.multiply(yf.apply(partition[i] * partition[j] / g).pow(2L * g));
      }
    }
    for (final int j : partition) {
      prod = prod.multiply(yf.apply(j).pow(j - 1));
    }
    return prod;
  };

  /**
   * Ordinary undirected edges.
   */
  Edges GRAPH_EDGES = (partition, yf) -> {
    Z prod = Z.ONE;
    for (int i = 1; i < partition.length; ++i) {
      for (int j = 0; j < i; ++j) {
        final int g = IntegerUtils.gcd(partition[i], partition[j]);
        prod = prod.multiply(yf.apply(g));
      }
    }
    for (final int j : partition) {
      prod = prod.multiply(yf.apply(j / 2));
    }
    return prod;
  };

  // edges(v) = {sum(i=2, #v, sum(j=1, i-1, gcd(v[i], v[j]))) + sum(i=1, #v, v[i]\2)}

}
