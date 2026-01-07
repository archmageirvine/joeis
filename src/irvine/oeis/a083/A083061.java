package irvine.oeis.a083;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083061 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(1, 3, 2);
  private int mN = 0;
  private int mM = -1;
  private final MemoryFunction1<Polynomial<Z>> mB = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 0) {
        return RING.one();
      }
      return RING.subtract(RING.multiply(RING.substitute(get(n - 1), RING.onePlusXToTheN(1)), C1), RING.multiply(get(n - 1), Z.TWO).shift(2));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN).coeff(mM);
  }
}

