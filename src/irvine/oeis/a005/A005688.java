package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a102.A102541;

/**
 * A005688 Numbers of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005688 extends A102541 {

  {
    setOffset(5);
  }

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN - 1) / 3; ++k) {
      sum = sum.add(t(mN - k - 1, 2 * k));
    }
    return sum;
  }
}

