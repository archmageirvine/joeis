package irvine.oeis.a013;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013699 Degree of variety K_{2,n}^2.
 * @author Sean A. Irvine
 */
public class A013699 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  private Z k(final int n, final int q) {
    Z sum = Z.ZERO;
    final Z a = mF.factorial(2 * n + n * q + 2 * q);
    for (int j = 0; j <= q; ++j) {
      sum = sum.add(a.multiply(Z.valueOf(q - 2 * j).multiply(n + 2).add(1))
      .divide(mF.factorial(n + j * (n + 2)))
      .divide(mF.factorial(n + 1 + (q - j) * (n + 2))));
    }
    return sum.abs();
  }

  protected int q() {
    return 2;
  }

  @Override
  public Z next() {
    return k(++mN, q());
  }
}
