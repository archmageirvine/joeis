package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003022.
 * @author Sean A. Irvine
 */
public class A387866 extends Sequence1 {

  private long mN = 10;

  private Z prod(final String s, final int a, final int b) {
    Z prod = Z.ONE;
    for (int k = a; k < b; ++k) {
      prod = prod.multiply(s.charAt(k) - '0');
      if (prod.isZero()) {
        return Z.ZERO;
      }
    }
    return prod;
  }

  private boolean is(final long n) {
    final String s = String.valueOf(n);
    for (int k = 1; k < s.length(); ++k) {
      if (prod(s, 0, k).equals(prod(s, k, s.length()))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
