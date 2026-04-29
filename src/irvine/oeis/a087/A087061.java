package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087061 Array A(n, k) = lunar sum n + k (n &gt;= 0, k &gt;= 0) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A087061 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  static Z lunarAdd(Z s, Z t) {
    Z res = Z.ZERO;
    Z mul = Z.ONE;
    while (!s.isZero() || !t.isZero()) {
      final Z[] qrs = s.divideAndRemainder(Z.TEN);
      final Z[] qrt = t.divideAndRemainder(Z.TEN);
      res = res.add(qrs[1].max(qrt[1]).multiply(mul));
      s = qrs[0];
      t = qrt[0];
      mul = mul.multiply(10);
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return lunarAdd(Z.valueOf(mN - mM), Z.valueOf(mM));
  }
}
