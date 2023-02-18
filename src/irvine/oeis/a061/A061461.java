package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061461 Primes which produce primes when the leading digit is moved to the end.
 * @author Sean A. Irvine
 */
public class A061461 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final String s = t.toString();
      if (new Z(s.substring(1) + s.charAt(0)).isProbablePrime()) {
        return t;
      }
    }
  }
}

