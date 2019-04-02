package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003161 A binomial coefficient sum.
 * @author Sean A. Irvine
 */
public class A003161 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      s = s.add(Binomial.binomial(mN, k).subtract(Binomial.binomial(mN, k - 1)).pow(3));
    }
    return s;
  }
}
