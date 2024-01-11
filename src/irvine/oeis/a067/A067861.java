package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067861 n is prime and is the concatenation of numbers n_1, n_2, n_3, in that order, with n_1 - n_2 = n_3. (Do not allow leading zeros for nonzero n_i.).
 * @author Sean A. Irvine
 */
public class A067861 extends A000040 {

  private boolean is(final Z p) {
    final String s = p.toString();
    for (int k = 1; k < s.length() - 1; ++k) {
      final Z q = new Z(s.substring(0, k));
      final int lim = s.charAt(k) == '0' ? k + 1 : s.length() - 1;
      for (int j = k + 1; j <= lim; ++j) {
        if (s.charAt(j) != 0) {
          final Z r = new Z(s.substring(k, j));
          final String v = q.subtract(r).toString();
          if (s.substring(j).equals(v)) {
            return true;
          }
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
