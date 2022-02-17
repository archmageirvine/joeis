package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054669 Triangular array T(n,k) giving the number of labeled even graphs with n nodes and k edges for n &gt;= 0 and 0 &lt;= k &lt;= n*(n-1-[0 == n mod 2])/2 (with no trailing zeros).
 * @author Sean A. Irvine
 */
public class A054669 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = 0;
  private int mM = -1;

  private int limit(final int n) {
    return n * (n - 2 + (n & 1)) / 2;
  }

  @Override
  public Z next() {
    if (++mM > limit(mN)) {
      final int lim = limit(++mN);
      mM = 0;
      final Polynomial<Z> t = RING.series(RING.oneMinusXToTheN(1), RING.onePlusXToTheN(1), lim);
      final Polynomial<Z> sum = RING.sum(0, mN, s -> RING.multiply(RING.pow(t, s * (mN - s), lim), Binomial.binomial(mN, s)));
      mA = RING.multiply(sum, RING.pow(RING.onePlusXToTheN(1), mN * (mN - 1) / 2, lim), lim);
    }
    return mA.coeff(mM).shiftRight(mN);
  }
}
