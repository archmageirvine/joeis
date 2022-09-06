package irvine.math.polynomial;

import irvine.math.MemoryFunction;
import irvine.math.group.PolynomialRing;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * Gandhi polynomials.
 * @author Sean A. Irvine
 */
public final class GandhiPolynomials extends MemoryFunction<Integer, Polynomial<Z>> {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = RING.onePlusXToTheN(1);
  {
    put(1, RING.one());
  }

  @Override
  protected Polynomial<Z> compute(final Integer n) {
    final Polynomial<Z> g = get(n - 1);
    return RING.multiply(RING.subtract(RING.multiply(RING.substitute(g, X1, Integer.MAX_VALUE), X1), g.shift(1)), X1);
  }
}
