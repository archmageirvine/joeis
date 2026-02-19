package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A083820 Primes in which odd positioned digits are prime and even positioned digits are composite. The least significant digit is taken to be the first digit.
 * @author Sean A. Irvine
 */
public class A083820 extends A000040 {

  private boolean is(Z p) {
    boolean s = true;
    while (!p.isZero()) {
      final Z[] qr = p.divideAndRemainder(Z.TEN);
      if (qr[1].isZero() || qr[1].isOne() || qr[1].isProbablePrime() != s) {
        return false;
      }
      s = !s;
      p = qr[0];
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
