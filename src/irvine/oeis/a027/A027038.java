package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027038 Diagonal sum of right-justified array T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027038 extends A027023 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN - k, 2 * mN - 3 * k));
    }
    return sum;
  }
}
