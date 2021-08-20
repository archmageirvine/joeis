package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A050785 Palindromes containing at least one pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050785 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z m = super.next();
      Z t = m;
      Z r = Z.NEG_ONE;
      do {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        if (qr[1].equals(r)) {
          return m;
        }
        r = qr[1];
        t = qr[0];
      } while (!t.isZero());
    }
  }
}

