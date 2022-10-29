package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060177 Triangle of generalized sum of divisors function, read by rows.
 * @author Sean A. Irvine
 */
public class A060177 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 1;
  private int mM = -1;

  private final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i) {
      if (n == 0) {
        return RING.one();
      }
      if (i < 1) {
        return RING.zero();
      }
      return RING.add(get(n, i - 1), RING.sum(1, n / i, j -> get(n - i * j, i - 1)).shift(1));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mB.get(mN, mN).degree()) {
      ++mN;
      mM = 0;
    }
    final Polynomial<Z> b = mB.get(mN, mN);
    return b.coeff(b.degree() - mM);
  }
}
