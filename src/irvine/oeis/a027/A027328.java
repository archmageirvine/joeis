package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026120;

/**
 * A027328 a(n) is the sum of squares of the numbers in row n of array T given by A026120.
 * @author Sean A. Irvine
 */
public class A027328 extends A026120 {

  {
    setOffset(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = -1; k <= mN; ++k) {
      sum = sum.add(u(mN, k).square());
    }
    return sum;
  }
}
