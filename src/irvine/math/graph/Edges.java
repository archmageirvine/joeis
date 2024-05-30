package irvine.math.graph;

import java.util.function.Function;

import irvine.math.api.Field;
import irvine.math.function.Functions;

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
  <E> E edges(final int[] partition, final Field<E> fld, final Function<Integer, E> yf);

  /**
   * Digraph edges without loops.
   */
  Edges DIGRAPH_EDGES = new Edges() {
    @Override
    public <E> E edges(final int[] partition, final Field<E> fld, final Function<Integer, E> yf) {
      E prod = fld.one();
      for (int i = 1; i < partition.length; ++i) {
        for (int j = 0; j < i; ++j) {
          final int g = Functions.GCD.i(partition[i], partition[j]);
          prod = fld.multiply(prod, fld.pow(yf.apply(partition[i] * partition[j] / g), 2L * g));
        }
      }
      for (final int j : partition) {
        prod = fld.multiply(prod, fld.pow(yf.apply(j), j - 1));
      }
      return prod;
    }
  };

  /** Ordinary undirected edges. */
  Edges GRAPH_EDGES = new Edges() {
    @Override
    public <E> E edges(final int[] partition, final Field<E> fld, final Function<Integer, E> yf) {
      E prod = fld.one();
      for (int i = 1; i < partition.length; ++i) {
        for (int j = 0; j < i; ++j) {
          final int g = Functions.GCD.i(partition[i], partition[j]);
          prod = fld.multiply(prod, yf.apply(g));
        }
      }
      for (final int j : partition) {
        prod = fld.multiply(prod, yf.apply(j / 2));
      }
      return prod;
    }
  };

  /** Oriented undirected edges. */
  Edges ORIENTED_GRAPH_EDGES = new Edges() {
    @Override
    public <E> E edges(final int[] partition, final Field<E> fld, final Function<Integer, E> yf) {
      E prod = fld.one();
      for (int i = 1; i < partition.length; ++i) {
        for (int j = 0; j < i; ++j) {
          final int g = Functions.GCD.i(partition[i], partition[j]);
          prod = fld.multiply(prod, fld.pow(yf.apply(partition[i] * partition[j] / g), g));
        }
      }
      for (final int c : partition) {
        prod = fld.multiply(prod, fld.pow(yf.apply(c), (c - 1) / 2));
      }
      return prod;
    }
  };

  /*
  OrientedGraphEdges(v, yf) = {prod(i=2, #v, prod(j=1, i-1, my(g=gcd(v[i], v[j])); yf(v[i]*v[j]/g)^g )) * prod(i=1, #v, my(c=v[i]); yf(c)^((c-1)\2))}

   */
}
