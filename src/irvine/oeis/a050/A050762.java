package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A050762 Fibonacci numbers containing no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050762 extends A000045 {

  {
    setOffset(1);
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z m = super.next();
      Z t = m;
      Z r = Z.NEG_ONE;
      do {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (qr[1].equals(r)) {
          continue outer;
        }
        r = qr[1];
        t = qr[0];
      } while (!t.isZero());
      return m;
    }
  }
}

