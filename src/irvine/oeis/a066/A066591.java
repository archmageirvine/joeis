package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066591 Primes which can be expressed as a concatenation of squares.
 * @author Sean A. Irvine
 */
public class A066591 extends A000040 {

  private boolean is(final String p) {
    long k = -1;
    while (true) {
      final long s = ++k * k;
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
      final long r = p.mod(10);
      if ((r == 1 || r == 9) && is(p.toString())) {
        return p;
      }
    }
  }
}
