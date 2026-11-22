package irvine.oeis.a333;

import java.util.Map;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a295.A295193;

/**
 * A333158 Irregular triangle read by rows: T(n,k) is the number of k-regular graphs on n labeled nodes with loops allowed, n &gt;= 1, 0 &lt;= k &lt;= n + 1.
 * @author Gregory Morse
 */
public class A333158 extends A295193 {
  private int mN = 0;
  private int mK = 0;
  private Polynomial<Z> mRow;

  protected final Polynomial<Z> counts(final int n) {
    final int limit = (n + 1) / 2;
    final Map<Polynomial<Z>, Z> degrees = graphsByDegreeSeq(n, limit, (p, r) -> p.degree() - valuation(p) <= r + 2);
    Polynomial<Z> sum = RING.zero();
    for (final Map.Entry<Polynomial<Z>, Z> e : degrees.entrySet()) {
      final Polynomial<Z> p = e.getKey();
      final int d = p.degree();
      // A loop contributes two to the degree; the loop set is then determined.
      if (p.coeff(d).add(p.coeff(d - 2)).intValueExact() == n) {
        sum = RING.add(sum, RING.monomial(e.getValue(), d));
      }
      if (d + 2 <= limit && p.coeff(d).intValueExact() == n) {
        sum = RING.add(sum, RING.monomial(e.getValue(), d + 2));
      }
    }
    for (int k = 0; k <= limit && 2 * k < n + 1; ++k) {
      sum = RING.add(sum, RING.monomial(sum.coeff(k), n + 1 - k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mK > mN + 1 || mRow == null) {
      mRow = counts(++mN);
      mK = 0;
    }
    return mRow.coeff(mK);
  }
}
