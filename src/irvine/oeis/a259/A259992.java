package irvine.oeis.a259;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A259992 Irregular triangle read by rows: T(n,k) = number of Havender tableaux of height 2 with n columns and k empty squares (n &gt;= 0, 0 &lt;= k &lt;= 2*n).
 * @author Sean A. Irvine
 */
public class A259992 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFactorial mF = new MemoryFactorial();

  private Z v(final int p, final int q) {
    Z sum = Z.ZERO;
    for (int j = Math.max(0, q - p); j <= q / 2; ++j) {
      sum = sum.add(mF.factorial(p)
        .multiply(mF.factorial(2 * q - 2 * j))
        .divide(mF.factorial(p - q + j))
        .divide(mF.factorial(j + 1))
        .divide(mF.factorial(q - j).square())
        .divide(mF.factorial(q - 2 * j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return v(mN, 2 * mN - mM);
  }
}
