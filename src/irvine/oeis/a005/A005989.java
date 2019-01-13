package irvine.oeis.a005;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005989.
 * @author Sean A. Irvine
 */
public class A005989 extends MemoryFunction1<Polynomial<Z>> implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = RING.onePlusXToTheN(Z.ONE, 1);
  private int mN = 0;

  @Override
  protected Polynomial<Z> compute(final int n) {
    assert n >= 0;
    if (n == 0) {
      return RING.x();
    }
    return RING.subtract(RING.substitute(get(n - 1), X1, Integer.MAX_VALUE), get(n - 1)).shift(2);
  }

  @Override
  public Z next() {
    return RING.eval(get(++mN), Z.TWO).divide(4);
  }
}
