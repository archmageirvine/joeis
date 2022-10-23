package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059715 Number of multi-directed animals on the triangular lattice.
 * @author Sean A. Irvine
 */
public class A059715 extends Sequence1 {

  // After Jean-Fran&ccedil;ois Alcover

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  private final MemoryFunctionInt2<Polynomial<Z>> mF = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int g, final int n) {
      if (n <= g) {
        return RING.one();
      }
      return RING.subtract(f(g, n - 1), f(g, n - g - 1).shift(1));
    }
  };

  private Polynomial<Z> f(final int g, final int n) {
    return mF.get(g, n);
  }

  private Polynomial<Z> p(final int g, final int n, final int m) {
    return RING.series(RING.one(), f(g, n), m);
  }

  private Polynomial<Z> c(final int g, final int n, final int m) {
    return RING.subtract(p(g, n, m),
      RING.sum(0, n - 1, k -> RING.multiply(c(g, k, m), p(g, n - k - 1, m), m)));
  }

  private Polynomial<Z> c(final int g, final int m) {
    return RING.sum(0, 2 * m, n -> c(g, n, m));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return RING.coeff(RING.one(), c(1, mN), mN).negate();
  }
}
