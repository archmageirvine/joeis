package irvine.oeis;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Convert a polynomial into a sequence.
 * @author Sean A. Irvine
 */
public class PolynomialSequence implements Sequence {

  private final Polynomial<Z> mP;
  private int mN = -1;

  /**
   * Construct a new polynomial backed sequence.
   * @param poly the polynomial
   */
  public PolynomialSequence(final Polynomial<Z> poly) {
    mP = poly;
  }

  @Override
  public Z next() {
    return ++mN > mP.degree() ? Z.ZERO : mP.coeff(mN);
  }
}
