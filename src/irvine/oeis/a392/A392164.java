package irvine.oeis.a392;

import java.util.List;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.MaximalCliques;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392164 a(n) is the size of the largest subset S of {1,...,N} such that every element of S+S is squarefree.
 * @author Sean A. Irvine
 */
public class A392164 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Graph g = GraphFactory.create(++mN);
    for (int k = 3; k <= mN; k += 2) {
      if (Predicates.SQUARE_FREE.is(k)) {
        for (int j = 1; j < k; j += 2) {
          if (Predicates.SQUARE_FREE.is(j) && Predicates.SQUARE_FREE.is(k + j)) {
            g.addEdge(k - 1, j - 1); // Move 1..n to 0..n in graph labels
          }
        }
      }
    }
    final List<Z> cliques = MaximalCliques.maximalCliques(g);
    int max = 0;
    for (final Z v : cliques) {
      max = Math.max(max, v.bitCount());
    }
    return Z.valueOf(max);
  }
}
