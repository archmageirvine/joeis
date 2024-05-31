package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A003129 Number of transfer impedances of an n-terminal network.
 * @author Sean A. Irvine
 */
public class A003129 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(Binomial.binomial(Binomial.binomial(k, 2).longValueExact(), 2).multiply(Functions.STIRLING2.z(mN, k)));
    }
    return s;
  }
}

