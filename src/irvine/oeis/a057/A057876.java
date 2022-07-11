package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057876 Primes p with the following property: let d_1, d_2, ... be the distinct digits occurring in the decimal expansion of p. Then for each d_i, dropping all the digits d_i from p produces a prime number.  Leading 0's are not allowed.
 * @author Sean A. Irvine
 */
public class A057876 extends A000040 {

  static boolean is(final String s) {
    for (char d = '0'; d <= '9'; ++d) {
      final String t = s.replace(String.valueOf(d), "");
      if (s.equals(t)) {
        continue;
      }
      if (t.isEmpty() || t.startsWith("0") || !new Z(t).isProbablePrime()) {
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

