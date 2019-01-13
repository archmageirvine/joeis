package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A003028.
 * @author Sean A. Irvine
 */
public class A003028 extends A003030 {

  private int mN = 0;

  private Z i(final int k, final int n) {
    return Binomial.binomial(n, k).multiply(lambda(k, n - k)).multiply(s(k));
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(i(k, mN));
    }
    return s;
  }
}
