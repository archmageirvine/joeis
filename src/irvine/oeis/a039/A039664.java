package irvine.oeis.a039;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.oeis.a003.A003294;

/**
 * A039664 Numbers k such that k^4 can be written as a sum of four positive 4th powers with no common factor.
 * @author Sean A. Irvine
 */
public class A039664 extends A003294 {

  @Override
  protected boolean isOk(final int a, final int b, final int c, final long u) {
    final int d = IntegerUtils.gcd(a, b);
    if (d == 1) {
      return true;
    }
    final int e = IntegerUtils.gcd(d, c);
    if (e == 1) {
      return true;
    }
    return LongUtils.gcd(e, u) == 1;
  }
}
