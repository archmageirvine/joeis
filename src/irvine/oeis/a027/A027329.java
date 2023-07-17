package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026148;

/**
 * A027329 a(n) = self-convolution of row n of array T given by A026148.
 * @author Sean A. Irvine
 */
public class A027329 extends A026148 {

  /** Construct the sequence. */
  public A027329() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long lim = mN < 2 ? mN : mN + 2;
    for (long k = 0; k <= lim; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, lim - k)));
    }
    return sum;
  }
}
