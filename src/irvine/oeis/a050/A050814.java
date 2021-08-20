package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A050814 Primes p such that inserting any even digit between adjacent digits produces a prime number while inserting any odd digit produces a composite number, or vice versa.
 * @author Sean A. Irvine
 */
public class A050814 extends A000040 {

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      boolean zeroCase = false;
      for (char insert = '0'; insert <= '9'; ++insert) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int k = 1; k < s.length(); ++k) {
          sb.append(insert).append(s.charAt(k));
        }
        if (insert == '0') {
          zeroCase = new Z(sb).isProbablePrime();
        } else {
          final boolean pr = new Z(sb).isProbablePrime();
          final boolean odd = (insert & 1) == 1;
          if (odd != zeroCase ^ pr) {
            continue outer;
          }
        }
      }
      return p;
    }
  }
}
