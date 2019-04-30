package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003725 E.g.f.: <code>exp( x * exp(-x) )</code>.
 * @author Sean A. Irvine
 */
public class A003725 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).multiply(Z.valueOf(-k).pow(mN - k)));
    }
    return s;
  }
}
