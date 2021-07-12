package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A048889 Composite numbers not ending in zero that yield a prime when turned upside down.
 * @author Sean A. Irvine
 */
public class A048889 extends A002808 {

  private static final long[] INVERT = {0, 1, -1, -1, -1, -1, 9, -1, 8, 6};

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z c = super.next();
      if (c.mod(10) != 0) {
        Z t = c;
        Z upsideDown = Z.ZERO;
        while (!t.isZero()) {
          final Z[] qr = t.divideAndRemainder(Z.TEN);
          final long y = INVERT[qr[1].intValue()];
          if (y < 0) {
            continue outer;
          }
          upsideDown = upsideDown.multiply(10).add(y);
          t = qr[0];
        }
        if (upsideDown.isProbablePrime()) {
          return c;
        }
      }
    }
  }
}

