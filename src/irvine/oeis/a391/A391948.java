package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A391948 Primes p such that f(p) is prime and f(f(p)) = p, where f(k) = 10 * (10^(floor(log_10(k)) + 1) - 1)/9 - k.
 * @author Sean A. Irvine
 */
public class A391948 extends A000040 {

  private Z f(final Z n) {
    return Z.TEN.pow(CR.valueOf(n).log10().floor().add(1)).subtract(1).multiply(10).divide(9).subtract(n);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z f = f(p);
      if (f.isProbablePrime() && f(f).equals(p)) {
        return p;
      }
    }
  }
}
