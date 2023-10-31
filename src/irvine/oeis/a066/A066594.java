package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066594 Primes which can be expressed as concatenation of powers of 3 and 0's.
 * @author Sean A. Irvine
 */
public class A066594 extends A000040 {

  private boolean is(final String p) {
    if (p.startsWith("0")) {
      return is(p.substring(1));
    }
    long k = 1;
    while (true) {
      final String t = String.valueOf(k);
      if (t.length() > p.length()) {
        return false;
      }
      if (p.equals(t)) {
        return true;
      }
      if (p.startsWith(t) && is(p.substring(t.length()))) {
        return true;
      }
      k *= 3;
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p.toString())) {
        return p;
      }
    }
  }
}
