package irvine.oeis.a395;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a397.A397711;
import irvine.oeis.triangle.Triangle;

/**
 * A395247 Triangle read by rows: T(n,k) is the number of acyclic digraphs (or DAGs) on n labeled nodes in which the maximum in-degree is k, for n &gt;= 0 and 0 &lt;= k &lt;= n.
 * @author Gregory Morse
 */
public class A395247 extends Triangle {
  private static final class Bounded extends A397711 {
    private Bounded(final int k) {
      super(k);
    }
  }

  private final MemoryFunction1<DirectSequence> mCounts = new MemoryFunction1<>() {
    @Override
    protected DirectSequence compute(final int k) {
      return DirectSequence.create(new Bounded(k));
    }
  };

  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 ? Z.ONE : mCounts.get(k).a(n).subtract(mCounts.get(k - 1).a(n));
  }
}
