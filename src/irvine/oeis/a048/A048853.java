package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048853 Number of primes (different from n) that can be produced by altering one digit of decimal expansion of n (without changing the number of digits).
 * @author Sean A. Irvine
 */
public class A048853 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long cnt = 0;
    for (int pos = 0; pos < s.length(); ++pos) {
      final char c = s.charAt(pos);
      for (char replacement = pos == 0 ? '1' : '0'; replacement <= '9'; ++replacement) {
        if (replacement != c && new Z(s.substring(0, pos) + replacement + s.substring(pos + 1)).isProbablePrime()) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
