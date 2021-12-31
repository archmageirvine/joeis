package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053580 Primes whose digits contain circles.
 * @author Sean A. Irvine
 */
public class A053580 implements Sequence {

  private static final char[] DIGITS = {'0', '6', '8', '9'};
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 4);
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < s.length(); ++k) {
        sb.append(DIGITS[s.charAt(k) - '0']);
      }
      sb.append('9');
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
