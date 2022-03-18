package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061022 Primes of the form abbbbb... where a and b are digits.
 * @author Georg Fischer
 */
public class A061022 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z prime = super.next();
      final String sp = prime.toString();
      if (sp.length() >= 3) {
        final char sp1 = sp.charAt(1);
        if (sp.charAt(0) != sp1) {
          if (sp.substring(1).matches(sp1 + "+")) {
            return prime;
          }
        }
      } else {
        return prime;
      }
    }
  }
}
