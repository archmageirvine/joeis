package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057372 Numbers k that can be expressed as k = w + x = y*z with w*x = y^3 + z^3 where w, x, y, and z are all positive integers.
 * @author Sean A. Irvine
 */
public class A057372 extends Sequence1 {

  private long mN = 63;

  private boolean is(final long n) {
    final Z k = Z.valueOf(n);
    for (final Z y : Jaguar.factor(k).divisors()) {
      if (k.square().subtract(y.pow(3).multiply(4)).subtract(k.divide(y).pow(3).multiply(4)).isSquare()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
