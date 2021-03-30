package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a008.A008851;

/**
 * A045953 Numbers n such that n^2 can be obtained from n by inserting an internal block of (contiguous) digits.
 * @author Sean A. Irvine
 */
public class A045953 extends A008851 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final String s = n.toString();
      final String s2 = n.square().toString();
      if (s2.length() == 1) {
        return n;
      }
      if (s.charAt(0) == s2.charAt(0)) {
        for (int k = 1; k < s.length(); ++k) {
          if (s.startsWith(s2.substring(0, k)) && s.endsWith(s2.substring(s2.length() - (s.length() - k)))) {
            return n;
          }
        }
      }
    }
  }
}
