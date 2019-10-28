package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026082;

/**
 * A027315 Self-convolution of array T given by <code>A026082</code>.
 * @author Sean A. Irvine
 */
public class A027315 extends A026082 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k).square());
    }
    return sum;
  }
}
