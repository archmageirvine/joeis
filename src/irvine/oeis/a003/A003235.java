package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003235.
 * @author Sean A. Irvine
 */
public class A003235 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    ++mN;
    for (long k = 0; k <= mN; ++k) {
      s = s.signedAdd(((mN - k) & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial(k * k, mN)));
    }
    return s;
  }
}
