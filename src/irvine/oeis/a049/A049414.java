package irvine.oeis.a049;

import irvine.math.MemoryFunction2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a003.A003030;

/**
 * A049414 Number of quasi-initially connected digraphs with n labeled nodes.
 * @author Sean A. Irvine
 */
public class A049414 extends A003030 {

  private int mN = 0;

  private final MemoryFunctionInt3<Z> mLambda = new MemoryFunctionInt3<Z>() {
    @Override
    protected Z compute(final int k, final int n, final int m) {
      if (m == 0) {
        return Z.ONE;
      }
      Z sum = lambda(k, m).shiftLeft(m * n);
      for (int i = 0; i < m; ++i) {
        sum = sum.subtract(Binomial.binomial(m, i).multiply(lambda(k + i, m - i)).multiply(get(k, n, i)));
      }
      return sum;
    }
  };

  protected Z lambdaBar(final int i, final int j, final int k) {
    return k == 0 ? Z.ONE.shiftLeft(i * j).subtract(1) : mLambda.get(i, j, k).shiftLeft(i * j);
  }

  private final MemoryFunction2<Integer, Z> mAlpha = new MemoryFunction2<Integer, Z>() {
    @Override
    protected Z compute(final Integer n, final Integer i) {
      if (n.equals(i)) {
        return s(n);
      }
      Z sum = lambda(i, n - i);
      for (int j = 1; j <= n - i; ++j) {
        Z s = Z.ZERO;
        for (int k = 0; k <= n - i - j; ++k) {
          s = s.add(Binomial.binomial(n - i - j, k).shiftLeft(k * (n - j - k)).multiply(lambdaBar(j, i, n - i - j - k)).multiply(mAlpha.get(j + k, j)));
        }
        sum = sum.subtract(s.multiply(Binomial.binomial(n - i, j)));
      }
      return sum.multiply(s(i));
    }
  };

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 1; i <= mN; ++i) {
      Z s = Z.ZERO;
      for (int j = 0; j <= mN - i; ++j) {
        s = s.add(Binomial.binomial(mN - i, j).shiftLeft(j * (mN - i - j)).multiply(lambda(i, mN - i - j)).multiply(mAlpha.get(i + j, i)));
      }
      sum = sum.add(s.multiply(Binomial.binomial(mN, i)));
    }
    return sum;
  }
}
