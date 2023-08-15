package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065092 Primes with property that when written in base two complementing any single bit yields a composite number.
 * @author Sean A. Irvine
 */
public class A065092 extends A000040 {

  {
    super.next(); // 2
  }

  private boolean is(final Z p) {
    Z a = Z.ONE;
    do {
      a = a.multiply2();
      if (p.xor(a).isProbablePrime()) {
        return false;
      }
    } while (a.compareTo(p) < 0);
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
