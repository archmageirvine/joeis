package irvine.oeis.a072;

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072705 Triangle of number of unimodal compositions of n into exactly k distinct terms.
 * @author Sean A. Irvine
 */
public class A072705 extends Sequence1 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i) {
      if (2 * n > i * (i + 1)) {
        return RING.zero();
      }
      if (n == 0) {
        return RING.one();
      }
      final Polynomial<Z> b = get(n, i - 1);
      return i <= n ? RING.add(b, get(n - i, i - 1).shift(1)) : b;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mN).coeff(mM).shiftLeft(mM - 1);
  }
}
