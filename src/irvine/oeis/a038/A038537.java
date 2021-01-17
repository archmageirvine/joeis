package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038537 Primes base 10 that remain primes in eight bases b, 2&lt;=b&lt;=10, when the expansions are interpreted as decimal numbers.
 * @author Sean A. Irvine
 */
public class A038537 extends A000040 {

  private boolean isMultibasePrime(final Z p) {
    int c = 1;
    for (int base = 9; base >= 2; --base) {
      if (new Z(p.toString(base)).isProbablePrime() && ++c > 8) {
        return false;
      }
    }
    return c == 8;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (isMultibasePrime(p)) {
        return p;
      }
    }
  }
}
