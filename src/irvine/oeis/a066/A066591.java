package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066591 Primes which can be expressed as a concatenation of squares.
 * @author Sean A. Irvine
 */
public class A066591 extends A000040 {

  private boolean is(final Z n) {
    if (n.isZero()) {
      return true;
    }
    Z m = Z.ONE;
    while (m.compareTo(n) <= 0) {
      m = m.multiply(10);
      final Z[] qr = n.divideAndRemainder(m);
      if (qr[1].isSquare() && is(qr[0])) {
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

