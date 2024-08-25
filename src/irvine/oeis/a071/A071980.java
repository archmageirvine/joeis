package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A071980 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    long mod = 1;
    while (mod <= mN) {
      mod *= 10;
      sum = sum.add(mN % mod);
    }
    long m = mN;
    while (mod > 0) {
      mod /= 10;
      m /= 10;
      sum = sum.add(m);
    }
    return sum;
  }
}
