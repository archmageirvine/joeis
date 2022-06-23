package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A057630 Primes such that replacing each digit d with d copies of the digit d produces a prime. Zeros are allowed.
 * @author Sean A. Irvine
 */
public class A057630 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < s.length(); ++k) {
        final char c = s.charAt(k);
        sb.append(StringUtils.rep(c, c - '0'));
      }
      if (sb.length() > 0 && new Z(sb).isProbablePrime()) {
        return p;
      }
    }
  }
}
