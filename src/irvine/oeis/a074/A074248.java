package irvine.oeis.a074;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074248 Triangle of coefficients, read by rows of (2n+1) terms, where the n-th row forms a polynomial in x, P(n,x), of degree 2n and satisfies: P(n,x) = [Sum_{k=1..n} 1/(k + x + x^2)]*[Product_{k=1..n} (k + x + x^2)].
 * @author Sean A. Irvine
 */
public class A074248 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private Polynomial<Z> mP = RING.zero();

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      ++mN;
      mM = 0;
      final Polynomial<Z> prod = RING.product(1, mN, k -> Polynomial.create(k, 1, 1));
      mP = RING.sum(1, mN, k -> RING.series(prod, Polynomial.create(k, 1, 1), 2 * mN - 2));
    }
    return mP.coeff(mM);
  }
}
