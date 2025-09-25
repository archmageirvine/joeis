package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080603 Primes such that deleting some digit yields a prime.
 * @author Sean A. Irvine
 */
public class A080603 extends A000040 {

  private boolean is(final Z p) {
    final String s = p.toString();
    if (s.length() > 1) {
      for (int k = 0; k < s.length(); ++k) {
        if (new Z(s.substring(0, k) + s.substring(k + 1)).isProbablePrime()) {
          return true;
        }
      }
    }
    return false;
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
