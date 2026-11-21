package irvine.oeis.a369;

import irvine.math.MemoryFunction1;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a123.A123551;

/**
 * A369932 Triangle read by rows: T(n,k) is the number of unlabeled simple graphs with n edges and k vertices and without endpoints or isolated vertices.
 * @author Gregory Morse
 */
public class A369932 extends Sequence1 {
  private final A123551 mGraphs = new A123551();
  private int mN = 0;
  private int mK = 0;
  private final MemoryFunction1<Polynomial<Q>> mRows = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Q> compute(final int n) {
      final Polynomial<Q> row = Polynomial.create(n == 0 ? Q.ONE : Q.ZERO);
      Z previous = Z.ZERO;
      for (int k = 1; k <= n; ++k) {
        final Z count = mGraphs.endpointFree(k, n).coeff(n);
        row.add(new Q(count.subtract(previous)));
        previous = count;
      }
      return row;
    }
  };

  protected Polynomial<Q> graphCounts(final int n) {
    return mRows.get(n);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return graphCounts(mN).coeff(mK).toZ();
  }
}
