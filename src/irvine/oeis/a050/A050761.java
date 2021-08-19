package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A050761 Numbers k such that the decimal expansion of the k-th Fibonacci number contains no pair of consecutive equal digits (probably finite).
 * @author Sean A. Irvine
 */
public class A050761 extends A000045 {

  private long mN = 0;
  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      Z t = super.next();
      Z r = Z.NEG_ONE;
      do {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (qr[1].equals(r)) {
          continue outer;
        }
        r = qr[1];
        t = qr[0];
      } while (!t.isZero());
      return Z.valueOf(mN);
    }
  }
}

