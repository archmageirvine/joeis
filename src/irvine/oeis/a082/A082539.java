package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A082539 Primes p such that there is no prime q, q &lt; p with q+1 dividing p+1.
 * @author Sean A. Irvine
 */
public class A082539 extends A000040 {

  private boolean is(final Z p) {
    for (final Z d : Jaguar.factor(p.add(1)).divisors()) {
      final Z s = d.subtract(1);
      if (!s.equals(p) && s.isProbablePrime()) {
        return false;
      }
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
