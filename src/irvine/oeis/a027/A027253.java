package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026780;

/**
 * A027253 Sum of squares of numbers in row n of array T given by A026780.
 * @author Sean A. Irvine
 */
public class A027253 extends A026780 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).square());
    }
    return sum;
  }
}
