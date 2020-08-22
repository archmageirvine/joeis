package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031142 Position of rightmost 0 (including leading 0) in 2^n increases.
 * @author Sean A. Irvine
 */
public class A031142 extends A031140 {

  @Override
  protected int positionRightMostZero(Z n) {
    int pos = 0;
    while (!Z.ZERO.equals(n)) {
      final Z[] qr = n.divideAndRemainder(Z.TEN);
      if (Z.ZERO.equals(qr[1])) {
        return pos;
      }
      n = qr[0];
      ++pos;
    }
    return pos; // leading 0
  }
}

