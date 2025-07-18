package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A385893 extends Sequence0 {

  private long mN = 39;

  private long f(final long n) {
    final long r = n % 3;
    if (r <= 1) {
      return (2 * n + r) / 3;
    } else {
      return (7 * n + 1) / 3;
    }
  }

  @Override
  public Z next() {
    if (mN == 0) {
      return null;
    }
    mN = f(mN);
    final Z res = Z.valueOf(mN);
    if (mN == 39) {
      mN = 0; // terminates
    }
    return res;
  }
}
