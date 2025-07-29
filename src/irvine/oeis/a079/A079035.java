package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079035 Squares, not ending in zero, in which all the digits occur in groups of 2 or more.
 * @author Sean A. Irvine
 */
public class A079035 extends Sequence1 {

  private static final Z Z100 = Z.valueOf(100);
  private long mN = 87;

  private boolean is(Z s) {
    if (s.mod(10) == 0) {
      return false;
    }
    while (!s.isZero()) {
      // Check last 2 digits are 00, 11, 22, ..., 99
      final Z[] qr = s.divideAndRemainder(Z100);
      final long r = qr[1].longValue();
      if (r % 11 != 0) {
        return false;
      }
      // Remove any further occurrences of the same last digit
      final long r10 = r % 10;
      s = qr[0];
      while (true) {
        final Z[] e = s.divideAndRemainder(Z.TEN);
        if (!e[1].equals(r10)) {
          break;
        }
        s = e[0];
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      if (is(s)) {
        return s;
      }
    }
  }
}
