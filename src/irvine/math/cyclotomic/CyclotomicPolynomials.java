package irvine.math.cyclotomic;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction1;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Cached computation of cyclotomic polynomials.
 * @author Sean A. Irvine
 */
public final class CyclotomicPolynomials extends MemoryFunction1<Polynomial<Z>> {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  @Override
  protected Polynomial<Z> compute(final int n) {
    Polynomial<Z> den = RING.one();
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d < n) {
        den = RING.multiply(den, get(d));
      }
    }
    return RING.divide(RING.negate(RING.oneMinusXToTheN(n)), den);
  }

  /**
   * Return the inverse cyclotomic polynomial of specified degree.
   * @param n degree
   * @return inverse cyclotomic polynomial
   */
  public Polynomial<Z> inverse(final int n) {
    final Polynomial<Z> inv = RING.series(RING.one(), get(n), n - 1);
    // Even though we asked for n terms there can be trailing zeros, so we need
    // to explicitly add those zeros back in before passing to periodic generation.
    while (inv.size() < n) {
      inv.add(Z.ZERO);
    }
    return inv;
  }
}

