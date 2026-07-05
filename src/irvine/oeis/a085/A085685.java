package irvine.oeis.a085;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A085685 Triangle read by rows: T(n,k), n &gt;= 0, 0 &lt;= k &lt;= n, is size of maximal 1-transposition-correcting code formed using binary vectors of length n and weight k. The end-around transposition is allowed.
 * @author Sean A. Irvine
 */
public class A085685 extends AbstractSequence {

  private int mN = 0;
  private int mM = -1;

  protected A085685(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A085685() {
    this(0);
  }

  private void block(final Graph g, final long[] forbidden, final int u) {
    for (int w = g.nextVertex(u, -1); w >= 0; w = g.nextVertex(u, w)) {
      ++forbidden[w];
      for (int x = g.nextVertex(w, u); x >= 0; x = g.nextVertex(w, x)) {
        ++forbidden[x];
      }
    }
  }

  private void clear(final Graph g, final long[] forbidden, final int u) {
    for (int w = g.nextVertex(u, -1); w >= 0; w = g.nextVertex(u, w)) {
      --forbidden[w];
      for (int x = g.nextVertex(w, u); x >= 0; x = g.nextVertex(w, x)) {
        --forbidden[x];
      }
    }
  }

  private long t(final Graph g, final int v, final long[] forbidden, final long cnt) {
    long c = cnt;
    for (int u = v + 1; u < g.order(); ++u) {
      if (forbidden[u] == 0) {
        block(g, forbidden, u);
        c = Math.max(c, t(g, u, forbidden, cnt + 1));
        clear(g, forbidden, u);
      }
    }
    return c;
  }

  protected long t(Graph g) {
    // WLOG assume vertex 0 is in the set
    final long[] forbidden = new long[g.order()];
    block(g, forbidden, 0);
    return t(g, 0, forbidden, 1);
  }

  protected long t(final int n, final int k) {
    if (k == 0) {
      return 1;
    }
    final Graph g = GraphFactory.create(Binomial.binomial(n, Math.min(k, n - k)).intValueExact());
    final ArrayList<Z> vecs = new ArrayList<>();
    Z t = Z.ONE.shiftLeft(k).subtract(1);
    for (int j = 0; j < g.order(); ++j, t = Functions.SWIZZLE.z(t)) {
      vecs.add(t);
    }
    // Add edges
    final Z wrap = Z.ONE.shiftLeft(n - 1).setBit(0);
    for (int i = 0; i < g.order(); ++i) {
      final Z u = vecs.get(i);
      for (int j = i + 1; j < g.order(); ++j) {
        final Z v = vecs.get(j);
        final Z x = u.xor(v);
        if (x.equals(wrap) || x.makeOdd().equals(Z.THREE)) {
          g.addEdge(i, j);
        }
      }
    }
    return t(g);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(t(mN, mM));
  }
}
