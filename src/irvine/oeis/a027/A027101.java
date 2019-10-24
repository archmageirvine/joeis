package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027101 <code>a(n) =</code> diagonal sum of right justified array T given by <code>A027082</code>.
 * @author Sean A. Irvine
 */
public class A027101 extends A027082 {

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
