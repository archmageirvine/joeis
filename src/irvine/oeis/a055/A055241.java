package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055241 Smallest base in which n is not divisible by any of its digits (0 if no such base).
 * @author Sean A. Irvine
 */
public class A055241 extends Sequence1 {

  private long mN = 0;

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
    ++mN;
    for (long base = 2; base < mN; ++base) {
      if (!is(mN, base)) {
        return Z.valueOf(base);
      }
    }
    return Z.ZERO;
  }
}
