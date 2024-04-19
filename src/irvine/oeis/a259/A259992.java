package irvine.oeis.a259;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A259992 Irregular triangle read by rows: T(n,k) = number of Havender tableaux of height 2 with n columns and k empty squares (n &gt;= 0, 0 &lt;= k &lt;= 2*n).
 * @author Sean A. Irvine
 */
public class A259992 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z v(final int p, final int q) {
    Z sum = Z.ZERO;
    for (int j = Math.max(0, q - p); j <= q / 2; ++j) {
      sum = sum.add(Functions.FACTORIAL.z(p)
        .multiply(Functions.FACTORIAL.z(2 * q - 2 * j))
        .divide(Functions.FACTORIAL.z(p - q + j))
        .divide(Functions.FACTORIAL.z(j + 1))
        .divide(Functions.FACTORIAL.z(q - j).square())
        .divide(Functions.FACTORIAL.z(q - 2 * j)));
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
