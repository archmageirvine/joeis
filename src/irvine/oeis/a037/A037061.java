package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A037061 Smallest prime containing exactly n 4's.
 * @author Sean A. Irvine
 */
public class A037061 extends Sequence0 {

  private static final char[] LAST = {'1', '3', '7', '9'};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    final String fours = StringUtils.rep('4', mN);
    // Try adding one last digit
    for (final char last : LAST) {
      final Z t = new Z(fours + last);
      if (t.isProbablePrime()) {
        return t;
      }
    }
    // At least two digits must be added
    // Try adding zero or one digit with an extra trailing digit
    for (int pos = 0; pos < fours.length(); ++pos) {
      for (char digit = '0'; digit <= '3'; ++digit) {
        if (pos != 0 || digit != '0') {
          final String v = fours.substring(0, pos) + digit + fours.substring(pos);
          for (final char last : LAST) {
            final Z t = new Z(v + last);
            if (t.isProbablePrime()) {
              return t;
            }
          }
        }
      }
    }
    // Try adding a digit 5 .. 9
    for (int pos = fours.length(); pos > 0; --pos) {
      for (char digit = '5'; digit <= '9'; ++digit) {
        final String v = fours.substring(0, pos) + digit + fours.substring(pos);
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
