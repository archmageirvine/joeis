package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052191 Smallest multiple of n with no isolated digits.
 * @author Sean A. Irvine
 */
public class A052191 implements Sequence {

  private Z mN = Z.ZERO;

  static boolean isIsolatedDigit(Z s) {
    long prev = -1;
    while (!s.isZero()) {
      final Z[] qr = s.divideAndRemainder(Z.TEN);
      final long d = qr[1].longValue();
      s = qr[0];
      if (d != prev && s.mod(10) != d) {
        return true;
      }
      prev = d;
    }
    return false;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    while (true) {
      final Z s = mN.multiply(++k);
      if (!isIsolatedDigit(s)) {
        return s;
      }
    }
  }
}
