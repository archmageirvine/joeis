package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048890 Primes that yield a different prime when rotated by 180 degrees.
 * @author Sean A. Irvine
 */
public class A048890 extends A000040 {

  private static long[] INVERT = {0, 1, -1, -1, -1, -1, 9, -1, 8, 6};

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z p = super.next();
      if (p.mod(10) != 0) {
        Z t = p;
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
        if (!upsideDown.equals(p) && upsideDown.isProbablePrime()) {
          return p;
        }
      }
    }
  }
}

