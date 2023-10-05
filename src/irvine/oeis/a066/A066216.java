package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a007.A007412;

/**
 * A066207.
 * @author Sean A. Irvine
 */
public class A066216 extends A007412 {

  private boolean is(final long n, final long[] divs, final int pos) {
    if (n == 0) {
      return true;
    }
    for (int k = pos; k < divs.length; ++k) {
      final long c = divs[k] * divs[k] * divs[k];
      if (c <= n && is(n - c, divs, k + 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (is(n.longValueExact(), ZUtils.toLong(Jaguar.factor(n).divisors()), 0)) {
        return n;
      }
    }
  }
}
