package irvine.oeis.a068;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068944 Highest power of 9 dividing A068943(n) for n&gt;0.
 * @author Sean A. Irvine
 */
public class A068944 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z cnt = Z.ZERO;
    for (long m = 1; m <= mN; ++m) {
      long t = mN - m + 1;
      long u = 0;
      while (t % 3 == 0) {
        ++u;
        t /= 3;
      }
      if (u > 0) {
        cnt = cnt.add(Binomial.binomial(m + mN - 2, m - 1).multiply(u));
      }
    }
    return cnt.divide2();
  }
}

