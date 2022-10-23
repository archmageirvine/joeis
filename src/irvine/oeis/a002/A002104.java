package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002104 Logarithmic numbers.
 * @author Sean A. Irvine
 */
public class A002104 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      if (k > 1) {
        f = f.multiply(k);
      }
      s = s.add(Binomial.binomial(mN, mN - k - 1).multiply(f));
    }
    return s;
  }
}
