package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A069246 Primes which yield a prime whenever a 1 is inserted anywhere in them (including at the beginning or end).
 * @author Sean A. Irvine
 */
public class A069246 extends A000040 {

  private boolean is(final String s) {
    for (int k = s.length(); k >= 0; --k) {
      if (!new Z(s.substring(0, k) + "1" + s.substring(k)).isProbablePrime()) {
        return false;
      }
    }
    return true;
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
