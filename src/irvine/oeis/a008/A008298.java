package irvine.oeis.a008;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008298 Triangle of D'Arcais numbers.
 * @author Sean A. Irvine
 */
public class A008298 extends MemoryFunction1<Polynomial<Z>> implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int n) {
    if (n == 0) {
      return RING.one();
    }
    Polynomial<Z> sum = RING.zero();
    for (int k = 1; k <= n; ++k) {
      sum = RING.add(sum, RING.multiply(get(n - k).shift(1), mF.factorial(n - 1).divide(mF.factorial(n - k)).multiply(Cheetah.factor(k).sigma())));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN).coeff(mM);
  }
}
