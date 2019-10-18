package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026951 Self-convolution of array T given by <code>A026386</code>.
 * @author Sean A. Irvine
 */
public class A026951 extends A026386 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k)));
    }
    return sum;
  }
}
