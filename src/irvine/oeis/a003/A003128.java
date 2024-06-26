package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003128 Number of driving-point impedances of an n-terminal network.
 * @author Sean A. Irvine
 */
public class A003128 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(Binomial.binomial(k, 2).multiply(Functions.STIRLING2.z(mN, k)));
    }
    return s;
  }
}

