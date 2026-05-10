package irvine.oeis.a394;

import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.MaximalCliques;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394221 a(n) is the maximum size of a set family F on {1, 2, ..., n} such that for any pair of distinct sets S, T in F, there exists s in S and t in T such that |s - t| = 1.
 * @author Sean A. Irvine
 */
public class A394221 extends Sequence1 {

  private int mN = 0;

  private boolean is(final int k, final int j) {
    for (long i = 1; i <= k; i <<= 1) {
      if ((k & i) != 0 && ((j & (i << 1)) != 0 || (j & (i >>> 1)) != 0)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    final int size = 1 << mN;
    final Graph g = GraphFactory.create(size);
    for (int k = 0; k < size; ++k) {
      for (int j = 0; j < k; ++j) {
        if (is(k, j)) {
          g.addEdge(k, j);
        }
      }
    }
    int max = 0;
    for (final Z clique : MaximalCliques.maximalCliques(g)) {
      max = Math.max(max, clique.bitCount());
    }
    return Z.valueOf(max);
  }
}
