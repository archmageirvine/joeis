package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054986 Base-10 modest numbers.
 * @author Sean A. Irvine
 */
public class A054986 implements Sequence {

  // After M. F. Hasler

  private long mN = 12;

  private boolean is(final long n) {
    long p = 1;
    while (n > (p *= 10)) {
      final long r = n % p;
      if (r != 0 && n % r == n / p) {
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
