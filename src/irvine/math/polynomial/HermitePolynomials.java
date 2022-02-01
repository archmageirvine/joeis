package irvine.math.polynomial;

import irvine.math.MemoryFunction;
import irvine.math.group.PolynomialRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Hermite polynomials.
 * @author Sean A. Irvine
 */
public final class HermitePolynomials extends MemoryFunction<Integer, Polynomial<Z>> {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  {
    put(0, RING.one());
    put(1, Polynomial.create(0, 2));
  }

  @Override
  protected Polynomial<Z> compute(final Integer n) {
    return RING.subtract(RING.multiply(get(n - 1), Z.TWO).shift(1), RING.multiply(get(n - 2), Z.valueOf(2L * (n - 1))));
  }
}
