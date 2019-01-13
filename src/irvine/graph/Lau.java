package irvine.graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.util.Pair;

/**
 * Graph isomorphism testing based on the code in A Java Library
 * of Graph Algorithms and Optimization by Hang T. Lau.  Fixed so
 * that buffers grow and removed some redundant code.
 *
 * @author Sean A. Irvine
 */
final class Lau {

  private Lau() { }

  private static <V, E> int getCode(final Vertex<V, E> v, final HashMap<Vertex<V, E>, Integer> map) {
    final Integer c = map.get(v);
    if (c == null) {
      final int t = map.size() + 1;
      map.put(v, t);
      return t;
    }
    return c;
  }

  private static <V, E> int[][] adjacencyMatrix(final Graph<V, E> a, final HashMap<Vertex<V, E>, Integer> codes) {
    final int[][] adj = new int[a.order() + 1][a.order() + 1];
    for (final Edge<E, V> e : a.edges()) {
      final int q = getCode(e.source(), codes);
      final int r = getCode(e.destination(), codes);
      adj[q][r] = 1;
      adj[r][q] = 1;
    }
    return adj;
  }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private static <V, E> Vertex<V, E>[] invertMapping(final HashMap<Vertex<V, E>, Integer> codes) {
    final Vertex<V, E>[] map = (Vertex<V, E>[]) new Vertex[codes.size() + 1];
    for (final Map.Entry<Vertex<V, E>, Integer> e : codes.entrySet()) {
      map[e.getValue()] = e.getKey();
    }
    return map;
  }

  private static int[] ensureAuxSpace(final int[] auxspace, final int n) {
    if (n < auxspace.length) {
      return auxspace;
    }
    return Arrays.copyOf(auxspace, 2 * n);
  }

  private static void computeCode(final int n, final int[][] adj, final int[][] label, final int[] map) {
    for (int i = 1; i <= n; ++i) {
      final int p = map[i];
      assert p >= 1 && p <= n;
      for (int j = i + 1; j <= n; ++j) {
        final int q = map[j];
        assert q >= 1 && q <= n;
        if ((p < q && adj[p][q] != 0) || (q < p && adj[q][p] != 0)) {
          label[i][j] = 1;
          label[j][i] = 1;
        } else {
          label[i][j] = 0;
          label[j][i] = 0;
        }
      }
    }
  }

  private static void copy(final int[][] label, final int[] map, final int[][] savelabel, final int[] savemap) {
    for (int i = 1; i < label.length; ++i) {
      System.arraycopy(label[i], 0, savelabel[i], 0, label[i].length);
    }
    System.arraycopy(map, 0, savemap, 0, map.length);
  }

  private static int compare(final int[][] a, final int[][] b, final int n) {
    // SAI: note I changed the order of the loops here
    for (int j = 2; j <= n; ++j) {
      final int[] aa = a[j];
      final int[] bb = b[j];
      for (int i = 1; i < j; ++i) {
        final int d = aa[i] - bb[i];
        if (d != 0) {
          return d;
        }
      }
    }
    return 0;
  }

  private static GraphCode isomorphicCode(final int[][] adj, final int n) {
    final GraphCode code = new GraphCode(n);
    final int[][] label = code.mLabel;
    final int[] map = code.mMap;
    IntegerUtils.identity(map, map.length);
    computeCode(n, adj, label, map);
    // save the current best ordering and code
    final int[][] savelabel = new int[n + 1][n + 1];
    final int[] savemap = new int[n + 1];
    copy(label, map, savelabel, savemap);
    final int[] aux1 = new int[n + 1];
    int[] aux4 = new int[n + 1];
    int ctr1 = 0, ctr2 = 0, ctr3 = 0;
    // begin backtrack search, consider all possible orderings and their codes
    while (true) {
      // construct the integer vector by backtracking
      if (ctr1 == 0) {
        // process the complete vector
        ctr2 = 1;
        ctr3 = 0;
        ctr1 = 2;
      } else {
        while (true) {        // examine the stack
          if (aux1[ctr2] > 0) {
            // take the first available one off the stack
            map[ctr2] = aux4[ctr3--];
            aux1[ctr2]--;
            if (ctr2 != n) {
              ++ctr2;
              ctr1 = 2;
            } else {
              ctr1 = 1;
            }
            break;
          } else if (--ctr2 <= 0) {
            // repeat the examination of the stack
            ctr1 = 3;
            break;
          }
        }
      }
      // If the backtrack routine has returned a complete candidate
      // ordering, then compute the resulting code, and compare with
      // the current best and go back for the next backtrack search.
      if (ctr1 == 1) {
        computeCode(n, adj, label, map);
        if (compare(savelabel, label, n) < 0) {
          copy(label, map, savelabel, savemap);
        }
      } else if (ctr1 == 2) {
        // finds candidates for a maximal graph code ordering
        assert ctr2 >= 1 && ctr2 <= n;
        aux1[ctr2] = 0;
        // compute the graph code for this node ordering
        for (int i = 1; i < ctr2; ++i) {
          final int p = map[i];
          assert p >= 1 && p <= n;
          for (int j = i + 1; j < ctr2; ++j) {
            final int q = map[j];
            assert q >= 1 && q <= n;
            if ((p < q && adj[p][q] != 0) || (q < p && adj[q][p] != 0)) {
              label[i][j] = 1;
              label[j][i] = 1;
            } else {
              label[i][j] = 0;
              label[j][i] = 0;
            }
          }
        }
        // compares the two graph codes
        if (compare(savelabel, label, ctr2 - 1) > 0) {
          aux1[ctr2] = 0;
        } else {
          assert ctr2 > 0;
          // list of nodes that have not been used
          final int t = n + 1 - ctr2;
          // find the number of unused items in the permutation
          final int[] aux2 = new int[n + 1];
          if (ctr2 == 1) {
            IntegerUtils.identity(aux2, n + 1);
          } else if (t > 0) {
            for (int i = 1, k = 0; i <= n; ++i) {
              boolean r = false;
              for (int j = 1; j < ctr2; ++j) {
                if (map[j] == i) {
                  r = true;
                  break;
                }
              }
              if (!r) {
                aux2[++k] = i;
              }
            }
          }
          aux1[ctr2] = 0;
          boolean found = false;
          for (int i = 1; i < ctr2; ++i) {
            final int p = map[i];
            for (int j = 1; j <= t; ++j) {
              final int q = aux2[j];
              if (adj[p][q] != 0 || adj[q][p] != 0) {
                aux1[ctr2]++;
                aux4 = ensureAuxSpace(aux4, ++ctr3);
                aux4[ctr3] = q;
              }
            }
            if (aux1[ctr2] > 0) {
              found = true;
              break;
            }
          }
          if (!found) {
            // No free nodes are connected to used nodes
            // take the free nodes with at least one neighbour.
            int s = 0;
            final int[] aux3 = new int[n + 1];
            for (int i = 1, y = 0; i <= t; ++i) {
              final int p = aux2[i];
              for (int j = 1; j <= t; ++j) {
                final int q = aux2[j];
                if (p != q) {
                  y = Math.max(y, adj[p][q]);
                }
              }
              s = Math.max(s, y);
              aux3[i] = y;
            }
            int w = 0;
            for (int i = 1; i <= t; ++i) {
              if (aux3[i] == s) {
                ++w;
                aux4 = ensureAuxSpace(aux4, ++ctr3);
                aux4[ctr3] = aux2[i];
              }
            }
            aux1[ctr2] = w;
          }
        }
      } else {
        break;  // all possibilities have been examined
      }
    }
    copy(savelabel, savemap, label, map);
    return code;
  }

  private static GraphCode getGraphCode(final Graph<?, ?> a, final int[][] adj) {
    final GraphCode code = a.getGraphCode();
    if (code == null) {
      final GraphCode c = isomorphicCode(adj, a.order());
      a.setGraphCode(c);
      return c;
    }
    return code;
  }

  /*
   * Presupposes that basic checks like size and order and degree sequence
   * have already been performed.
   */
  static <V, E, U, F> boolean isIsomorphic(final Graph<V, E> a, final Graph<U, F> b) {
    return isomorphism(a, b) != null;
  }

  /*
   * Presupposes that basic checks like size and order and degree sequence
   * have already been performed.
   */
  static <V, E, U, F> Graph<Pair<V, U>, Pair<E, F>> isomorphism(final Graph<V, E> a, final Graph<U, F> b) {
    assert a.order() == b.order();
    // zeroth elements are not used in the following
    final HashMap<Vertex<V, E>, Integer> codesA = new HashMap<>();
    final int[][] adjA = adjacencyMatrix(a, codesA);
    final HashMap<Vertex<U, F>, Integer> codesB = new HashMap<>();
    final int[][] adjB = adjacencyMatrix(b, codesB);

    final GraphCode codeA = getGraphCode(a, adjA);
    final GraphCode codeB = getGraphCode(b, adjB);
    if (codeA.same(codeB)) {
      // If we reach here, then an isomorphism has been found. It remains to
      // actually return that vertex pairing to the caller.

      // Construct the mapping graph
      final Graph<Pair<V, U>, Pair<E, F>> r = new Graph<>();
      // Invert the mapping codes
      final Vertex<V, E>[] vertexA = invertMapping(codesA);
      final Vertex<U, F>[] vertexB = invertMapping(codesB);
      // Construct pairings of vertices
      for (int j = 1; j < codeA.mMap.length; ++j) {
        r.addVertex(new Pair<>(vertexA[codeA.mMap[j]].label(), vertexB[codeB.mMap[j]].label()));
      }
      return r;
    } else {
      return null;
    }
  }
}
