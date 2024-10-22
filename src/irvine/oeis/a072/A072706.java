package irvine.oeis.a072;

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072706 Number of unimodal partitions/compositions of n into distinct terms.
 * @author Sean A. Irvine
 */
public class A072706 extends Sequence0 {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
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
    if (++mN == 0) {
      return Z.ONE;
    }
    return RING.eval(mB.get(mN, mN), Z.TWO).divide2();
  }
}
