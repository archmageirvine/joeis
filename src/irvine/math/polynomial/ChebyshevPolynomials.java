package irvine.math.polynomial;

import irvine.math.MemoryFunction;
import irvine.math.group.PolynomialRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Chebyshev polynomials of the first kind.
 * @author Sean A. Irvine
 */
public final class ChebyshevPolynomials extends MemoryFunction<Integer, Polynomial<Z>> {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  private final int mKind;

  /**
   * Construct Chebyshev polynomials of a particular kind.
   * @param kind 1 or 2
   */
  public ChebyshevPolynomials(final int kind) {
    mKind = kind;
  }

  @Override
  protected Polynomial<Z> compute(final Integer n) {
    if (n <= 1) {
      return n == 0 ? RING.one() : RING.multiply(RING.x(), Z.valueOf(mKind));
    }
    return RING.subtract(RING.multiply(get(n - 1).shift(1), Z.TWO), get(n - 2));
  }
}
