package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068493 Primes which are concatenations of positive squares.
 * @author Sean A. Irvine
 */
public class A068493 extends A000040 {

  private boolean is(final Z n) {
    if (n.isZero()) {
      return true;
    }
    Z m = Z.ONE;
    while (m.compareTo(n) <= 0) {
      final Z t = m;
      m = m.multiply(10);
      final Z[] qr = n.divideAndRemainder(m);
      if (qr[1].compareTo(t) >= 0 && qr[1].isSquare() && is(qr[0])) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final long r = p.mod(10);
      if ((r == 1 || r == 9) && is(p)) {
        return p;
      }
    }
  }
}

