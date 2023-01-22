package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061116 Numbers coprime to each of their decimal digits.
 * @author Sean A. Irvine
 */
public class A061116 extends Sequence1 {

  private long mN = 10;

  private boolean is(final long n) {
    long m = n;
    while (m != 0) {
      final long r = m % 10;
      if (r == 0) {
        return false;
      }
      if (LongUtils.gcd(n, r) > 1) {
        return false;
      }
      m /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
