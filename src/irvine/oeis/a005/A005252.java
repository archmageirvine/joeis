package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005252 <code>a(n) = Sum_{k=0..floor(n/4)} binomial(n-2k,2k)</code>.
 * @author Sean A. Irvine
 */
public class A005252 implements Sequence {

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

