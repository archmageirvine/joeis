package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003169.
 * @author Sean A. Irvine
 */
public class A003169 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(3 * mN - k - 2, mN - k - 1)));
    }
    return s.divide(mN);
  }
}
