package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.oeis.a003.A003294;

/**
 * A039664 Numbers k such that k^4 can be written as a sum of four positive 4th powers with no common factor.
 * @author Sean A. Irvine
 */
public class A039664 extends A003294 {

  @Override
  protected boolean isOk(final int a, final int b, final int c, final long u) {
    final int d = Functions.GCD.i(a, b);
    if (d == 1) {
      return true;
    }
    final int e = Functions.GCD.i(d, c);
    if (e == 1) {
      return true;
    }
    return Functions.GCD.l(e, u) == 1;
  }
}
