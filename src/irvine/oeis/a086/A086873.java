package irvine.oeis.a086;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086873 Triangle read by rows in which row n &gt;= 1 gives coefficients in expansion of the polynomial Sum_{k=1..n} (1/n) * binomial(n,k) * binomial(n,k-1) * x^(2k) * (1+x)^(2n-2k) / x^2 in powers of x.
 * @author Sean A. Irvine
 */
public class A086873 extends Sequence1 {

  private static final PolynomialRing<Q> RING = new PolynomialRing<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X1 = RING.onePlusXToTheN(1);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Q> mS = null;

  @Override
  public Z next() {
    if (++mM >= 2 * mN - 1) {
      ++mN;
      mM = 0;
      mS = RING.zero();
      for (int k = 1; k <= mN; ++k) {
        final Q c = new Q(Binomial.binomial(mN, k).multiply(Binomial.binomial(mN, k - 1)), mN);
        mS = RING.add(mS, RING.multiply(RING.monomial(c, 2 * k), RING.pow(X1, 2L * mN - 2L * k)));
      }
      mS = mS.shift(-2);
    }
    return mS.coeff(mM).toZ();
  }
}

