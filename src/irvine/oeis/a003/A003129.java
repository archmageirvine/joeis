package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003129 Number of transfer impedances of <code>an</code> n-terminal network.
 * @author Sean A. Irvine
 */
public class A003129 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(Binomial.binomial(Binomial.binomial(k, 2).longValueExact(), 2).multiply(Stirling.secondKind(mN, k)));
    }
    return s;
  }
}

