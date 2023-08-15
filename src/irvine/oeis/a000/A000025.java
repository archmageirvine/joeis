package irvine.oeis.a000;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000025 Coefficients of the 3rd-order mock theta function f(q).
 * @author Sean A. Irvine
 */
public class A000025 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000025(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000025() {
    super(0);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int h = IntegerUtils.sqrt(mN);
    Z c = Z.ZERO;
    for (int k = 1; k <= h; ++k) {
      Polynomial<Z> den = RING.add(RING.one(), RING.monomial(Z.ONE, mN - k * k + 1));
      for (int j = 1; j <= k; ++j) {
        den = RING.multiply(den, RING.add(RING.one(), RING.monomial(Z.ONE, j)));
      }
      c = c.add(RING.coeff(RING.monomial(Z.ONE, k * k), RING.pow(den, 2), mN));
    }
    return c;
  }
}

