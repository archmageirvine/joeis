package irvine.oeis.a350;

import irvine.math.function.Functions;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a057.A057273;

/**
 * A350731 Triangle read by rows: T(n,k) is the number of strongly connected oriented graphs on n labeled nodes with k arcs, n &gt;= 1, k=0..n*(n-1)/2.
 * @author Gregory Morse
 */
public class A350731 extends A057273 {
  private static final Polynomial<Q> E = RING_Y.onePlusXToTheN(1);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mRow;

  @Override
  protected Polynomial<Polynomial<Q>> digraphEgf(final int n, final int m, final Polynomial<Q> e) {
    // An unordered pair is absent or has one of two orientations.
    final Polynomial<Q> edge = RING_Y.subtract(RING_Y.multiply(e, Q.TWO), RING_Y.one());
    final Polynomial<Polynomial<Q>> egf = RING.empty();
    for (int k = 0; k <= n; ++k) {
      egf.add(RING_Y.divide(RING_Y.pow(edge, (long) k * (k - 1) / 2, m), new Q(Functions.FACTORIAL.z(k))));
    }
    return egf;
  }

  protected Polynomial<Q> row(final int n, final int m, final Polynomial<Q> e) {
    return strongD(n, m, e).coeff(n);
  }

  @Override
  public Z next() {
    if (++mM > (long) mN * (mN - 1) / 2) {
      ++mN;
      mM = 0;
      mRow = row(mN, mN * (mN - 1) / 2, E);
    }
    return mRow.coeff(mM).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
