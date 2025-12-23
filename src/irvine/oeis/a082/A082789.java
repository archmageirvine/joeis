package irvine.oeis.a082;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.graph.GraphUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082789 Number of nonisomorphic configurations of n triples in Steiner triple systems.
 * @author Sean A. Irvine
 */
public class A082789 extends Sequence1 {

  // This code can find up to a(8) is less than a day

  private final HashSet<Graph> mGraphs = new HashSet<>();
  private long[] mTriples;
  private int mN = 0;

  private boolean ok(final long[] triples, final int pos, final long v) {
    for (int k = 0; k < pos; ++k) {
      if (Long.bitCount(triples[k] & v) > 1) {
        return false;
      }
    }
    return true;
  }

  private Graph createGraph(final int nv) {
    // Vertices 0..(nv-1) are the labels of the individual triple elements
    // Vertices nv..nv+n-1 represent the triples themselves
    final Graph g = GraphFactory.create(nv + mN);
    for (int k = 0; k < mN; ++k) {
      final long s = mTriples[k];
      long bj = 1;
      for (int j = 0; bj <= s; ++j, bj <<= 1) {
        if ((s & bj) != 0) {
          g.addEdge(j, nv + k); // Links for specific triple
          long bi = 1;
          for (int i = 0; i < j; ++i, bi <<= 1) {
            if ((s & bi) != 0) {
              g.addEdge(i, j); // Within triple links
            }
          }
        }
      }
    }
    return GraphUtils.canon(g);
  }

  protected boolean accept(final long[] triples) {
    return true;
  }

  private void search(final int pos, final long used, final int nv) {
    if (pos == mN) {
      if (accept(mTriples)) {
        mGraphs.add(createGraph(nv));
      }
      return;
    }

    final long lim = 1L << (nv + 3);
    for (long s = mTriples[pos - 1]; s < lim; s = Functions.SWIZZLE.l(s)) {
      if (Predicates.POWER_OF_TWO.is((used | s) + 1) && ok(mTriples, pos, s)) {
        mTriples[pos] = s;
        search(pos + 1, used | s, Math.max(nv, Functions.DIGIT_LENGTH.i(2, s)));
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mGraphs.clear();
    mTriples = new long[mN];
    mTriples[0] = 0b111; // WLOG first triple is 0,1,2
    search(1, 0b111L, 3);
    return Z.valueOf(mGraphs.size());
  }
}
