package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055242 Largest base in which n is not divisible by any of its digits (0 if no such base).
 * @author Sean A. Irvine
 */
public class A055242 implements Sequence {

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
    for (long base = mN - 1; base > 1; --base) {
      if (!is(mN, base)) {
        return Z.valueOf(base);
      }
    }
    return Z.ZERO;
  }
}
