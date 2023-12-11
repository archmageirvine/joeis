package irvine.oeis.a047;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A047998 Triangle of numbers a(n,k) = number of "fountains" with n coins, k in the bottom row.
 *
 * @author Sean A. Irvine
 */
public class A047998 extends MemoryFunction2Sequence<Integer, Polynomial<Z>> {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final Integer n, final Integer m) {
    if (n == 0) {
      return RING.one();
    }
    Polynomial<Z> sum = RING.zero();
    for (int j = 1; j <= Math.min(m + 1, n); ++j) {
      sum = RING.add(sum, get(n - j, j).shift(1));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, 0).coeff(mM);
  }
}
