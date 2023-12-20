package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067525 Define I(n) = number obtained by incrementing each digit from 0 to 8 of n by 1. A '9' is replaced by a '0'. Sequence gives digitriangular numbers n*I(n)/2.
 * @author Sean A. Irvine
 */
public class A067525 extends Sequence1 {

  private long mN = 0;

  private long i(long n) {
    if (n == 0) {
      return 1;
    }
    long r = 0;
    while (n != 0) {
      r *= 10;
      r += (n + 1) % 10;
      n /= 10;
    }
    return r;
  }

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(i(mN)).divide2();
  }
}
