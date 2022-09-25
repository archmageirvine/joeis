package irvine.oeis.a059;

import java.util.Map;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a295.A295193;

/**
 * A059441 Triangle T(n,k) (n &gt;= 1, 0 &lt;= k &lt;= n-1) giving number of regular labeled graphs with n nodes and degree k, read by rows.
 * @author Sean A. Irvine
 */
public class A059441 extends A295193 {

  // After Andrew Howroyd

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mGf = null;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      final Map<Polynomial<Z>, Z> m = graphsByDegreeSeq(++mN, (mN - 1) / 2, (p, r) -> p.degree() - valuation(p) <= r);
      Polynomial<Z> sum = RING.zero();
      for (final Map.Entry<Polynomial<Z>, Z> e : m.entrySet()) {
        final Polynomial<Z> p = e.getKey();
        final int d = p.degree();
        if (p.leadingCoeff().intValueExact() == mN) {
          Polynomial<Z> xd = RING.monomial(Z.ONE, d);
          if (2 * d != mN - 1) {
            xd = RING.add(xd, RING.monomial(Z.ONE, mN - 1 - d));
          }
          sum = RING.add(sum, RING.multiply(xd, e.getValue()));
        }
      }
      mGf = sum;
      mM = 0;
    }
    return mGf.coeff(mM);
  }
}
