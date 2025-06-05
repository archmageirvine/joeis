package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A077652 Primes whose initial and terminal decimal digits are identical.
 * @author Sean A. Irvine
 */
public class A077652 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      if (s.charAt(0) == s.charAt(s.length() - 1)) {
        return p;
      }
    }
  }
}
