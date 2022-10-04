package irvine.oeis.a059;

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059718 Triangle T(n,k), 0&lt;=k&lt;=n, giving coefficients when output sequence O_0, O_1, O_2, ... from transformation described in A059216 is expressed in terms of input sequence I_0, I_1, I_2, ...
 * @author Sean A. Irvine
 */
public class A059718 extends MemoryFunctionInt2<Polynomial<Z>> implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Polynomial<Z> compute(final int n, final int m) {
    if (n == 0) {
      return RING.one();
    }
    if ((n & 1) == 0) {
      if (m == n) {
        return RING.monomial(Z.ONE, n);
      }
      Polynomial<Z> sum = get(n, m + 1);
      for (int row = n - 1; row >= m; --row) {
        sum = RING.add(sum, get(row, m));
      }
      return sum;
    } else {
      if (m == 0) {
        return RING.monomial(Z.ONE, n);
      }
      Polynomial<Z> sum = get(n, m - 1);
      for (int row = n - 1; row >= 0 && m >= n - row; --row) {
        sum = RING.add(sum, get(row, m - (n - row)));
      }
      return sum;
    }
  }

  protected Z t(final int n, final int m) {
    return ((n & 1) == 0 ? get(n, 0) : get(n, n)).coeff(n - m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
