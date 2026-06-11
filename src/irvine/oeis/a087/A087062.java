package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087062 Array T(n,k) = lunar product n*k (n &gt;= 1, k &gt;= 1) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A087062 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  static Z lunarMul(final Z s, Z t) {
    Z res = Z.ZERO;
    Z m = Z.ONE;
    final String str = s.toString();
    final int lim = Functions.DIGIT_LENGTH.i(t);
    for (int i = 0; i < lim; ++i) {
      final long c = t.mod(10);
      Z u = Z.ZERO;
      for (int j = 0; j < str.length(); ++j) {
        u = u.multiply(10).add(Math.min(c, str.charAt(j) - '0'));
      }
      res = A087061.lunarAdd(res, u.multiply(m));
      t = t.divide(10);
      m = m.multiply(10);
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return lunarMul(Z.valueOf(mN - mM + 1), Z.valueOf(mM + 1));
  }
}
