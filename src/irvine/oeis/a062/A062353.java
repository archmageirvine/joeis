package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062353 Primes of the form bbbbba... where a and b are digits.
 * @author Georg Fischer
 */
public class A062353 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final String sp = prime.toString();
      final int splm1 = sp.length() - 1;
      if (splm1 >= 2) {
        final char sp0 = sp.charAt(0);
        if (sp.charAt(splm1) != sp0) {
          if (sp.substring(0, splm1).matches(sp0 + "+")) {
            return prime;
          }
        }
      } else {
        return prime;
      }
    }
  }
}
