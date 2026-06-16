package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394082 Diagonal of the 4-dimensional geode array: a(n) = G(n,n,n,n).
 * @author Sean A. Irvine
 */
public class A394082 extends Sequence0 {

  // After Steven Kotlarz

  private int mN = -1;

  private Z c(final int m2, final int m3, final int m4, final int m5) {
    final int s = m2 + m3 + m4 + m5;
    final int l = m2 + 2 * m3 + 3 * m4 + 4 * m5 + 1;
    return Functions.FACTORIAL.z(s + l - 1)
      .divide(Functions.FACTORIAL.z(m2))
      .divide(Functions.FACTORIAL.z(m3))
      .divide(Functions.FACTORIAL.z(m4))
      .divide(Functions.FACTORIAL.z(m5))
      .divide(Functions.FACTORIAL.z(l));
  }

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ZERO;
    for (int i = 0; i <= mN; ++i) {
      for (int j = 0; j <= mN; ++j) {
        for (int k = 0; k <= mN; ++k) {
          final Z t = Binomial.multinomial(i + j + k, i, j, k).multiply(c(mN + 1 + i + j + k, mN - i, mN - j, mN - k));
          res = res.signedAdd(((i + j + k) & 1) == 0, t);
        }
      }
    }
    return res;
  }
}
