package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027100 Diagonal sum of left justified array T given by A027082.
 * @author Sean A. Irvine
 */
public class A027100 extends A027082 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN - k, k));
    }
    return sum;
  }
}
