package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027615 Number of 1's when n is written in base -2.
 * @author Sean A. Irvine
 */
public class A027615 extends Sequence0 {

  private long mN = -1;

  private long a(final long n) {
    if (n == 0) {
      return 0;
    }
    if (n < 0) {
      return a((1 - n) >> 1) + (n & 1);
    } else {
      return a(-(n >> 1)) + (n & 1);
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(a(++mN));
  }
}
