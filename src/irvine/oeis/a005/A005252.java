package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005252 a(n) = Sum_{k=0..floor(n/4)} binomial(n-2k,2k).
 * @author Sean A. Irvine
 */
public class A005252 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 4; ++k) {
      sum = sum.add(Binomial.binomial(mN - 2 * k, 2 * k));
    }
    return sum;
  }
}

