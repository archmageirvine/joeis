package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction1Sequence;

/**
 * A001516 Bessel polynomial {y_n}''(1).
 * @author Sean A. Irvine
 */
public class A001516 extends MemoryFunction1Sequence<Polynomial<Z>> {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  @Override
  protected Polynomial<Z> compute(final int n) {
    if (n <= 1) {
      return n == 0 ? RING.one() : RING.onePlusXToTheN(n);
    } else {
      return RING.add(get(n - 2), RING.multiply(get(n - 1).shift(1), Z.valueOf(2L * n - 1)));
    }
  }

  @Override
  public Z next() {
    return RING.eval(RING.diff(RING.diff(get(++mN))), Z.ONE);
  }

}
