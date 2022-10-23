package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010759 Sum along upward diagonal of Pascal triangle from halfway point.
 * @author Sean A. Irvine
 */
public class A010759 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (mN + 2) / 4; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, k));
    }
    return sum;
  }
}
