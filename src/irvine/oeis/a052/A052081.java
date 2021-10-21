package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052081 Numbers k such that k^2 is a square whose decimal expansion's digits are grouped together.
 * @author Sean A. Irvine
 */
public class A052081 implements Sequence {

  private Z mN = Z.NEG_ONE;

  static boolean isDigitsGrouped(Z n) {
    int seen = 0;
    long prev = -1;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      final long digit = qr[1].longValue();
      if (digit != prev) {
        final int bit = 1 << digit;
        if ((seen & bit) != 0) {
          return false;
        }
        seen |= bit;
        prev = digit;
      }
      n = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isDigitsGrouped(mN.square())) {
        return mN;
      }
    }
  }
}

