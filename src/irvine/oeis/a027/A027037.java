package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027037 Diagonal sum of left-justified array T given by <code>A027023</code>.
 * @author Sean A. Irvine
 */
public class A027037 extends A027023 {

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
