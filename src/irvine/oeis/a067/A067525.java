package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067180.
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
