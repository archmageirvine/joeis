package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000037;

/**
 * A066207.
 * @author Sean A. Irvine
 */
public class A066214 extends A000037 {

  private boolean is(final long n, final long[] divs, final int pos) {
    if (n == 0) {
      return true;
    }
    for (int k = pos; k < divs.length; ++k) {
      final long s = divs[k] * divs[k];
      if (s <= n && is(n - s, divs, k + 1)) {
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
