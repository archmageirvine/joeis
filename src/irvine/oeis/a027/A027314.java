package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026323;

/**
 * A027314 a(n) is the sum of squares of numbers in row n of array T given by A026323.
 * @author Sean A. Irvine
 */
public class A027314 extends A026323 {

  /** Construct the sequence. */
  public A027314() {
    super(0);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN + 2; ++k) {
      sum = sum.add(get(mN, k).square());
    }
    return sum;
  }
}
