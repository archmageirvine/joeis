package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000222 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A000222 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> BASE = Polynomial.create(-1, 1);

  // This will be useful for other sequences based on A058057
  Polynomial<Z> menageHitPolynomial(final int n) {
    Polynomial<Z> p = RING.zero();
    for (int k = 0; k <= n; ++k) {
      final long u = 2L * n - k;
      final Z m = Binomial.binomial(u, k).multiply(Functions.FACTORIAL.z(n - k));
      p = RING.add(p, RING.multiply(RING.pow(BASE, k), m));
    }
    return p;
  }

  private int mN = -1;

  @Override
  public Z next() {
    return menageHitPolynomial(++mN).coeff(2);
  }
}
