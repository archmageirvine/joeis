package irvine.oeis.a390;

import java.util.List;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.MaximalCliques;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390645 Triangle read by rows: T(n,r) is maximal such that there exists a family F of subsets of {1,...,n} of size T(n,r) such that the intersection of no two sets in F has r elements.
 * @author Sean A. Irvine
 */
public class A390645 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private Z t(final int n, final int m) {
    if (m == n) {
      return Z.ONE.shiftLeft(n);
    }
    if (m == 0) {
      return Z.ONE.shiftLeft(n - 1);
    }
    if (n >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    final Graph g = GraphFactory.create(1 << n);
    for (int k = 1; k < 1 << n; ++k) {
      for (int j = 0; j < k; ++j) {
        if (Long.bitCount(k & j) != m) {
          g.addEdge(j, k);
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

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
