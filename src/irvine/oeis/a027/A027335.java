package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026148;

/**
 * A027335 <code>a(n)</code> is the sum of squares of the numbers in row n of array T given by <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A027335 extends A026148 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long lim = mN < 2 ? mN : mN + 2;
    for (long k = 0; k <= lim; ++k) {
      sum = sum.add(get(mN, k).square());
    }
    return sum;
  }
}
