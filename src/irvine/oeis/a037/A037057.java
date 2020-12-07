package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A037057 Smallest prime containing exactly n 2's.
 * @author Sean A. Irvine
 */
public class A037057 implements Sequence {

  private static final char[] LAST = {'1', '3', '7', '9'};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.THREE : Z.TWO;
    }
    final String twos = StringUtils.rep('2', mN);
    // Try adding one last digit
    for (final char last : LAST) {
      final Z t = new Z(twos + last);
      if (t.isProbablePrime()) {
        return t;
      }
    }
    // At least two digits must be added
    // Try adding zero or one digit with an extra trailing digit
    for (int pos = 0; pos < twos.length(); ++pos) {
      for (char digit = '0'; digit <= '1'; ++digit) {
        if (pos != 0 || digit != '0') {
          final String v = twos.substring(0, pos) + digit + twos.substring(pos);
          for (final char last : LAST) {
            final Z t = new Z(v + last);
            if (t.isProbablePrime()) {
              return t;
            }
          }
        }
      }
    }
    // Try adding a digit 3 .. 9
    for (int pos = twos.length(); pos > 0; --pos) {
      for (char digit = '3'; digit <= '9'; ++digit) {
        final String v = twos.substring(0, pos) + digit + twos.substring(pos);
        for (final char last : LAST) {
          final Z t = new Z(v + last);
          if (t.isProbablePrime()) {
            return t;
          }
        }
      }
    }
    throw new UnsupportedOperationException();
  }
}
