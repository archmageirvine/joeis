package irvine.math.polynomial;

import irvine.math.MemoryFunction;
import irvine.math.group.PolynomialRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Meixner polynomials.
 * @author Sean A. Irvine
 */
public final class MeixnerPolynomials extends MemoryFunction<Integer, Polynomial<Z>> {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  {
    put(0, RING.one());
    put(1, RING.x());
  }

  @Override
  protected Polynomial<Z> compute(final Integer n) {
    return RING.subtract(get(n - 1).shift(1), RING.multiply(get(n - 2), Z.valueOf((n - 1L) * (n - 1L))));
  }
}
