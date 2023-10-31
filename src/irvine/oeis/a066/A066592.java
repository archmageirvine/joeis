package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066592 Primes which can be expressed as concatenation of cubes.
 * @author Sean A. Irvine
 */
public class A066592 extends A000040 {

  private boolean is(final String p) {
    long k = -1;
    while (true) {
      final long s = ++k * k * k;
      final String t = String.valueOf(s);
      if (t.length() > p.length()) {
        return false;
      }
      if (p.equals(t)) {
        return true;
      }
      if (p.startsWith(t) && is(p.substring(t.length()))) {
        return true;
      }
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
