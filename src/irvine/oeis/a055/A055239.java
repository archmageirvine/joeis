package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055239 Numbers which are not divisible by any of their digits in at least one base.
 * @author Sean A. Irvine
 */
public class A055239 extends Sequence1 {

  private long mN = 10;

  static boolean is(final long n, final long base) {
    long m = n;
    while (m != 0) {
      final long r = m % base;
      if (r != 0 && n % r == 0) {
        return true;
      }
      m /= base;
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long base = mN - 1; base > 1; --base) {
        if (!is(mN, base)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
