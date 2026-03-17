package irvine.oeis.a084;

import irvine.math.cc.CC;
import irvine.math.cc.LambertW;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A084238 a(2) = 1, and for n &gt; 2 a(n) is the least k such that log(k) &lt; k^(1/n) and log(k-1) &gt;= (k-1)^(1/n).
 * @author Sean A. Irvine
 */
public class A084238 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ONE;
    }
    final CR x = CR.valueOf(new Q(-1, mN));
    final CR w = new CR() {
      @Override
      protected Z approximate(final int precision) {
        return LambertW.lambertW(new CC(x, CR.ZERO), -1, precision).re().getApprox(precision);
      }
    };
    return w.multiply(CR.valueOf(-mN)).exp().ceil();
  }
}
