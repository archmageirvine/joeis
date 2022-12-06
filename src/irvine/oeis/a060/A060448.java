package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A060448 Each c(i) is "multiply" (*) or "divide" (/); d(1) = 1 &lt; d(2) &lt; ... &lt; d(m) = n are the divisors of n; a(n) is number of choices for c(1), ..., c(m-1) so that d(1) c(1) d(2) c(2) d(3), .., c(m-1) d(m) is an integer.
 * @author Sean A. Irvine
 */
public class A060448 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long[] d, final long selector) {
    Z u = Z.ONE;
    Z v = Z.ONE;
    for (int k = 0; k < d.length; ++k) {
      if ((selector & (1L << k)) != 0) {
        u = u.multiply(d[k]);
      } else {
        v = v.multiply(d[k]);
      }
    }
    return v.mod(u).isZero();
  }

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    final Z[] d = Jaguar.factor(mN).divisorsSorted();
    final long[] div = ZUtils.toLong(d);
    for (long selector = 1; selector < 1L << d.length; selector += 2) {
      if (is(div, selector)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
