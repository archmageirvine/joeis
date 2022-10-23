package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003725 E.g.f.: exp( x * exp(-x) ).
 * @author Sean A. Irvine
 */
public class A003725 extends Sequence0 {

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
