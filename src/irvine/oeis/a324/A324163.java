package irvine.oeis.a324;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a059.A059441;

/**
 * A324163 Triangle read by rows: T(n,k) is the number of connected k-regular simple graphs on n labeled vertices, (0 &lt;= k &lt; n).
 * @author Gregory Morse
 */
public class A324163 extends A059441 {
  private int mN = 0;
  private int mK = 0;
  private final MemoryFunction1<Polynomial<Z>> mAll = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      return regularRow(n);
    }
  };
  private final MemoryFunctionInt2<Z> mConnected = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      Z sum = mAll.get(n).coeff(k);
      for (int j = k + 1; j < n; ++j) {
        sum = sum.subtract(get(j, k).multiply(mAll.get(n - j).coeff(k)).multiply(Binomial.binomial(n - 1, j - 1)));
      }
      return sum;
    }
  };

  protected final Z connected(final int n, final int k) {
    return mConnected.get(n, k);
  }

  @Override
  public Z next() {
    if (++mK >= mN) {
      ++mN;
      mK = 0;
    }
    return connected(mN, mK);
  }
}
