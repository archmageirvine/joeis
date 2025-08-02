package irvine.oeis.a162;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A162500 Expansion of the polynomial (1-x^3) * (1-x^6) * (1-x^9) / (1-x)^3.
 * @author Georg Fischer
 */
public class A162500 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private static Z[][] build(final int pow) {
    final Z[] num;
    final Z[] den;
    Polynomial<Q> prod = RING.one();
    for (int k = 1; k <= pow; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(k * 3));
    }
    prod = RING.divide(prod, RING.pow(RING.oneMinusXToTheN(1), pow));
    final int deg = prod.degree();
    den = new Z[]{Z.ONE};
    num = new Z[deg + 1];
    for (int k = 0; k <= deg; ++k) {
      num[k] = prod.coeff(k).toZ();
    }
    return new Z[][] {num, den};
  }

  /** Construct the sequence. */
  public A162500() {
    this(3);
  }

  /**
   * Generic constructor with parameter
   * @param pow power of the dividend
   */
  public A162500(final int pow) {
    super(build(pow));
  }
}
