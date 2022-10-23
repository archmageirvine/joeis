package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011772 Smallest number m such that m(m+1)/2 is divisible by n.
 * @author Sean A. Irvine
 */
public class A011772 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      if (m.multiply(m.add(1)).divide2().mod(mN) == 0) {
        return m;
      }
    }
  }
}
