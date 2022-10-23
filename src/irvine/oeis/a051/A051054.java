package irvine.oeis.a051;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051054 a(n) = Sum_{k=1..n} C(n, floor(n/k)).
 * @author Sean A. Irvine
 */
public class A051054 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, mN / k));
    }
    return sum;
  }
}
