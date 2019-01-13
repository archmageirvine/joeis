package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005333.
 * @author Sean A. Irvine
 */
public class A005333 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    if (m > n) {
      return get(m, n);
    }
    Z sum = Z.ONE.shiftLeft(n * m);
    for (int a = 1; a <= n; ++a) {
      final Z ba = Binomial.binomial(n - 1, a - 1);
      for (int b = 0; b <= m; ++b) {
        if (a < n || b < m) {
          sum = sum.subtract(ba.multiply(Binomial.binomial(m, b)).multiply(get(a, b)).shiftLeft((n - a) * (m - b)));
        }
      }
    }
    return sum;
  }


  @Override
  public Z next() {
    ++mN;
    return get(mN, mN);
  }
}
