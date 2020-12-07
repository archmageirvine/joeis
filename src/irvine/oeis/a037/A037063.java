package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A037063 Smallest prime containing exactly n 5's.
 * @author Sean A. Irvine
 */
public class A037063 implements Sequence {

  private static final char[] LAST = {'1', '3', '7', '9'};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return mN == 0 ? Z.TWO : Z.FIVE;
    }
    final String fives = StringUtils.rep('5', mN);
    // Try adding one last digit
    for (final char last : LAST) {
      final Z t = new Z(fives + last);
      if (t.isProbablePrime()) {
        return t;
      }
    }
    // At least two digits must be added
    // Try adding zero or one digit with an extra trailing digit
    for (int pos = 0; pos < fives.length(); ++pos) {
      for (char digit = '0'; digit <= '4'; ++digit) {
        if (pos != 0 || digit != '0') {
          final String v = fives.substring(0, pos) + digit + fives.substring(pos);
          for (final char last : LAST) {
            final Z t = new Z(v + last);
            if (t.isProbablePrime()) {
              return t;
            }
          }
        }
      }
    }
    // Try adding a digit 6 .. 9
    for (int pos = fives.length(); pos > 0; --pos) {
      for (char digit = '6'; digit <= '9'; ++digit) {
        final String v = fives.substring(0, pos) + digit + fives.substring(pos);
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
