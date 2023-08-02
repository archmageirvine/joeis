package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A005333 Number of 2-colored connected labeled graphs with n vertices of the first color and n vertices of the second color.
 * @author Sean A. Irvine
 */
public class A005333 extends MemoryFunction2Sequence<Integer, Z> {

  /** Construct the sequence. */
  public A005333() {
    super(1);
  }

  private int mN = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return m == 1 ? Z.ONE : Z.ZERO;
    }
    if (m > n) {
      return get(m, n);
    }
    Z sum = Z.ONE.shiftLeft((long) n * m);
    for (int a = 1; a <= n; ++a) {
      final Z ba = Binomial.binomial(n - 1, a - 1);
      for (int b = 0; b <= m; ++b) {
        if (a < n || b < m) {
          sum = sum.subtract(ba.multiply(Binomial.binomial(m, b)).multiply(get(a, b)).shiftLeft((long) (n - a) * (m - b)));
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
