package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a006.A006567;

/**
 * A048895 Bemirps: primes that yield a different prime when turned upside down with reversals of both being two more different primes.
 * @author Sean A. Irvine
 */
public class A048895 extends A006567 {

  private static long[] INVERT = {0, 1, -1, -1, -1, -1, 9, -1, 8, 6};

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z p = super.next();
      if (p.mod(10) == 1) {
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
          final Z rev = ZUtils.reverse(upsideDown);
          if (!p.equals(rev) && rev.isProbablePrime()) {
            return p;
          }
        }
      }
    }
  }
}

