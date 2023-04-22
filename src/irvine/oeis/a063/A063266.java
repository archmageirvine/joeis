package irvine.oeis.a063;

import irvine.math.MemoryFunction1;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063266 Coefficient array for certain numerator polynomials N7(n,x), n &gt;= 0 (rising powers of x).
 * @author Sean A. Irvine
 */
public class A063266 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, -1);
  private int mN = 0;
  private int mM = -1;

  private final MemoryFunction1<Polynomial<Z>> mB = new MemoryFunction1<>() {

    private int c(final int n) {
      return n % 6 == 0 ? 5 : n % 6 - 1;
    }

    private int b(final int n, final int j) {
      return 1 <= j && j <= n ? 1 : 0;
    }

    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n <= 5) {
        return RING.one();
      }
      return RING.sum(1, 6, j -> RING.multiply(RING.pow(C, j - 1), get(n - j)).shift(b(c(n), j)));
    }
  };

  @Override
  public Z next() {
    if (++mM > mB.get(mN).degree()) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN).coeff(mM);
  }
}
