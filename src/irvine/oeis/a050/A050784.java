package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A050784 Palindromic primes containing no pair of consecutive equal digits.
 * @author Sean A. Irvine
 */
public class A050784 extends A002385 {

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

