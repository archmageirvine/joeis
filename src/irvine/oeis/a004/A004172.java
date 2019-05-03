package irvine.oeis.a004;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a028.A028296;

/**
 * A004172 Triangle of coefficients of Euler polynomials <code>E_2n(x)</code> (exponents in increasing order).
 * @author Sean A. Irvine
 */
public class A004172 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> E1 = RING.create(Arrays.asList(Q.HALF.negate(), Q.ONE));
  private int mN = -2;
  private int mM = 0;
  private Polynomial<Q> mEulerPolynomial = RING.zero();

  protected Polynomial<Q> eulerPolynomial(final int n) {
    final A028296 eulerNumbers = new A028296();
    Polynomial<Q> ep = RING.zero();
    for (int k = 0; k <= n; k += 2) {
      final Q coeff = new Q(eulerNumbers.next().multiply(Binomial.binomial(n, k)), Z.ONE.shiftLeft(k));
      final Polynomial<Q> t = RING.multiply(RING.pow(E1, n - k), coeff);
      ep = RING.add(ep, t);
    }
    return ep;
  }

  @Override
  public Z next() {
    if (++mM > mEulerPolynomial.degree()) {
      mN += 2;
      mM = 0;
      mEulerPolynomial = eulerPolynomial(mN);
    }
    return mEulerPolynomial.coeff(mM).toZ();
  }
}
